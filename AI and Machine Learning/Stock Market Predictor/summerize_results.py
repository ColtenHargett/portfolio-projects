import pandas as pd
from pathlib import Path


# reads all backtest csv files and builds a summary table
def summarize_backtests(results_folder="data"):
    results_path = Path(results_folder)

    # grab every csv that starts with backtest_
    csv_files = list(results_path.glob("backtest_*.csv"))

    summary_rows = []

    for file_path in csv_files:
        df = pd.read_csv(file_path)

        # pull ticker name from file name
        ticker = file_path.stem.replace("backtest_", "").upper()

        summary_rows.append({
            "ticker": ticker,
            "predictions": len(df),
            "model_mae": df["model_absolute_error"].mean(),
            "model_mape": df["model_absolute_percent_error"].mean(),
            "close_baseline_mae": df["close_baseline_absolute_error"].mean(),
            "close_baseline_mape": df["close_baseline_absolute_percent_error"].mean(),
            "high_baseline_mae": df["high_baseline_absolute_error"].mean(),
            "high_baseline_mape": df["high_baseline_absolute_percent_error"].mean(),
            "model_signed_error": df["model_dollar_error"].mean(),
            "model_median_abs_error": df["model_absolute_error"].median(),
        })

    summary_df = pd.DataFrame(summary_rows)

    # sort by model performance
    summary_df = summary_df.sort_values("model_mape").reset_index(drop=True)

    return summary_df


def main():
    summary_df = summarize_backtests()

    # save the summary
    summary_df.to_csv("data/backtest_summary.csv", index=False)

    print(summary_df)
    print("\nSummary saved to data/backtest_summary.csv")


if __name__ == "__main__":
    main()