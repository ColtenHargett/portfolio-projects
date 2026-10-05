[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/YL_rtq1w)

# CS 266 - Week 9 Lab
## Text Processing/Pattern Searching Commands (`grep`, `uniq`, `sort`, `tr`)

## Summary: 

Students will practice text-processing commands in Linux, specifically:

- Converting characters using `tr`
- Searching for patterns using `grep`
- Removing duplicate lines using `uniq`
- Sorting files and streams with `sort`

## Task 1: End of line characters

The file **windows.sh** was written on a Windows machine. Try to execute it on Linux and notice that it doesn't work (even though it looks okay in vi!). Investigate EOL (end of line) characters in Windows and Linux (i.e., search the web about it), and then use `tr` to translate `windows.sh` into *linux.sh* such that it works. Create **task1.txt** (without script!) to explain what was going on and how you fixed it.


---

## Task 2: Searching for Patterns with `grep`

You have been running some code that has generated *logfile.txt* (included in this repo). Now you have been asked to looks for certain things in the file. 

- Use the `script` command to create a script called **task2.txt**. 
- Use grep to search inside the file **logfile.txt** for the following:
    - Find all lines containing the word "ERROR".
    - Perform a case-insensitive search for "warning".
    - Count all lines that do not contain "success" (case insensitive).

---

## Task 3: Searching for Patterns with `grep`

The directory `/home/class_projects/retrieval-data/docs` contains many files. Which of those files contains the word `plausible`? Use `script` to create **task3.txt** to display the command you used to get the answer.


---

## Task 4: Building aa filter pipe

In this task, we are going to build up a *single* pipeline to leverage the filters we have talked about in class to create a list of the top ten most frequent words in *global.txt*. Note: for each subtask, your answer should be a single (fairly long, I admit) piped command that builds on the commands from before.


### Subtask 4.1 Conversion

Create **task4.1.txt** with `script`. Create a pipe that starts with `cat global.txt`. From there, use one of the commands we have talked about in class to convert:
* spaces into newline characters
* uppercase letters into lowercase

### Subtask 4.2 Counting Words

Create **task4.2.txt** with `script`. Continue your pipe from 4.1. You should use the commands we talked about in class to count the number of times each unique word appears. **Hint:** you may need to use two of the commands we talked about in this step.

### Subtask 4.3 Orginizing the count

Create **task4.3.txt** with `script`. Continue your pipe from 4.2. You should use the commands we talked about in class to sort the word frequency from highest to lowest.

### Subtask 4.4 Limiting the count

Create **task4.4.txt** with `script`. Finish your pipe from 4.3. Use a command to limit the number of lines printed to be only the top 10. You should now have one long pipe that performs this task.

---



### Submission

- Add and commit all your files to GitHub.

- Add a reflection.txt containing:
    * Which command did you find the most useful?
    * What was the most challenging part of the lab?
    * How can these commands be used in automation?