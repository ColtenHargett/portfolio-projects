[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/8RnSPeia)
# CS 266 - Week 11 Lab

## Summary
For this lab, you will design solutions for a number of tasks using **sed**. You will need to make use of regular expressions in your solutions.


If you cannot complete a task. Include your best attempt and comments for partial credit.

## Task 1: Introduction to sed

### Objective
Learn basic operations using the `sed` command, specifically deleting lines and substituting strings.

#### 1.1: Line Deletion with sed
- **File**: `hello.sh`
- **Goal**: Provide a command that deletes every line that starts with a comment (`#`) in `hello.sh`.
- **Output**: Document the command in `task1.1.txt` using the `script` command.
- **Output**: Document the command in `task1.1.txt` using the `script` command.

#### 1.2: String Substitution with sed
- **File**: `myth.txt`
- **Goal**: Devise a command to replace every instance of the word "Zeus" in `myth.txt` with your own name.
- **Output**: Include the execution of this command in `task1.2.txt`.

## Task 2: Regular Expressions in sed

### Objective
Apply regular expressions within `sed` to perform complex text manipulations.

#### 2.1: XML Tag Removal
- **File**: `weather.xml`
- **Goal**: Use `sed` to design a command that removes all XML tags. Note that an XML tag always has the form <*tag*>. Where tag can be nearly anything (but not < or >).
- **Output**: Demonstrate your solution and save the command execution to `task2.1.txt` using the `script` command.

#### 2.2 Blank Line Removal
- **File**: `weather.xml`
- **Goal**: Use `sed` to design a command that deletes all blank lines.
- **Output**: Include the execution of this command in `task2.2.txt`.

#### 2.3 XML Cleanup
- **File**: `weather.xml`
- **Goal**: Use `sed` to design a command that deletes all blank lines AND removes all XML tags. You may do this in a single command or a set of piped commands.
- **Output**: Include the execution of this command in `task2.3.txt`.


## Task 3
The phone numbers of some students in the `gradebook.txt` are not in the correct format.

Design a **single** **sed** command (your command may have multiple actions) to make the necessary correction to the phone numbers.

The output of your command should look like this:



```
Hoang   Bui     738-323-1233    8/24/1984       Hanoi           B
Mary    Jane    545-286-3976    9/12/1998       Texas           A
Tom     Kane    594-123-1231    12/7/1999       Indiana         B
Mady    Prat    989-323-1843    7/23/1992       Idaho           C
David   Crocker 989-231-1238    4/13/1990       Maryland        C
Vince   Von     213-789-2137    4/29/1991       California      A
Maty    Tran    921-123-1233    1/14/1983       Illinois        A
Vic     Mary    752-293-8977    4/9/1982        Montana         D
Enid    Weiss   921-756-3834    12/3/1983       Iowa            A
Yasin   Hail    978-299-3296    2/4/1999        Indiana         B
Rayan   Stout   256-491-6652    4/6/1983        Texas           D
Nola    Bento   237-773-8206    10/15/1985      Alaska          B
Layla   Harold  566-830-7031    12/5/1982       Oregon          C
Safiy   Leal    713-237-2339    4/30/1988       Louisiana       A
Finnlay Prit    256-462-6272    4/12/2000       Florida         F
Najma   Best    821-373-6642    11/4/1989       Hawaii          A
Harold  Whyte   603-385-5314    10/23/1982      New Mexico      A
Kurtis  Herman  942-554-0794    4/12/2000       North Dakota    B
```

**Output**: Save the command execution to `task3.txt`.



### Submission

- Add and commit all your files to GitHub.

- Add a reflection.txt containing:
    * What was easiest/hardest in this lab?
	* Which sed actions seem most useful?
    * There were some commands we didn't talk about in class, but are on the notes sheet. Which of those commands might be used to mimic the behavior of:
	    * cat
		* tr
		* head/tail
		* grep
	* Where might you use sed in your future?