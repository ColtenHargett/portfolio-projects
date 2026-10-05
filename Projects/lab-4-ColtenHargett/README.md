[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/AXQlghe8)
# CS 266 - Week 5 Lab

## Summary

Students will practice:
1. conditional execution in bash scripts
2. looping
3. command line arguments 
4. user input variables
5. File globbing

---

## Task 1 ( 20 points)

Write a script named **task1.sh**. This script should print out the number of command line arguments passed to it. Depending on the number of arguments, it should do different things:

1. If there are 3
   1. print "It's a magic number"
2. Otherwise, if there are less than 3
   1. print "More power!"
3. Otherwise,
   1. print "Too much!"

---

## Task 2 ( 20 points)

Write a script named **task2.sh** that checks whether a file exists.

1. The script should take a filename as a command-line argument.
2. If the file exists and is not a directory
   1. print `"File exists!"`
3. Otherwise if the file is a directory
   1. print `"It's a directory"`
3. Otherwise, 
    1. print `"File not found!"`


## Task 3 ( 15 points)

Write a script named **task2.sh**. This script should echo whatever the user types in until the user types "stop".

---

## Task 4 ( 15 points)

Write a script named **task4.sh** that prints numbers from 1 to 5 using a `for` loop.

---

## Task 5 ( 30 points)

Write a script named **task5.sh**.

The script should:

1. Change to the directory passed in as the first argument.
2. For each file in the directory whose file name ends with the second argument
   1. Echo the name of the file
   2. Use `head -1` to print the first line of the file.
   3. Use `tail -1` to print the last line of the file.


### Examples
- `./task5.sh . .txt` - Stays in the current directory and prints the first and last line of every .txt file
- `./task5.sh src py` - prints the first and last line of every file that ends with py

---


## Submission

1. Add and commit your scripts to GitHub.
2. Add a **reflection.txt** addessing all the questions in the tasks above, as well as the following:
   - How are conditional statements similar and different from those in other programming languages?
   - Which parts of this lab were the most and least difficult or enjoyable?
   - What happens if you run scripts that require arguments without any arguments? What output do you expect?
   - How could you modify those script to print a custom message if no arguments are provided?
