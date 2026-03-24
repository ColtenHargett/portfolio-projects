import pandas as pd
import numpy as np
from sklearn.preprocessing import StandardScaler
from sklearn.neighbors import NearestNeighbors


# these are the features we use to compare market days
FEATURE_COLUMNS = [
    "daily_return",
    "high_close_spread",
    "low_close_spread",
    "volume_change",
    "ma_gap_5",
    "ma_gap_10",
    "ma_gap_20",
    "volatility_5",
    "volatility_10",
    "return_5",
    "return_10",
]


class SimilarityPredictor:
    def __init__(self, n_neighbors: int = 5, weighted: bool = True):
        # how many similar historical days to use
        self.n_neighbors = n_neighbors

        # scales all features so one column does not dominate the distance
        self.scaler = StandardScaler()

        # nearest-neighbor model for finding similar days
        self.model = NearestNeighbors(n_neighbors=n_neighbors)

        # stores the training dataframe after fitting
        self.df = None

    def fit(self, df: pd.DataFrame):
        # keep a copy of the dataframe for later lookups
        self.df = df.copy()

        # grab only the feature columns
        x = self.df[FEATURE_COLUMNS]

        # scale the feature values
        x_scaled = self.scaler.fit_transform(x)

        # fit the nearest-neighbor model
        self.model.fit(x_scaled)

    def predict_next_high(self, latest_row: pd.Series):
        # convert the latest row into a one-row dataframe so feature names stay intact
        latest_features = latest_row[FEATURE_COLUMNS].to_frame().T

        # scale the latest row using the training scaler
        latest_scaled = self.scaler.transform(latest_features)

        # find the nearest historical neighbors
        distances, indices = self.model.kneighbors(latest_scaled)

        # pull out the similar historical rows
        similar_cases = self.df.iloc[indices[0]].copy()

        # flatten the distance array
        distances = distances[0]

        # create weights so closer neighbors matter more
        # small epsilon prevents division by zero if a distance is extremely small
        epsilon = 1e-6
        weights = 1 / (distances + epsilon)

        # compute a weighted average of the next-day-high target
        predicted_pct = np.average(similar_cases["target_next_high_pct"], weights=weights)

        # convert the predicted percent into a predicted high price
        latest_close = latest_row["close"]
        predicted_high = latest_close * (1 + predicted_pct)

        # return the prediction and the supporting cases
        return {
            "predicted_pct": predicted_pct,
            "predicted_high": predicted_high,
            "similar_cases": similar_cases[
                ["date", "close", "high", "target_next_high_pct"]
            ],
            "distances": distances.tolist(),
            "weights": weights.tolist(),
        }