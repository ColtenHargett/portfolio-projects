# Java Cardio: Session 1
### Gas Trip Calculator

**Math, Input, and Output**

---

## Problem

Write a **Java program** that calculates the **cost of gas for a road trip**.

The program should work for **any valid input values** without modifying the code between runs.

---

## Program Description

Your program will:

1. Ask the user for:

   * Number of miles to travel
   * Miles per gallon (MPG)
   * Cost of gas per gallon
2. Calculate:

   * Gallons needed
   * Total cost of gas for the trip
3. Display the total cost to the user

Assume:

* Gas price is constant for the entire trip
* MPG is constant for the entire trip
* All numeric input is valid

---

## Required Formula

```
gallons_needed = miles / mpg
total_cost = gallons_needed * price_per_gallon
```

---

## Program Requirements

Your Java program must:

1. Use **variables** for all inputs and calculations
2. Use **Scanner** for user input
3. Perform all math **in code** (no hard-coded answers)
4. Output a **clearly labeled total cost**
5. Format the final cost to **two decimal places**
6. Follow good **code readability practices**

   * Meaningful variable names
   * Logical structure
   * Comments where appropriate

---

## Starter File Requirements

At the **top of your `.java` file**, include a header comment similar to the following (adapted for Java):

```java
/*
Programmers: Your names here
Course: CS212, Instructor Name
Due Date: 01/XX/2026
Lab Assignment: 1
Problem Statement: Calculates the cost of gas for a road trip
Data In: miles traveled, miles per gallon, gas price
Data Out: total gas cost
Credits: Class notes / zyBook / partner discussion
*/
```

---

## Testing

You should test your program using multiple values, including:

* Zero miles
* Miles less than MPG
* Miles greater than MPG
* Different gas prices

Make sure your output matches what you would calculate by hand.

---

## Submission

Submit **one GitHub repository link to Moodle** containing:

* Your completed `.java` file



