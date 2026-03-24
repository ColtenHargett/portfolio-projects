import pandas as pd
from similarity_model import SimilarityPredictor


# runs a backtest on one stock's featured dataframe
def backtest_similarity_model(featured_df: pd.DataFrame, n_neighbors: int = 5, min_train_size: int = 100):
    # list to store the results from every prediction
    results = []

    # loop through the dataframe
    # stop one row early because we need the next row to get the actual next-day high
    for i in range(min_train_size, len(featured_df) - 1):
        # training data is everything before the current row
        train_df = featured_df.iloc[:i].copy()

        # current row is the row we use to make a prediction
        current_row = featured_df.iloc[i]

        # next row contains the actual next-day result
        next_row = featured_df.iloc[i + 1]

        # create and fit the similarity model using only past data
        predictor = SimilarityPredictor(n_neighbors=n_neighbors)
        predictor.fit(train_df)

        # make the similarity-based prediction
        prediction = predictor.predict_next_high(current_row)

        # model prediction
        predicted_high = prediction["predicted_high"]

        # actual next-day high
        actual_high = next_row["high"]

        # -----------------------------
        # baseline 1: predict next high = today's close
        # -----------------------------
        baseline_close_high = current_row["close"]

        # -----------------------------
        # baseline 2: predict next high = today's high
        # -----------------------------
        baseline_today_high = current_row["high"]

        # -----------------------------
        # model errors
        # -----------------------------
        model_dollar_error = predicted_high - actual_high
        model_absolute_error = abs(model_dollar_error)
        model_percent_error = model_dollar_error / actual_high
        model_absolute_percent_error = abs(model_percent_error)

        # -----------------------------
        # close baseline errors
        # -----------------------------
        close_baseline_dollar_error = baseline_close_high - actual_high
        close_baseline_absolute_error = abs(close_baseline_dollar_error)
        close_baseline_percent_error = close_baseline_dollar_error / actual_high
        close_baseline_absolute_percent_error = abs(close_baseline_percent_error)

        # -----------------------------
        # high baseline errors
        # -----------------------------
        high_baseline_dollar_error = baseline_today_high - actual_high
        high_baseline_absolute_error = abs(high_baseline_dollar_error)
        high_baseline_percent_error = high_baseline_dollar_error / actual_high
        high_baseline_absolute_percent_error = abs(high_baseline_percent_error)

        # save all useful information
        results.append({
            "base_date": current_row["date"],
            "predicted_for_date": next_row["date"],
            "close": current_row["close"],
            "today_high": current_row["high"],
            "actual_high": actual_high,

            "model_predicted_high": predicted_high,
            "model_dollar_error": model_dollar_error,
            "model_absolute_error": model_absolute_error,
            "model_percent_error": model_percent_error,
            "model_absolute_percent_error": model_absolute_percent_error,

            "baseline_close_high": baseline_close_high,
            "close_baseline_dollar_error": close_baseline_dollar_error,
            "close_baseline_absolute_error": close_baseline_absolute_error,
            "close_baseline_percent_error": close_baseline_percent_error,
            "close_baseline_absolute_percent_error": close_baseline_absolute_percent_error,

            "baseline_today_high": baseline_today_high,
            "high_baseline_dollar_error": high_baseline_dollar_error,
            "high_baseline_absolute_error": high_baseline_absolute_error,
            "high_baseline_percent_error": high_baseline_percent_error,
            "high_baseline_absolute_percent_error": high_baseline_absolute_percent_error,
        })

    # return all backtest results as a dataframe
    return pd.DataFrame(results)