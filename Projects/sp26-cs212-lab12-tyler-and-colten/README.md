# Lab 12 - A SORTS of TREES

## Purpose
To give you a chance to practice:
1. Trees
2. Binary Search Trees
3. Recursion

## Description
You have a list of words that you need to alphabetize. You know that your sorted list from the last lab could do it, but
it's just too slow. You want to try a possibly more efficient approach.

## Requirements
Using the skeleton provided, complete the following in `Binary Search Tree`
* A default `constructor` that creates an empty tree
  
* `insert(String word)` should insert a string into the tree. The algorithm you use should be roughly the following:
  
  1. Set curr to root
  2. Set prev to null
  3. Set direction to "none"
  3. while curr is not null
     1. Set prev to curr
     2. If the word is less than the data in curr
        1. set curr to the left child
        2. Set direction to "left"
     3. otherwise
        1. set curr to the right child
        2. Set direction to "right"
  4. if prev is null
     1. set root to a new node made from your word
  5. otherwise if direction in left
     1. set left child of prev to a new node made form your word
  6. otherwise
     1. set right child of prev to a new node made form your word
* `inOrder()` - follow the pattern provided by `preOrder()`
* `postOrder()` - follow the pattern provided by `preOrder()`

Complete Main by figuring out which traversal will print the tree out in alphabetical order.

## Theory
The order in which you insert things into this particular tree matters a lot. Draw (on paper or on your computer) what
the tree looks like if you insert the following words into your tree in the order provided:

* hippo
* dog
* snake
* cat
* fish
* duck
* goose
  
What is the height of this tree? What are the pre, in, and post order traversals?

Pick a different order of insertion and draw how your tree changes and give it's new height. Do the traversals change?

Give an order that produces a tree with the smallest possible height. Give an order that produces a tree with the 
largest height.

How the shape of the tree impact how quickly you can insert things into the tree?


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

3.  *Complete the design/al for your add method* in **algorithm.txt**. I need to see your design before you start coding. 

4.  *Code*: Your code should be in a **.java** file and follow your design/algorithm to write your code.

5.  *Fix compiler errors*: Run your program and fix any errors that appear.

6.  *Test:* Once your code runs and you think it’s complete, test it to see if it gets the right output. If not, you need to fix the error(s) in your code!

7.  Make sure you’ve created a human-readable essay (i.e. your program). Did you follow the code readability guidelines? If not, fix your code so that it is readable. You should have comments above each chunk of code!  Use white spaces to make your code more readable and lastly be consistent and considerate in naming your variables (**use camel Case style**)

8.  Once you are done in lab, even if you haven’t finished the assignment yet, you need to Commit and Push your changes.

## Submission
To GitHub, 1 per group:
1. All .java files needed for your code to function
2. Your pictures and answers to the questions in **Theory** section. You may need to upload these directly to GitHub.

To Moodle, 1 per person:
1. For participation credit, reflect on the following:
    * How are trees similar and dissimilar from linked lists?
    * Would you have liked to have spent more time on trees?
    * How comfortable are you drawing your code? Does it help you or is it too abstract?
    * Were you able to follow what the traversals were doing, or are they opaque still?
    * How was working with your partner?
