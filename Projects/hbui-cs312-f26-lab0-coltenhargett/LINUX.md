# About UNIX/LINUX

UNIX/LINUX is an operating system (OS) that allows simultaneous multiple users and multiple tasks. Linux finds its roots in Unix. The Linux workstations in DS130 and DS132 run a version of Linux called Ubuntu.

Your home directory is available no matter which machine you log onto. The Harry Potter themed Linux machines in the lab have names such as **hogwarts, hogsmede, draco, thorin, balin, dwalin, oin, gloin, fili, kili, ori, dori, bifur, and bofur**. There are other Linux machines on the network that may be logged onto remotely.

Most of these sit on desks of faculty or staff, or live as VMs in the machine room.

Our system administrator is Mr. George Hall. He manages user access and all software installation and maintenance. If you are having access problems, he can be reached by email at [ghall@loyola.edu](mailto:ghall@loyola.edu), jedigeorge#2424 on discord, or x2715.

**Your username and password:** If you are new to Linux at Loyola, your username is the same as your Loyola user name. Your initial password is your 7 character Loyola ID. Change it **now.**

# Connecting from another computer

Follow this guide to log in <https://github.com/hbui/connect-to-a-linux-machine/blob/main/README.md>


# Setting Up Your Linux Account

1. Log in to one of the potter boxes.
2. Set up your initial bash environment by doing the following
    ```
    cp /home/hdbui/shared/cs312/.bash_profile ~
    exit
    ```
3. Log back in, and do the following:
```
   cat ~/.bash_profile
   ls -l
   ll
   echo $CLASSPATH
```

5. The \`cat\` command prints out a file, so we have printed out .bash_profile. This file runs every time you log in to a potterbox. Notice that there is an “alias” that defines **ll** to be the same as **ls - l** . Further, notice that we have \`export\`ed CLASSPATH. When we echo $CLASSPATH it should include **junit**.
    1. If these things didn’t happen, get your instructor attention!
6. Set up a directory for the course (try ll after each command to see what happens):
    ```
    cd ~
    mkdir cs312
    chmod 700 cs312
    ```
   NOTE: Thelast command is what makes things private. We will talk details later, but every time you create a directory, you should \`chmod 700 _directory_\`. Failure to do so is a security problem.

# Setting up Git (On a potterbox AND/OR your own computer)

Git no longer allows you to use a password, so we need to create SSH keys to get assignments. If you have done this in CS 266/366, you don’t have to do it again. Skip to the the next step (Text editors)

1. Create a 4096 bit rsa key by typing:
```
ssh-keygen -t rsa -b 4096 -C "your_email@example.com"
```

Note: "your_email@example.com" is the email associated with your github account

1. Press Enter when prompted to ‘‘Enter a file in which to save the key...’’ (this saves it to default location).
2. Optionally, enter a passphrase and re-enter (I chose not to) and hit Return. (This will be the password to unlock your RSA key).
3. Enter the command:
    ```
    cat ~/.ssh/id_rsa.pub
    ```
4. Highlight and copy your public key (the text that just popped up on the screen)
5. Associate your SSH key with your GitHub account:
    1. Log into your GitHub account
    2. In the upper right, clock your icon and go to settings
    3. Find SSH and GPG Keys
    4. Click ‘‘New SSH Key’’
    5. Title it and paste the contents of ˜/.ssh/id_rsa.pub (the public key SSH you just copied)
    6. Click Submit
6. Configure your local git username and email:
   ```
   git config --global user.name "your github username"
   git config --global user.email "your github email"
   ```

# An aside about text editors

If you are going to work on the linux boxes, you’ll have to use one of these. I use vi, personally.

## gedit

Graphical and therefor a good go to. You might notice some slow down over a network connection. Quit by clicking the X button.

Edit file just by typing.

## emacs

Both graphical and -nw modes make this versatile. It is heavy weight and can do a lot of things for you (including auto indent). Quit with Ctrl-X Ctrl-C (save with Ctrl-X Ctrl-S).

Edit file just by typing.

Cheat sheet: <https://www.gnu.org/software/emacs/refcards/pdf/refcard.pdf>

## vi

Often there when nothing else is. Nicer navigation options than emacs, lighter weight too. Quit by making sure you are in command mode (hit esc) type :q (or :wq to save first). Won’t let you quit with unsaved changes.

Edit file by entering edit mode (hit i) and then start typing.

Cheat sheet: <http://www.atmos.albany.edu/daes/atmclasses/atm350/vi_cheat_sheet.pdf>

# Ensure Git Works by Cloning Lab0

1. Go back to lab0 repository and follow the instructions in README.md
