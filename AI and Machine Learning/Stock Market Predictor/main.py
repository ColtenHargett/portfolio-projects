from fetch_data import fetch_and_save_stocks
from features import add_features
from backtest import backtest_similarity_model
import pandas as pd


def main():
    # ask the user for one ticker
    ticker = input("Enter a ticker symbol: ").strip().upper()

    # wrap it in a list
    symbols = [ticker]

    # download fresh stock data
    fetch_and_save_stocks(symbols)

    # read the csv
    df = pd.read_csv(f"data/raw/{ticker}.csv")
    df["date"] = pd.to_datetime(df["date"])

    # create features
    featured_df = add_features(df)

    # run the backtest
    results_df = backtest_similarity_model(
        featured_df=featured_df,
        n_neighbors=5,
        min_train_size=100
    )

    # save results
    results_df.to_csv(f"data/backtest_{ticker.lower()}.csv", index=False)
    print(f"Backtest results saved to data/backtest_{ticker.lower()}.csv\n")

    # print the first few rows
    print(results_df.head())

    # similarity model summary
    print("\nSimilarity model summary:")
    print(f"Predictions made: {len(results_df)}")
    print(f"Mean absolute error: {results_df['model_absolute_error'].mean():.2f}")
    print(f"Mean absolute percent error: {results_df['model_absolute_percent_error'].mean():.4%}")
    print(f"Average signed dollar error: {results_df['model_dollar_error'].mean():.2f}")
    print(f"Median absolute error: {results_df['model_absolute_error'].median():.2f}")

    # close baseline summary
    print("\nClose baseline summary:")
    print(f"Mean absolute error: {results_df['close_baseline_absolute_error'].mean():.2f}")
    print(f"Mean absolute percent error: {results_df['close_baseline_absolute_percent_error'].mean():.4%}")

    # today-high baseline summary
    print("\nToday-high baseline summary:")
    print(f"Mean absolute error: {results_df['high_baseline_absolute_error'].mean():.2f}")
    print(f"Mean absolute percent error: {results_df['high_baseline_absolute_percent_error'].mean():.4%}")


if __name__ == "__main__":
    main()
