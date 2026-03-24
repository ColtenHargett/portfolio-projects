import pandas as pd


def add_features(df: pd.DataFrame) -> pd.DataFrame:
    df = df.copy()

    # clean column names
    df.columns = [str(col).strip().lower().replace(" ", "_") for col in df.columns]
    # basic daily movement
    df["daily_return"] = (df["close"] - df["open"]) / df["open"]
    df["high_close_spread"] = (df["high"] - df["close"]) / df["close"]
    df["low_close_spread"] = (df["close"] - df["low"]) / df["close"]

    # volume behavior
    df["volume_change"] = df["volume"].pct_change()

    # moving averages
    df["ma_5"] = df["close"].rolling(5).mean()
    df["ma_10"] = df["close"].rolling(10).mean()
    df["ma_20"] = df["close"].rolling(20).mean()

    # distance from moving averages
    df["ma_gap_5"] = (df["close"] - df["ma_5"]) / df["ma_5"]
    df["ma_gap_10"] = (df["close"] - df["ma_10"]) / df["ma_10"]
    df["ma_gap_20"] = (df["close"] - df["ma_20"]) / df["ma_20"]

    # volatility
    df["volatility_5"] = df["close"].pct_change().rolling(5).std()
    df["volatility_10"] = df["close"].pct_change().rolling(10).std()

    # multi-day returns
    df["return_5"] = df["close"].pct_change(5)
    df["return_10"] = df["close"].pct_change(10)

    # tomorrow's high compared to today's close
    df["target_next_high_pct"] = (df["high"].shift(-1) - df["close"]) / df["close"]

    # remove rows with missing
    df.dropna(inplace=True)

    return df
