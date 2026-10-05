# Lab 02 -- Java ATM

**50 points**			

## Purpose:  

In this assignment, practice using flow controls (if-else-loop), input (Scanner), and output. 

## Problem: 
You will develop a program that acts as a smart ATM

## Details:
You work at a bank and your current project is to design and implement a new interface for a new generation of ATMs. Your task is to write a Java program to interact with a customer who wants to **deposit** to, **withdraw** from, and **check the balance** of their bank account. The interface needs to prompt for a customer name and print out a greeting message. It then asks the customer what he/she wants to do.

```
1. Deposit
2. Withdraw
3. Check Balance
4. Exit
```

Your program should be able to do the support:

1. A customer can make more than one transaction.
2. The interface needs to prevent the customer from **withdrawing** money if there is insufficient funds.
3. When the customer finishes, print out a summary of all transactions (total amount deposit or/and withdraw) and a thank you message.
4. At the end, remind them to take the receipt or check their email the confirmation.


## Requirements:

 1. Complete an algorithm or psuedocode before you program (algorithm.txt). **Show me your algorithm.txt before coding.**
 2. Complete a set of test cases (testcases.txt).
 3. Your entire program should be in **Main.java**
 3. Follow good programming practices including peer programming (When 1/2 the code is written, or 1/2 of classtime is over, switch drivers).
 4. Ensure your code meets all detailed requirements.
 5. Properly use variables (including ensuring the type is correct), input, math, and output.
 6. Use your test cases to test that your program works correctly. Fix any errors.
 7. Draw a flowchart for your algorithm. You may draw by hand or use a tool on the computer such as http://www.draw.io or Google drawing. Add the drawing to GitHub in png or pdf format. 

 ## Bonus:


## Quick note:
**This is the assumption about the opening balance**: store the balance in a variable named balance and initialize it to $212.90

## Bonus:
You can earn **5 additional points** if you use **switch/case** in your program.

**Only attempt this when everything else works**
 You can earn addtional bonus points by performing error checking when user enters their choice (1,2,3,4) i.e. entering a non-number will not crash your program. 


## Reminders: 

You will write your program in the "pair programming" mode: one of you is the driver while the other is the navigator.

1.  Make sure you *understand the problem* you are being asked to solve. What are the input(s), output(s), and calculation(s)?

2.  *Write Test Cases*: create a series of test cases in **testcases.txt** to use to determine that your program works correctly. Double check your test cases. Make sure they cover a wide range of cases. 

3.  *Complete the algorithm* in algorithm.txt. **Whoever didn't type the majority of the test cases, should type the algorithm** Your program should do ALL of the calculations for you, and it should work for ANY valid inputs. You do not need to do error checking, yet.

4.  *Code*: Your code should be in a **.java** file and follow your algorithm to write your code. You may assume that your input will always be of the correct type. Whoever has done the least typing at this point should start as a driver.

5.  *Fix compiler errors*: Run your program and fix any errors that appear.

6.  *Test:* Once your code runs and you think it’s complete, test it using your test cases -- run, give the input value as input, and see if you get the right output. If not, you need to fix the error(s) in your code!

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



## What to Submit:

1. Commit & Push your repository to **GitHub**, and drop the link to your repo in **Moodle**. It should include algorithm.txt and ..java with all code you write and the proper introductory comments at the very top. Remember to add comments throughout your code. Go to GitHub.com to check that it worked.

2. Submit your **flowchart** in pdf format to **GitHub**.

4. Submit your **test cases** to **GitHub** . Test cases should be based on control paths in your flowchart using boundary values (i.e. balance gets very low...).

3. Each partner should independently write a short (around 200 words) **reflection** of what you learned in Lab 2, what it was like working with if-else, loops and with their partner. Submit to **Moodle** under the Lab 2 assignment. (**This is part of your participation grade**)







