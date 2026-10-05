# CS 312 Lab #0 - Getting Started with Linux terminal and Git

## Problem
Write a program to introduce yourself.

## Goals
1. Practice Linux commands
2. Practice coding with a text editor (**vi**)
3. Practice compiling and running a Java program
4. Practice using Git commands

## Directions
*	Follow instructions in [LINUX.md](LINUX.md)
*	On your browser
	*	Click the “Code” button on the right side.
 	* Select SSH
 	* Copy the URL provided:
		*	NOTE: It should be something like git@github.com:hbui-cs312-f26/...      
* On the terminal (mobaxterm, putty,...):
     * use `cd` to get to your `cs312` directory
     * use `git clone` to get this lab (paste the copied url)
     * use `cd` to get to the lab directory
     * use `vi HelloWorld.java` to begin editing  
         * `i` to get to edit mode
         * `esc` to leave edit mode
         * `:w` to save
         * `:q` to quit
     * It should close vi and bring you back to the prompt
     	 * Compile your java file
         ```
         javac HelloWorld.java
         ```
         * If there is a compilation error, use `vi` to fix the comilation error, then recompile
         * To run your program
       ```
		java HelloWorld
       ```

Your code should have the following:
 
1. Add the following comment to the top of your source code

```java
/**
* This is our code! Its goal is to practice with Linux and Git.
* CS 312 - Lab 0
* @author YOURNAME
* @version 1.0 DATE
*/
```

2. Add **println** statement to print out a clever/unique fact about yourself. It could be where you are from, your favorite food, sports, movies, songs..., and/or what you did this summer...

On the terminal, assuming you are still in the lab directory

 * Compile (`javac HelloWorld.java`) and run (`java HelloWorld`) Fix any errors if needed.
 * Edit your program until you are satisfied
 * Commit and push HelloWorld.java to GitHub:
 	* `git add HellowWorld.java`
 	* `git commit -m "add header and println"`
 	* `git push`



## Submission
To GitHub:

1.	Your complete HellowWorld.java
2.	A brief reflection (assume you are still in the lab directory):
	1.	Create a text file using **vi**:
	2. `vi reflection.txt`
	3. Include what you learned, if anything.
	4. Whether doing this sort of experimenting is helpful or a waste of time and why.
	5. `git` add/commit/push to GitHub

