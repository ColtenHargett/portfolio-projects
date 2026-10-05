# Lab 6 -- Sort Wars!
#### Selection, Insertion & Merge Sort algos go head to head

## Purpose
This lab will give students the opportunity to practice

* Command line arguments  
* Sorting
* Runtime analysis  

## Problem
You will write code to measure the performance of Selection, Insertion & Merge Sort.

## Requirements
We will discuss Merge Sort in a few weeks, the code for Merge Sort is given in Sort.java. 
- You can read more about Merge Sort [here](https://opendatastructures.org/ods-java/11_1_Comparison_Based_Sorti.html).
- You can visualize sorting algorithms [visualgo](https://visualgo.net/en/sorting)

1. Implement Selection and Insertion Sort in Sort.java. 
    - `Make sure they are static methods`.
2. Test your implementation in Main.java (i.e. print out the sorted array)
3. Find a large number N that will take Selection Sort around 1 second to finish.
4. Create a file named **times.txt**
5. Record the time it takes each sorting algorithm to finish for N, 2N, 4N, 6N and 8N (in second).
6. Create a file named **Analysis.md** and speculate about the **Big O complexity** of each sorting algorithm
7. Use the result in **times.txt** to create a graph (in Excel or Google Spreadsheet). 
    - x axis should be the size of the array, 
    - y axis is the time, make sure to use log scale. 
    - Export the graph to png or jpg format.
8. Add a few sentences to discuss whether the results support your speculation.
9. Bonus points if you include the graph in your analysis file.



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

3.  *Complete the design for your class* (**If applicable**) in **DESIGN.MD**. I need to see your design before you start coding. 

4.  *Code*: Your code should be in a **.java** file and follow your design/algorithm to write your code.

5.  *Fix compiler errors*: Run your program and fix any errors that appear.

6.  *Test:* Once your code runs and you think it’s complete, test it to see if it gets the right output. If not, you need to fix the error(s) in your code!

7.  Make sure you’ve created a human-readable essay (i.e. your program). Did you follow the code readability guidelines? If not, fix your code so that it is readable. You should have comments above each chunk of code!  Use white spaces to make your code more readable and lastly be consistent and considerate in naming your variables (**use camel Case style**)

8.  Once you are done in lab, even if you haven’t finished the assignment yet, you need to Commit and Push your changes.


## Submission
To GitHub, one per team:
1. *times.txt* containing the results.
2. *.png or .jpg* containing the graph
3. *Analysis.md* containing your speculation.
4. All of your code with javadoc.

To Moodle, one per person:
1. A short reflection addressing at least the following:  
    * What have you learned?  
    * Do you find this empirical lab helpful, why or why not?
    * How was it working with your partner?
