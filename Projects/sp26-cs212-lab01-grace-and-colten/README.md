# Lab 0 -- A Greyhound Grocers Cashier.

**50 points**			

## Purpose:  
This assignment aims to give you experience with variables, and user input. It will also give you practice with IntelliJ/VSCode and GitHub.


## Problem: 
You are helping out at the newly opened Greyhound Grocers. A customer comes in to do some grocery shopping and would like to figure out how much it is going to cost.

Because the store is new, it doesn't have many items. Here is the list of items and their cost.

| Item              |  Price |
| :---------------- |  ----: |
| Cheerios    |  $3.49 |
| Peanut Butter           | $3.75 |
| Jelly    | $2.99 |
| Spaghetti |  $0.99 |
| Spaghetti Sauce |  $3.69 |
| Cannned Soup |  $1.99 |
| Macaroni and Cheese |  $1.00 |
| Reusable Bag |  $1.00 |


## Details:
Your program will print out the list of items and the cost. It then will ask the customer about their budget (U.S. Dollar in whole i.e. $25, $40,...). The next step is to go through the list and ask about the quantity of each item they would like to purchase. You can assume the customer will enter only integer values (it can be 0). For every 5 items, they will need to purchase a reusable bag for $1.00. For example, if they purchase 6 items. They will need 2 bags. 

After collecting the information for all items. Your program should calculate and output the total. (including the bag fee). If the total goes over their budget, tell them to go back with more money. Otherwise, thank them for shopping with Greyhound Grocers.

A sample run of the program may look like this:

```
Welcome to Greyhound Grocers.
Here is what we have in store:
------------------------------
Cheerios             $3.49 
Peanut Butter        $3.75
Jelly                $2.99
Spaghetti            $0.99
Spaghetti Sauce      $3.69
Canned Soup          $1.99  
Macaroni and Cheese  $1.00
Reusable Bag         $1.00
------------------------------

What is your budget?
20

How many Cheerios boxes do you want?
1
How many Peanut Butter jars do you want?
0
How many Jelly jars do you want?
2
How many Spaghetti boxes do you want?
0
How many Spaghetti Sauce cans do you want?
0
How many Canned Soups do you want?
3
Macaroni and Cheese boxes do you want?
0

------------------------------

Your total is $17.44

Thank you for shopping with Greyhound Grocers!!!



```

## Requirements:

 1. Complete a set of test cases (testcases.txt). You may use the included excel file help you with the calculation.
 2. Complete an algorithm or psuedocode before you program (algorithm.txt).
 3. Follow good programming practices including peer programming (When 1/2 the code is written, or 1/2 of class is over, switch drivers).
 4. Ensure your code meets all detailed requirements.
 5. Properly use variables (including ensuring the type is correct), input, math, and output.
 6. Use your test cases to test that your program works correctly. Fix any errors.


## Reminders: 

You will write your program in the "pair programming" mode: one of you is the driver while the other is the navigator.

1.  Make sure you *understand the problem* you are being asked to solve. What are the input(s), output(s), and calculation(s)?

2.  *Write Test Cases*: create a series of test cases in **testcases.txt** to use to determine that your program works correctly. Double check your test cases. Make sure they cover a wide range of cases. 

3.  *Complete the algorithm* in algorithm.txt. **Whoever didn't type the majority of the test cases, should type the algorithm** Your program should do ALL of the calculations for you, and it should work for ANY valid inputs. You do not need to do error checking, yet.

4.  *Code*: Your code should be in **Greyhound Grocers.java** and follow your algorithm to write your code. You may assume that your input will always be of the correct type. Whoever has done the least typing at this point should start as a driver.

5.  *Fix compiler errors*: Run your program and fix any errors that appear.

6.  *Test:* Once your code runs and you think it’s complete, test it using your test cases -- run, give the input value as input, and see if you get the right output. If not, you need to fix the error(s) in your code!

7.  Make sure you’ve created a human-readable essay (i.e. your program). Did you follow the code readability guidelines? If not, fix your code so that it is readable. You should have comments above each chunk of code!  Use white spaces to make your code more readable and lastly be consistent and considerate in naming your variables (**use camel Case style**)

8.  Include an updated version of the intro comments below at the very top of your .java file. Do not include the brackets `[` and `]` but replace them with what is asked for inside of them. Be sure to keep the titles at the start of each line. 
  ```
  # Programmers:  [your names here]
  # Course:  CS212
  # Due Date: 
  # Lab Assignment: 0
  # Problem Statement: [describe what task this program performs]
  # Data In: [list the type of information your user input requests]
  # Data Out:  [list the type of information output with print]
  # Credits: [Is your code based on an example in the book, in class, or something else?]
  ```

9.  Once you are done in lab, even if you haven’t finished the assignment yet, you need to Commit and Push your changes.




## What to Submit:

1. Commit & Push your repository to **GitHub**. It should include algorithm.txt, testcases.text and your .java with all code you write and the proper introductory comments at the very top. Remember to add comments throughout your code. Go to GitHub.com to check that it worked.


2. Each partner should independently write a short (around 200 words) **reflection** of what you learned in Lab 0, what you think about Java so far, and what it was like working with your partner. Submit to **Moodle** under the Lab 0 assignment. (**This is part of your participation grade**)







