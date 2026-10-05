# Java Cardio: Session 3

**Topics Covered:** Loops (for, while, do-while, nested), Conditionals (if/else)  


---

### Problem 1: BuzzFizz (For Loop + Conditionals)
**Concept:** for loop, if-else if-else, modulo operator

Write a program that prints numbers from 1 to 50. But:
- For multiples of 4, print "Buzz" instead of the number
- For multiples of 7, print "Fizz" instead of the number
- For multiples of both 4 and 7, print "BuzzFizz"

**Example Output:**
```
1
2
3
Buzz
5
6
Fizz
Buzz
...
BuzzFizz
...
```

---

### Problem 2: Countdown (While Loop + Conditionals)
**Concept:** while loop, if statements, decrement

Write a program that counts down from 30 to 1. But:
- If the number is divisible by 3, print "Beep" after the number
- If the number is divisible by 5, print "Boop" after the number
- If divisible by both, print "BeepBoop" after the number
- Otherwise, just print the number

**Example Output:**
```
30 BeepBoop
29
28
27 Beep
26
25 Boop
...
```

---

### Problem 3: Password Validator (Do-While Loop)
**Concept:** do-while loop, conditionals, String methods

Write a program that asks the user to enter a password. Keep asking until they enter a valid password. A valid password must:
- Be at least 8 characters long
- Contain the word "java" (case-insensitive)

**Hint:** Use `Scanner`, `.length()`, `.toLowerCase()`, `.contains()`

**Example Run:**
```
Enter password: hello
Invalid! Too short.
Enter password: goodbye
Invalid! Must contain 'java'.
Enter password: ilovejava
Valid password! Access granted.
```

---

### Problem 4: Multiplication Table (Nested For Loop)
**Concept:** nested for loops, formatting output

Write a program that prints a 7x7 multiplication table.

**Example Output:**
```
1  2  3  4  5  6  7
2  4  6  8  10 12 14
3  6  9  12 15 18 21
4  8  12 16 20 24 28
5  10 15 20 25 30 35
6  12 18 24 30 36 42
7  14 21 28 35 42 49
```

**Hint:** Use `System.out.print()` for same-line printing, `\t` for tabs

---

### Problem 5: Star Pyramid (Nested For Loop + Conditionals)
**Concept:** nested for loops, conditionals, pattern printing

Write a program that prints a pyramid of stars with 6 rows.

**Example Output:**
```
     *
    ***
   *****
  *******
 *********
***********
```

**Hint:** Each row has spaces, then stars. Row `i` has `(6-i)` spaces and `(2*i-1)` stars.

---

### Problem 6: Even Sum Finder (While Loop + Conditionals)
**Concept:** while loop, if statement, accumulator variable

Write a program that asks the user to enter numbers (one at a time). Keep asking until they enter -1 to stop. Then print:
- The sum of all even numbers entered
- How many even numbers were entered

**Example Run:**
```
Enter a number (-1 to stop): 5
Enter a number (-1 to stop): 8
Enter a number (-1 to stop): 12
Enter a number (-1 to stop): 3
Enter a number (-1 to stop): -1

Sum of even numbers: 20
Count of even numbers: 2
```

---

### Problem 7: Number Grid (Nested While Loop)
**Concept:** nested while loops, conditionals

Write a program that prints a 5x5 grid of numbers. The rules:
- If row number equals column number, print `X`
- If the sum of row + column is even, print `E`
- Otherwise, print `O`

**Example Output:**
```
X E O E O
E X E O E
O E X E O
E O E X E
O E O E X
```

**Hint:** Use nested while loops with counters for rows and columns

---

### Problem 8: Guessing Game (Do-While + Multiple Conditionals)
**Concept:** do-while loop, if-else if chain, random numbers (bonus)

Write a program where the computer picks a random number between 1 and 20. The user keeps guessing until they get it right. After each guess, tell them:
- "Too high!" if their guess is higher
- "Too low!" if their guess is lower
- "Correct! You got it in X tries!" when they guess right

**Here's how to get a random no in Java:** 
```java
import java.util.Random;
Random rand = new Random();
int secret = rand.nextInt(20) + 1;  // Random number 1-20
```

**Example Run:**
```
Guess a number (1-20): 10
Too low!
Guess a number (1-20): 15
Too high!
Guess a number (1-20): 13
Correct! You got it in 3 tries!
```

---

**Common Mistakes to Watch For:**
- Off-by-one errors in loop conditions
- Forgetting `input.nextLine()` after `nextInt()`  (Look up why this is important!)
- Infinite loops (missing increment/decrement)
- Wrong order in if-else conditions (checking "both" after checking individual conditions)

---

## Extension Challenges

For advanced students who finish early:

1. **Problem 1 - Modified:** Make it work for any range and any two numbers (user inputs the numbers)
2. **Problem 5 - Modified:** Let user choose pyramid size
3. **Problem 8 - Modified:** Add a limit of 5 tries, tell them if they run out of tries.
4. **Create your own:** Design a FizzBuzz variant with 3 numbers instead of 2

---
