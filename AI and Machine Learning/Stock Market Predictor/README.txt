# Stock Market Predictor

This project is a similarity-based forecasting system that predicts the next day’s high price of a stock using historical market data.

The goal of this project was not to “beat the market,” but to build a structured system that:
- collects and processes real stock data
- engineers useful features
- finds patterns in historical behavior
- evaluates predictions using backtesting

---

## Overview

The model works by comparing the current market conditions of a stock to similar days in the past.

Instead of training a traditional machine learning model, it uses a **nearest-neighbor approach**:
- each day is represented by a set of engineered features
- the system finds the most similar historical days
- it uses those past outcomes to estimate the next day’s high

This makes the model:
- simple to reason about  
- easy to debug and improve  
- grounded in actual historical behavior  

---

## Features

Each trading day is converted into a feature vector that captures price movement and trend information, including:

- Daily return (close vs open)
- High/close and low/close spread
- Volume change
- Moving average gaps (5, 10, 20 day)
- Short-term volatility
- Rolling returns

These features allow the model to compare “market conditions” rather than just raw prices.

---

## Prediction Method

For a given day:

1. Convert the day into feature space  
2. Find the most similar historical days  
3. Look at what happened the next day in those cases  
4. Estimate the next-day high as a weighted average  

The prediction is returned as:
- predicted next-day high
- percent above current close
- most similar historical examples

---

## Backtesting

The model is evaluated using rolling backtesting:

- Only past data is used to predict future values  
- Each day is treated as a real prediction scenario  
- Results are compared against simple baselines  

### Baselines used:
- Predict next high = today’s close  
- Predict next high = today’s high  

---

## Results

Across multiple stocks (AAPL, NVDA, AMD, GOOGL), the model consistently outperformed both baselines.

Typical performance:
- Mean absolute percent error: ~1%  
- Lower error than baseline methods across all tested tickers  
- Stable performance across different stocks  

This shows the model is capturing useful patterns in historical price behavior.

---

## Notes

This project is not meant to be used for real trading decisions.

It is an experiment in:
- forecasting
- data modeling
- and system design
