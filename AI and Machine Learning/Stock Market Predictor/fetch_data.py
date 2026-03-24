import pandas as pd
import yfinance as yf
from pathlib import Path


# downloads stock data for one ticker
def fetch_stock_data(ticker: str, period: str = "10y"):
    df = yf.download(ticker, period=period, progress=False, auto_adjust=False)

    # skips empty tickers
    if df.empty:
        print(f"Skipping {ticker}: no data found")
        return None

    # fixes indices
    df.reset_index(inplace=True)

    # fixes yfinance multi-index columns
    cleaned_columns = []
    for col in df.columns:
        if isinstance(col, tuple):
            cleaned_columns.append(str(col[0]).strip().lower().replace(" ", "_"))
        else:
            cleaned_columns.append(str(col).strip().lower().replace(" ", "_"))

    # impliment cleaned columns
    df.columns = cleaned_columns
    print("Cleaned columns:", df.columns.tolist())

    df["ticker"] = ticker
    return df


# downloads stock data
def fetch_and_save_stocks(symbols, output_dir="data/raw", period="10y"):
    # creates directory
    output_path = Path(output_dir)
    output_path.mkdir(parents=True, exist_ok=True)

    # gather data for each ticket
    for symbol in symbols:
        try:
            df = fetch_stock_data(symbol, period=period)

            if df is not None:
                df.to_csv(output_path / f"{symbol}.csv", index=False)
                print(f"Saved {symbol}")
        except Exception as e:
            print(f"Error with {symbol}: {e}")


def main():
    universe = pd.read_csv("data/us_equities.csv")

    # small test of 10
    symbols = universe["symbol"].head(10).tolist()

    fetch_and_save_stocks(symbols)


if __name__ == "__main__":
    main()
