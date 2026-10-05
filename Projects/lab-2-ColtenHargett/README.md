[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/LNmcjjcD)
# CS 266 - Week 3 Lab

### Summary
This lab will deepen your understanding of the Linux environment by introducing alias creation, bash_profile configuration, working with links, and managing file permissions. You will also practice basic `vim` commands to edit files effectively. By the end of this lab, you should be comfortable customizing your Linux shell and working with file attributes in a structured way.

---

### Task 1 (20 points)
**Practicing `vim` Commands**

1. Create a file named `vim_practice.txt` in your current directory using `vim`.
2. Perform the following `vim` commands and document what you learned the steps in `task1.txt`:
   - Enter `insert` mode and type the text: "Learning vim is fun!"
   - Save the file and exit `vim`.
   - Reopen the file and copy the text to a new line using the commands to copy a line and paste it.
       - Record the commands in the `task1.txt`
   - Delete the first line using keyboard shortcuts.
       - Record the commands in the `task1.txt`
   - Undo the deletion using keyboard shortcuts
       - Record the commands in the `task1.txt`
   - Replace the word "fun" with "awesome" using the search and replace command
       - Record the commands in the `task1.txt`
   - Save the file without exiting
       - Record the commands in the `task1.txt`
   - Exit `vim`.
3. Add the `task1.txt` file to your git repo.


---

### Task 2 (10 points)
**Creating Aliases**

1. Use the `script` command to record your session and store it in a file named `task2.txt`.
2. Create four aliases and add them temporarily (only for the current session):
   - `ll` for `ls -lah`
   - add the `-i` flag to the `rm` command
   - `gst` for `git status`
   - `cls` for `clear`
3. Verify that each alias works by running the respective commands.
4. Use the `alias` command to display all the aliases currently active in your shell.

---

### Task 3 (20 points)
**Configuring .bash_profile**

1. Navigate to your `$HOME` directory.
2. Open the `.bash_profile` file using `vim`.
3. Add the following configurations to your `.bash_profile`:
   - Add the four aliases you created in Task 1.
   - Add a welcome message that displays: `"Welcome to Linux, [YourName]!"` when you start a new terminal session. You can use `$USER` to get the current user.
4. Save and exit `.bash_profile`.
5. Reload your `.bash_profile` file using the `source` command. [Look it up if you're not sure.]
6. Verify that your aliases and custom prompt are active by running the respective commands.
7. Copy `.bash_profile` to your git repo.

---

### Task 4 (20 points)
**Working with Links**


1. Use the `script` command to record your session and store it in a file named `task4.txt`.
2. Create a new directory named `lab2_links` in your `$HOME` directory.
3. Add the line "This is the original file." to the file original.txt by using

    ``echo "This is the orignal file." >> original.txt``
4. Create a symbolic link named `symlink.txt` that links to `original.txt`.
5. Verify the links by:
   - Displaying the contents of all two files (`original.txt` and `symlink.txt`).
6. Check the contents of the file by using `cat`.
7. Modify the contents of the file by using

    ``echo "This is the linked file." >> symlink.txt``
8. Use cat on original.txt.
9. Delete `original.txt` and then try to open `symlink.txt`. What happens?
10. Create a new symbolic link named `symlink_broken.txt` pointing to a non-existent file and observe its behavior using `ls`.

---


### Task 5 (20 points)
**Managing File Permissions**

1. Use the `script` command to record your session and store it in a file named `task5.txt`.
2. In your current directory, create three files and one directory (using `touch` and `mkdir`).
    - `file1.txt` and `file2.txt` should be in your current directory
	- `file3.txt` should be in a directory named `task5`
3. Display the current permissions of all files in your directory using `ls -lR`.
4. Modify the file permissions as follows (you must use symbolic notation at least one and numeric notation at least once):
   - You want other people in your group to be able to collaboratively edit `file1.txt`, but no one outside the group can access it at all.
   - For `file2.txt`, only you can edit the file, but everyone can see its contents.
   - `file3.txt` can be edited by everyone, but the contents of the directory it is in cannot be seen by anyone but you. You have to know the file is there to be able to edit it (Hint: think about how read, write, and execute might relate to the things you can do with directories).
5. Display the updated permissions of all files in your directory using `ls -lR`.


---

### Submission & Reflection
1. Commit the text files (**task1.txt, task2.txt, .bash_profile, task4.txt, task5.txt**) to your GitHub repository.

2. Submit a reflection on Moodle as a word doc, on the following:
    - What concepts are you enjoying in Linux so far?
    - What concepts are you finding challenging?
    - What concepts would you like us to discuss in class further?
    - What was the most challenging part of this lab thus far?

3. Ensure that your reflection is more than a surface level discussion of the questions.


