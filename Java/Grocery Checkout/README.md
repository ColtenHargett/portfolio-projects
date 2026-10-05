# Grocery Checkout

A cashier program for a small grocery store. It shows the store's items, asks how many of each the customer wants, adds the cost of reusable bags, and checks the total against the customer's budget.

Built with a classmate.

---

## Overview

```
Welcome to Greyhound Grocers!
Cheerios             $3.49
Peanut Butter        $3.75
...
What is your budget?
How many cheerios boxes do you want?
...
Your total cost is $18.90
Thank you for shopping with Greyhound Grocers
```

---

## How It Works

- Reads each quantity with a `Scanner` and keeps running totals for cost and item count.
- Charges for one reusable bag per 5 items, rounded up with integer math (`(items + 4) / 5`).
- Compares the final total to the budget and tells the customer if they're short.

---

## Running it

```
javac GreyhoundGrocers.java
java GreyhoundGrocers
```
