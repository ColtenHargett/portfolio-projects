[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/lxjleLd4)
# CS 266 - Week 12 Lab

## Summary
For this lab, you will design solutions for a number of tasks using **awk**. You will need to make use of regular expressions in your solutions.


If you cannot complete a task. Include your best attempt and comments for partial credit.



## Task 1 Conditional printing

The `movielens.csv` file has columns for user ID, movie ID, rating, and timestamp. The file has column headers and is comma seperated.

### Task 1.1

Create an `awk` command to print out every line with the user id `196`. Save the command into task1.1.txt.

### Task 1.2

Create an `awk` command to print out every line with the user id `196` **AND THE COLUMN HEADERS**. Save the command into task1.2.txt.

### Task 1.3

Create an `awk` command to print out every line with the user id `196` and the column header **BUT DO NOT PRINT THE TIMESTAMP**. Save the command into task1.3.txt.


## Task 2 Calculations

The `movies.csv` file has columns for release date, movie title, budget, domestic gross, and worldwide gross. The file has column headers and is comma seperated.

### Task 2.1

Create an `awk` command to print out only movies that do not have a 0 for domestic or worldwide gross (i.e., clean the data). Save the command into task2.1.txt.

### Task 2.2

Create an `awk` command to print out only movies that do not have a 0 for domestic or worldwide gross (i.e., clean the data). **For the remaining movies,** add a column that prints out the movie's profit (worldwide gross - budget). Include a new column header: "profit" on the first line. Save the command into task2.2.txt.

### Task 2.3

Create an `awk` command to print out the average profit (as calculated above) for all movies that do not have a 0 for domestic or worldwide gross. Save the command and answer into task2.3.txt.



### Submission

- Add and commit all your files to GitHub.

- Add a reflection.txt containing:
    * Which if these tasks was the most interesting.
	* Do you see a use for awk outside of this class?
	* Did you recognize task 2.2 as most of a 151 lab? 
	    * What do you think about the fact that you did it in one line?
