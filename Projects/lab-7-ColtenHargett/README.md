[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/dsnFSmnd)

# **CS 266 - Week 8 Lab**  

## **Summary**  

Students will practice:  
1. Performing numerical operations using `bc` and `$(( ))`  
2. Extracting and manipulating substrings in shell scripts  
3. Replacing parts of strings and determining string length  
4. Practicing with arrays

---

## **Task 1: Numerical Operations**  

Create a Bash script named **task1.sh**. The script should take **three** command-line arguments: **num1**, **op**, and **num2**.

### Subtask 1.1

The script should echo the result of performing **addition, subtraction, division, and mod** on the **first** and **third** arguments (i.e., **num1** and **num2**).

**Example**  
```
./task1.sh 10 XXX 5
Using $(( )):
Addition: 15
Subtraction: 5
Division: 2
Modulus: 0
```

### Subtask 1.2

The script should use `if` statements such that the second argument (**op**) is used to determine which mathematical operation is performed. 

### Subtask 1.3

Refractor your code such that the `if` statement determines only the text that is printed (e.g., "Addition", or "Subtraction"). The `$(( ))` should occur in only one place in your code.

### Subtask 1.4

Clean up your code such that you have a usage statement and comments.

### Example Final Runs

```
./task1.sh
Usage: ./task1.sh num1 op num2
num1 and num2 are itegers that will have op performed on them
```

```
./task1.sh 2 + 5
Addition:
7
```

---

## **Task 2: String Manipulation**  

Create a bash script **task2.sh** that accepts **one** command-line argument, **dir**.

### Subtask 2.1

Loop through every file in **dir** and echo the filename it to the screen.

### Subtask 2.2

Instead of printing out every file, print out only the part of the filename AFTER the `.` (i.e., the file extension, if any).

### Subtask 2.3

Do not print out any of the file extensions until the whole loop is complete. To do this, store each file extension into an array. Print out the entire array at the end of the script.

### Subtask 2.4

For each file you encounter, loop through the extension array and see whether its file extension already exists in the array. Add its extention only if it does not already exist.

### Subtask 2.5

Print out the total number of extensions added to the array.

### Subtask 2.6

Clean up your code such that if no directory is given, the current directory is used and a message is printed out. If the provided argument is not a directory, the program should quit with an appropriate message.

### Example Runs
If you have a directory named ~/testdir that contains the files `test1.txt`, `test2.txt`, `task1.sh`. Running `task2.sh ~/testdir` should look like: 
```
./task2.sh ./testdir
```
It should result in:
```
txt
sh
You have 2 unique extensions in ./testdir
```
`txt` should print and be counted only once despite being in two files.

Alternately, 

```
cd testdir
./task2.sh
No directory provided, using current working directory.
txt
sh
You have 2 unique extensions in .
```

Finally,

```
./task2.sh invaliddir
Error: ivalid dir is not a valid directory.
```

---

## **Submission**  

1. Add and commit your scripts to GitHub.  
2. Include a **reflection.txt** file with the following:  
   - What challenges did you encounter while implementing arithmetic operations and string manipulations?  
   - Which part of the lab was the most or least enjoyable?  
   - Why were you not asked to support multiplication of exponentiation?
   - In what ways did your write your code to support users that may be unfamiliar with its operation?
   

-------
