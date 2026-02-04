# NOTE - code is over commented on purpose for learning purposes
import requests
import pandas as pd
import io

NASDAQ_LISTED_URL = "https://www.nasdaqtrader.com/dynamic/symdir/nasdaqlisted.txt"
OTHER_LISTED_URL = "https://www.nasdaqtrader.com/dynamic/symdir/otherlisted.txt"


# returns the whole stock market listing
def get_listing(url: str, timeout: int = 30):
    # pulls the url data
    req = requests.get(url, timeout=timeout)
    # checks status before continuing
    req.raise_for_status()
    # returns the text as a string
    return req.text


# creates table from the listing
def read_delimited_pipeline(text: str):
    # creates a csv from text
    data_frame = pd.read_csv(io.StringIO(text), sep="|", dtype=str)
    # removes all empty rows
    data_frame = data_frame.dropna(how="all")
    # states the first column
    first_column = data_frame.columns[0]
    # removes the footer line
    data_frame = data_frame[~data_frame[first_column].astype(str).str.contains("File Creation Time", na=False)]
    # returns the data_frame as a csv
    return data_frame


# creates a filtered data frame of the nasdaq
def load_nasdaq_list():
    # list of column types to keep
    keep = ["Symbol", "Security Name", "Test Issue", "ETF"]
    # get text from listing and make data frame
    text = get_listing(NASDAQ_LISTED_URL)
    df = read_delimited_pipeline(text)

    # creates a copy of the columns classified as keep
    existing_columns = []
    for item in keep:
        if item in df.columns:
            existing_columns.append(item)
    df = df[existing_columns].copy()

    df = df.rename(columns={"Symbol": "symbol", "Security Name": "name",
                            "Test Issue": "test_issue", "ETF": "etf"})
    df["exchange"] = "NASDAQ"
    return df


# creates a filtered data frame of the other listing types
def load_other_list():
    # list of column types to keep
    keep = ["ACT Symbol", "Security Name", "Exchange", "Test Issue", "ETF"]
    # get text from listing and make data frame
    text = get_listing(OTHER_LISTED_URL)
    df = read_delimited_pipeline(text)

    # creates a copy of the columns classified as keep
    existing_columns = []
    for item in keep:
        if item in df.columns:
            existing_columns.append(item)
    df = df[existing_columns].copy()

    df = df.rename(columns={"ACT Symbol": "symbol", "Security Name": "name",
                            "Exchange": "exchange", "Test Issue": "test_issue",
                            "ETF": "etf"})
    return df


# builds the equities universe
def build_universe(exclude_etfs: bool = True, exclude_test_issues: bool = True):
    # loads data from listings
    nasdaq_df = load_nasdaq_list()
    other_df = load_other_list()
    # combines other and nasdaq
    universe = pd.concat([nasdaq_df, other_df], ignore_index=True)

    # cleans whitespace
    for column in ["symbol", "name", "exchange", "test_issue", "etf"]:
        if column in universe.columns:
            universe[column] = universe[column].astype(str).str.strip()

    # keeps non etf
    if exclude_etfs and "etf" in universe.columns:
        universe = universe[universe["etf"].str.upper().eq("N")]

    # keeps non test issue
    if exclude_test_issues and "test_issue" in universe.columns:
        universe = universe[universe["test_issue"].str.upper().eq("N")]

    # removes blanks
    universe = universe[universe["symbol"].notna() & (universe["symbol"] != "")]
    # removes duplicates
    universe = universe.drop_duplicates(subset=["symbol"], keep="first").reset_index(drop=True)

    return universe[["symbol", "exchange", "name", "etf", "test_issue"]]


def main():
    df = build_universe(exclude_etfs=True, exclude_test_issues=True)
    print(df.head(10))
    print("count:", len(df))
    df.to_csv("/Users/colten/PycharmProjects/StockMarketPredictor/data/us_equities.csv", index=False)
    print("Universe created")


main()
