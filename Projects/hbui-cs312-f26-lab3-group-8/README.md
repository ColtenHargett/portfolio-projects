# CS312 - Lab 3 - Empirical Complexity

## Goals
In this lab, you will practice:
* Big-O notation
* Working with Lists
* The Linux Command Line
* Creating graphs using gnuplot
## Context
You are a software developer working on an application that needs to manage a large and growing collection of data, for example, records of customer transactions, system events, messages, sensor readings, or records retrieved from a database.

In Java, there are multiple data structures that can be used to store the same information. Two common implementations of the `List` interface are `ArrayList` and `LinkedList`. Although they provide many of the same operations, the way they store data internally is very different. As a result, an operation that is efficient for one implementation may be much less efficient for the other.

Choosing the appropriate data structure can therefore affect the performance of a real software system, especially when the amount of data becomes large.

Suppose your development team is deciding whether to use an `ArrayList` or a `LinkedList` for a component that frequently:

* inserts new records at the beginning of a collection, and
* accesses records at different positions in the collection.

Rather than choosing based only on intuition, you have been asked to conduct a small performance investigation.

In this lab, you will act as the developer performing that investigation. You will experimentally measure how `ArrayList` and `LinkedList` behave as the amount of data increases, visualize the results, and relate your observations to the theoretical Big-O complexity of the operations.

The goal is to answer a practical software-engineering question:

**How does the choice of data structure affect the performance of an application as the amount of data grows?**
## Problem
Investigate the complexity of two collections we have been discussing in class: ArrayList and LinkedList by measuring insertion time and get time.

## Directions
1. Explore Inserting into the two types of List
    1. Edit `TimeTrialInsert.java`
        * Use Command Line Interface to get the value of N from the user
        ```java
            N = Integer.parseInt(args[0]);

        ```
        * Run your program like this after compilation if you want N to be 500
       ```
            java TimeTrialInsert 500
       ```
        
        * Add the following code to main in an appropriate place:
        
        ```java
        for(i=0; i<N; i++)
            l.add(0, Integer.valueOf(i));
        ```

        Hint: We are timing the add operations, so put the loop in between the start and end timer.
    2. Create a file called inserttimes.dat
        * Create a table of three columns: N ArrayList LinkedList.
    3. Find a value for N for which the ArrayList version takes about 2 seconds to complete. 

    5. Record the value of N and the time in the table under `ArrayList`
    6. Switch to using a LinkedList. For the same N, run it and record the time taken in the table.
    7. Add four more rows for 2N, 4N, 6N and 8N along with the time for each data structure.  (repeat steps 4 and 5)
    8. Generate a graph using the `plotting` instructions from below.
    9. Create a file called `Insert.md`
        * Include the following in the file:
            * The figure you generated (See [this example](https://www.markdownguide.org/basic-syntax/#images-1)] for how to include an image in your markdown document. You do not need the full URL, just a filename of the image will work.)
            * Speculation as to the complexity of inserting at the beginning of an ArrayList and a LinkedList.
            * How the graph supports what you have said.
            * Speculation as to the complexity of inserting at the end of an ArrayList and a LinkedList. Modify `TimeTrialInsert.java` and run it a few times to see whether the results support your speculation, record the results in this file (`Insert.md`).

1. Explore Getting data from the two types of List.
    1. Edit `TimeTrialGet.java`
        1. Use Command Line Interface to get the value of N from the user
        2. Add the following code to main in an appropriate place:
        ```java
        for(i=0; i<N; i++)
            l.add(0, Integer.valueOf(i));
        ```
        2. Add the following code later in main in an appropriate place:
        ```java
        int sum = 0;
        for(i=0; i<N; i++)
        {
           Integer it = l.get(i);
           sum += it;
        }
        ```
    2. Create a file called `gettimes.dat`
        * Create a table of three columns: N ArrayList LinkedList.
    3. Find a value for N for which the LinkedList version takes about 2 seconds to complete.
    4. Record the value of N and the time in the table under `ArrayList`
    5. Switch to using a LinkedList. For the same N, run it and record the time taken in the table.
    6. Add four more rows for 2N, 4N, 6N and 8N along with the time for each data structure. (repeat steps 4 and 5)
    7. Generate a graph using the `plotting` instructions from below.
    8. Create a file called `Get.md`
        * Include the following in the file:
            * The figure you generated. (See [this example](https://www.markdownguide.org/basic-syntax/#images-1)] for how to include an image in your markdown document. You do not need the full URL, just a filename will work.)
            * Speculation as to the complexity of getting data from an ArrayList/LinkedList.
            * How the graph supports what you have said.

## Plotting
1.  Assume the file times.dat is a file with whitespace seperated values on each line with a header:
```
N ArrayList LinkedList
x1 y1 z1
x2 y2 z2
x3 y3 z3
x4 y4 z4
x5 y5 z5
```
x1, x2 x3, x4 x5 are numbers with the values of N, 2N, 4N, 6N and 8N respectively.

y1,y2,y3,y4,y5 and z1,z2,z3,z4,z5 are the timing information you record.

2. Start gnuplot.
    * Type `gnuplot` in the command line
3. Tell gnuplot you have headers
    * Type `set key autotitle columnheader`
4. Plot column 1 against column 2 and column 1 against column 3
    * Type `plot "times.dat" using 1:2, "times.dat" using 1:3`
    * If you prefer a line graph: `plot "times.dat" using 1:2 with line, "times.dat" using 1:3 with line`
5. Make things look better
    * Type `set key top left` to move the legend to the top left
    * Type `set title "my new graph title"` to set the title to your new graph title (pick a descriptive title)
    * Type `set ylabel "my y label title"` to set your y label title (pick a good label)
    * Type `set xlabel "my x label title"` to set your x label title (pick a good label)
7. Tell gnuplot you'd like to made a png file
    * Type `set term png`
8. Tell gnuplot which filename to use
    * Type `set output "printme.png"` (where printme.png is the name of your file)
9. Plot it again to store into the png (see line 4)
10. Exit gnuplot
    * Type `exit`

NOTE: For more gnuplot options and examples, check out http://www.gnuplotting.org/plotting-data and https://alvinalexander.com/technology/gnuplot-charts-graphs-examples

## Submission
1. To GitHub:
    * Modified versions of your Java files, don't forget the file header
    * Markdown files with your results and analysis 
    * .dat files with your data
    * .png files with your graphs

2. Individually to Moodle:
    1. A brief reflection that includes:
        * What you learned, if anything.
        * What is the most challenging part of this lab?
        * Whether doing this sort of empirical study is helpful/interesting or a waste of time, and why.
        * How it was working with a partner doing this, and what sort of discussion you had with them.






