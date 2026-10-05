# Lab 03 — Buttery Lottery

**50 points**

## Purpose

In this lab, you will practice using **nested loops**, **flow control**, and **Java’s predefined classes**.

## Problem Overview

You are working for a lottery company. Your job is to write a Java program that simulates the **Quick Play** option on a lottery machine.

## What Your Program Must Do

1. **Ask the user for their full name**

   * The user may type extra spaces before or after their name.
   * Your program must handle this correctly.
   * When printing the final message, use **only the user’s first name**.

2. **Generate lottery tickets**

   * Generate **8 lottery tickets**.
   * Each ticket must contain **6 random numbers**.
   * Numbers must be between **1 and 69** (inclusive).
   * Use a **nested loop** to generate and print the tickets.
   * Any number less than 10 must be printed with a **leading zero** (example: `05`).
   * You must use ***Math.random()*** or **Random** class to generate the random numbers then use the **NumberFormat** class to format the output (number and prize money) properly.


3. **Output formatting**

   * Display all tickets clearly.
   * Print a friendly “Good luck” message using the player’s **first name**.
   * Display the estimated jackpot using the **NumberFormat** class to format money correctly.

4. ## Output:

The output of your program should look like this (Please refer to [this](https://docs.oracle.com/javase/8/docs/api/java/text/NumberFormat.html) if necessary:
```
CS 212 - Lab 3
This program generates 10 lottery tickets.
What is your name?     Aaliyah Jones   
Here are the ticket:
24 14 62 05 04 11
30 02 23 11 05 09
37 02 63 41 33 24
28 65 61 14 49 03
01 39 06 48 18 19 
43 01 63 59 36 22
04 15 36 30 44 08
64 38 49 67 37 12

-----------------
Good luck Aaliyah!
Estimated Jackpot:
$225,938,745
-----------------
```

## Required Java Tools

* `Math.random()` **or** `Random` class (for number generation)
* `NumberFormat` class (for formatting numbers and money)
* Nested loops (**required**)

## Requirements

* You must complete **algorithm.txt or pseudocode** *before* writing any Java code. Show the professor.
* If you code before finishing the algorithm, you will **not receive credit** for it.
* Follow good programming practices and **pair programming rules**.
* Use clear variable names (camelCase), comments, and whitespace.
* Your program should work for all valid inputs (no error checking required yet).

## Reminders: 

You will write your program in the "pair programming" mode: one of you is the driver while the other is the navigator.

1.  Make sure you *understand the problem* you are being asked to solve. What are the input(s), output(s), and calculation(s)?

3.  *Complete the algorithm* in algorithm.txt. **Whoever didn't type the majority of the test cases, should type the algorithm** Your program should do ALL of the calculations for you, and it should work for ANY valid inputs. You do not need to do error checking, yet.

4.  *Code*: Your code should be in a **.java** file and follow your algorithm to write your code. You may assume that your input will always be of the correct type. Whoever has done the least typing at this point should start as a driver.

5.  *Fix compiler errors*: Run your program and fix any errors that appear.

6.  *Test:* Once your code runs and you think it’s complete, test it to see get the right output. If not, you need to fix the error(s) in your code!

7.  Make sure you’ve created a human-readable essay (i.e. your program). Did you follow the code readability guidelines? If not, fix your code so that it is readable. You should have comments above each chunk of code!  Use white spaces to make your code more readable and lastly be consistent and considerate in naming your variables (**use camel Case style**)

8.  Include an updated version of the intro comments below at the very top of your .java file. Do not include the brackets `[` and `]` but replace them with what is asked for inside of them. Be sure to keep the titles at the start of each line. 
  ```
/*
  # Programmers:  [your names here]
  # Course:  CS212
  # Due Date: 
  # Lab Assignment:
  # Problem Statement: [describe what task this program performs]
  # Data In: [list the type of information your user input requests]
  # Data Out:  [list the type of information output with print]
  # Credits: [Is your code based on an example in the book, in class, or something else?]
*/
```

9.  Once you are done in lab, even if you haven’t finished the assignment yet, you need to Commit and Push your changes.
    ---
    
## Stretch Goal (complete after doing the ones above)
  **Generate prize-winning numbers**

   * Generate a **set of 6 random prize-winning numbers**.
   * Compare each number on the tickets with the prize-winning numbers.
   * Every time a ticket number matches **any** prize-winning number, the prize bounty **increases by a power of 2 (²)**.
   * The base prize amount is already stored in the `prize` variable.



## What to Submit:

1. Commit & Push your repository to **GitHub**. It should include algorithm.txt and ..java with all code you write and the proper introductory comments at the very top. Remember to add comments throughout your code. Go to GitHub.com to check that it worked.

2. Each partner should independently write a short (200 words) **reflection** of what you learned in Lab 3, what it was like working with Java classes and with their partner. What would you do differently Submit to **Moodle** under the Lab 3 assignment. (**This is part of your participation grade**)




