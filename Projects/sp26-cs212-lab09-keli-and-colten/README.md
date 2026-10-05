# Lab 9 -- Palindrome emordnilaP
			

## Purpose:  

This lab will give you practice with:
1. Recursive Method.
2. Reading File
3. ArrayList
4. Writing File

## Description

As you were browsing YouTube, you came across [Bob by Weird Al](https://www.youtube.com/watch?v=JUQDzj6R3p4). Naturally, this has gotten you interested in other palindromes and so you have decided to write a program to help you.

## Details

You are going to write a program to do the following:
1. Open a file (dictionary.txt).
2. While you still can read from that file  
    1. If the word from the dictionary is a palindrome  
        1. Add the word to a list of palindromes
3. Ask the user for a file name
4. Open the file
5. For each word in the palindrome list  
    a. write the word to the file
6. Close both files

## Requirements

Your program should follow the algorithm above.

You do not need any classes in this program aside from the Main class. You should still use method(s), but they should be static.

A word is a palindrome if it satisfies the following recursive definition. Otherwise, it is not.  
1. The word is either 0 OR 1 character long.  
2. The first and last letters are the same AND the rest of the word is a palindrome.  

Your palindrome checking code should follow this algorithm (i.e., it should be recursive).

## Design

Put the algorithm for your recursive method (DESIGN.md)


**Follow the format we used in class (Start with the base case, then the general case). Method's name, parameters, return type.**



## Testing help
Here are some palindromes (not case sensitive) that should be in your output file:
* A
* Ada
* deed
* rotor
* madam
* deified
* civic
* noon
* eye
* kayak


## Hint
There are tons of methods from the string class you can use [`here`](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html).


**Also, make sure to convert the string to lowercase before proceeding.**



## STYLE
You are expected to follow a consistent style. Pay particular attention to:

1. File headers: You should have a file header at the top of every file explaining the purpose and author of the file, describing input/output if any.
    It must start with (replace the bits in < >):  
    ```java
    /**
    * This is my code! It's goal is to <give purpose of file here>
    * CS 212 - Lab <#>
    * @author <Your Name> <Your partner name>
    * @version <a version number followed by a date>
    */
    ```
2. Variable names: use meaningful names in all camelCase style
3. Your code should have appropriate whitespace and avoid overly long line lengths.
4. Use clear documentation and careful formatting. Be consistent in the indentation and alignment of braces.
5. Every method in your class must have a header comment of the form (replace the bits in < > and only use the number of `@param` that are needed for your method):  
    ```java
    /**
    * <A one sentence description of the method, ending with a period.>
    * <Optional longer description if desired>
    *
    * @param  <first parameter name>  <purpose of the parameter>
    * @param  <second parameter name>  <purpose of the second parameter>
    * @return      <what is returned>
    */
    ```
6. Your code should have no compilation errors.
7. Use of git: use meaningful commit messages and commit after reasonable milestones (i.e., a function has been completed)
    * A single commit for the whole project is not a good use of git

## Reminders: 

You will write your program in the "pair programming" mode: one of you is the driver while the other is the navigator.

1.  Make sure you *understand the problem* you are being asked to solve. What are the input(s), output(s), and calculation(s)?

3.  *Complete the design for your class* in **DESIGN.MD**. I need to see your design before you start coding. 

4.  *Code*: Your code should be in a **.java** file and follow your design/algorithm to write your code.

5.  *Fix compiler errors*: Run your program and fix any errors that appear.

6.  *Test:* Once your code runs and you think it’s complete, test it to see if it gets the right output. If not, you need to fix the error(s) in your code!

7.  Make sure you’ve created a human-readable essay (i.e. your program). Did you follow the code readability guidelines? If not, fix your code so that it is readable. You should have comments above each chunk of code!  Use white spaces to make your code more readable and lastly be consistent and considerate in naming your variables (**use camel Case style**)

8.  Once you are done in lab, even if you haven’t finished the assignment yet, you need to Commit and Push your changes.


## Submission
To GitHub, one per team:
1. *DESIGN.MD* containing the design of your recursive method.
2. All of your code.

To Moodle, one per person:

* A reflection that answers at least the following questions:
  * Are you getting comfortable thinking recursively?
  * What is the most difficult part of this assignment?
  * What is the most useful thing you learn working on this assignment?
  * What was it like working with your partner?




