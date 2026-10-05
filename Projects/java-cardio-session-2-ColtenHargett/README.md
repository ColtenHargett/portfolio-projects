# Java Cardio: Session 2

**Due:** Tuesday before lab

---

## Problem

Write a **Java program** that calculates how much a customer owes their mobile phone provider based on their subscription package and the amount of data used.

---

## Packages

The provider offers three subscription packages:

* **Package Green**

  * $49.99/month
  * Includes **2 GB** of data
  * Additional data: **$15 per GB**
  * **Coupon option:**

    * If the customer has a coupon **and** the bill is **$75 or more**, subtract **$20**

* **Package Blue**

  * $70.00/month
  * Includes **4 GB** of data
  * Additional data: **$10 per GB**

* **Package Purple**

  * $99.95/month
  * **Unlimited data**

There is **no rollover** of unused data.

---

## Program Behavior

Your program must:

1. Prompt the user for a **package name**
2. Prompt the user for **data used (in GB)**
3. Calculate the total monthly cost
4. Display **one final cost output**

---

## Input Rules

* If the user enters an **invalid package name**, display an error message and **keep prompting until a valid package is entered**
* Package names must be **case-insensitive**

  * Example: `green`, `GREEN`, and `gReEn` are all valid
* You may assume numeric input is valid (no need to catch input mismatch errors)

---

## Program Requirements

Your Java program **must** include:

1. **Only one print statement** that displays the final cost
2. **At least one logical boolean operator** (`&&`, `||`, or `!`)
3. Proper **currency formatting to two decimal places**

   * Use `System.out.printf` or `String.format`
4. A loop for **input validation**
5. Clean, readable code with appropriate comments

---

## Submission

Submit **one link on Moodle** that points to your GitHub repository which contains:

* Your Java source file (`.java`)
* Your algorithm

That’s it — no flowcharts, no test case spreadsheets.

---


* Give a **Java starter template**
* Convert this into a **pair-programming version**
