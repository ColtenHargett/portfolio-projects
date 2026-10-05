## How to use script to record your session
To start record your terminal session, run **script** with the filename you want to save your session to. When you done, use **exit** to stop.
The file will be saved where you started **script**

```
hdbui@ron:~$ script report.txt
Script started, file is report.txt
groups: cannot find name for group ID 6063
hdbui@ron:~$ pwd
/home/hdbui
hdbui@ron:~$ who
oakoch-paiz pts/0        2023-01-23 13:00 (10.232.10.10)
hdbui    pts/3        2023-01-23 14:51 (10.233.188.169)
hdbui@ron:~$ ls
a.c    class  cs366    hello.c	hello.o  http	      news.txt	  test.rsa	test.txt  typescript
a.out  cs266  grade.c  hello.i	hello.s  http.tar.gz  report.txt  test.rsa.pub	tmp	  work
hdbui@ron:~$ cd cs366
hdbui@ron:~/cs366$ ls
hdbui@ron:~/cs366$ cd ..
hdbui@ron:~$ cd class
hdbui@ron:~/class$ ls
cs266  cs366  cs371  cs410  note.txt
hdbui@ron:~/class$ ls -l
total 8
drwxrwxr-x  2 hdbui hdbui    6 Jan 20 13:42 cs266
drwxrwxr-x  5 hdbui hdbui   80 Jan 23 10:25 cs366
drwx--xr-x 34 hdbui hdbui 4096 Aug 18 12:29 cs371
drwx--xr-x  3 hdbui hdbui   45 Aug 18 12:31 cs410
-rw-r--r--  1 hdbui hdbui   41 Aug 18 12:31 note.txt
hdbui@ron:~/class$ cd ..
hdbui@ron:~$ exit
exit
Script done, file is report.txt
hdbui@ron:~$ 
```

## To copy file to your lab repository directory

Let's assume **task1.txt** is in your $HOME directory (i.e. /home/hdbui) and you are in the same directory and your lab repository directory is **/home/hdbui/cs266-lab0-hbui**


```
cp task1.txt /home/hdbui/hdbui/cs266-lab0-hbui

```