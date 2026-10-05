[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/o3MaIQaU)
# CS 266 - Week 10 Lab

## Overview
In this lab, you'll delve deeper into regular expressions with the `grep` command. 

## Task 1: Time Validation

The included file `time.txt` contains a list of times, but some of them are invalid! 

For our purposes, a "valid time" is 
1. a two digit number 00-12
2. a colon
3. a two digit number 00-59
4. am or pm

Write a regular expression with `grep` that finds all valid times in the file. 

**Output**: Save the command execution to `task1.txt` using the `script` command.

## Task 2: Palindrome finder

The file `/usr/share/dict/words` contains a list of words. Create a regular expression to find 7-letter palindrome words. 

**Hint:** a seven letter palindrome is whole word (remember the word flag from last week?) with:
1. a first letter
2. a second letter
3. a third letter
4. a fourth letter
5. the third letter again
6. the second letter again
7. the first letter again.

**Output**: Save the command execution to `task2.txt` using the `script` command.

## Task 3: Permissions checker

Create a pipe that uses `ls` and `grep` to find all of the files in this directory that can be read by "other".

**Output**: Test this by creating a few files with `touch` and setting some of them to have "other" read permission and some not to. 
Use the `script` command to create `task3.txt`, and then run `ls -l` once and then your permission checker pipe.

## Submission

- Add and commit all your files to GitHub.

- Add a reflection.txt containing:
    * How do you feel about regular expressions?
	* Are there expressions that you find more or less useful?
	* Which of the tasks above was the easiest or hardest?
	* Did the hint help or did it make Task 2 too easy?