# Java Cardio: Session 4

**Topics Covered:** Classes & Arrays.

---
Answer ALL problems. You'll learn a lot doing this. 
Est. time to complete - 3 hours
The Rectangle, Student and BankAccount documents have been created for you. 

---
**Common Mistakes to Watch For:**
- Forgetting to create an object with `new` before calling its methods
- Confusing the class definition with the `main` method — only one class needs `main`
- Array index out of bounds — remember arrays go from index `0` to `length - 1`
- Using `==` to compare Strings instead of `.equals()`
- Off-by-one errors in selection sort's inner loop bounds

---

### Problem 1: Rectangles


Define a class called `Rectangle` with:
- Two `double` fields: `width` and `height`
- A constructor that takes `width` and `height` as parameters
- A method `area()` that returns the area
- A method `perimeter()` that returns the perimeter
- A method `describe()` that prints a summary

In your `main` method, create **three** Rectangle objects with different dimensions and call `describe()` on each.

**Example Output:**
```
Rectangle: 5.0 x 3.0 | Area: 15.0 | Perimeter: 16.0
Rectangle: 8.0 x 2.5 | Area: 20.0 | Perimeter: 21.0
Rectangle: 1.0 x 1.0 | Area: 1.0  | Perimeter: 4.0
```

**Hints:**
- Your `Rectangle` class and your `main` method will be in **separate classes** — define `Rectangle` outside of your main class
- Area = width × height. Perimeter = 2 × (width + height)
- In `describe()`, use `System.out.print()` or `System.out.println()` to print everything on one line with your chosen format (test them out and see which combinations get you what you're looking for).

---

### Problem 2: Student Class 


Define a class called `Student` with:
- Fields: `String name`, `int grade` (0–100)
- A constructor that takes both fields
- A method `getLetterGrade()` that returns a `String`: `"A"` (90+), `"B"` (80+), `"C"` (70+), `"D"` (60+), or `"F"` (below 60)
- A method `printReport()` that prints the student's name, numeric grade, and letter grade

In `main`, create at least **four** Student objects covering different grade bands and print their reports.

**Example Output:**
```
Name: Alice  | Grade: 95 | Letter: A
Name: Bob    | Grade: 82 | Letter: B
Name: Carlos | Grade: 71 | Letter: C
Name: Dana   | Grade: 58 | Letter: F
```

**Hints:**
- Use an `if / else if / else` chain in `getLetterGrade()` — check from highest to lowest so the conditions don't overlap.
- `getLetterGrade()` should **return** a String, not print it. Then call it inside `printReport()` to get the value you need
- Call `printReport()` from `main` — it's the only method you need to call per student

> 🌟 **Stretch Goal — for those who finish early**
> Add a `static` method `classAverage(Student[] students)` that takes an array of Student objects and returns the class average as a `double`. 
> 
> Create an array of your four students in `main` and print the result. 
> 
> Remember: `static` methods belong to the class, not to any one object — so you call it as `Student.classAverage(...)`, not on an instance.

---

### Problem 3: Array Basics — Rainfall Tracker 
**Concept:** array declaration and initialization, for loop over array, accumulator

Declare an `int` array of size 7 representing daily rainfall (in mm) for one week. Hardcode the values yourself — mix in some zeros for dry days.

Then write code to print:
- Each day's rainfall (Day 1, Day 2, etc.)
- The total rainfall for the week
- The average daily rainfall
- The number of dry days (rainfall == 0)

**Example Output:**
```
Day 1: 12mm
Day 2: 0mm
Day 3: 5mm
Day 4: 20mm
Day 5: 0mm
Day 6: 8mm
Day 7: 3mm

Total: 48mm
Average: 6.86mm
Dry days: 2
```

**Hints:**
- Declare your array like this: `int[] rainfall = {12, 0, 5, 20, 0, 8, 3};`
- Use a single `for` loop that does all the work in one pass — add to your total, check for zeros, all at once
- For the average, cast to `double` before dividing: `(double) total / rainfall.length`
- Print day numbers using `i + 1` since arrays are zero-indexed

---

### Problem 4: Array Max and Min Finder (Arrays)


Declare an `int` array of 8 numbers (hardcode them — use a mix of positives and negatives).

Write code to find and print:
- The **maximum** value and which index it's at
- The **minimum** value and which index it's at

**Do not use `Arrays.sort()` or any library sort method.** Use a loop.

**Example Output:**
```
Numbers: 4 -2 19 7 -8 3 15 1

Maximum: 19 at index 2
Minimum: -8 at index 4
```

**Hints:**
- Start by assuming the first element is both the max and the min, then loop from index 1 onward to challenge that assumption
- Keep two separate tracker variables: `maxVal`, `maxIndex`, `minVal`, `minIndex`
- Don't initialise `maxVal` to `0` — if all numbers are negative, `0` would be wrong. Use `arr[0]` instead

---

### Problem 5: User-Filled Array + Search (Arrays)


Ask the user to enter **6 integers** one at a time and store them in an array. After all values are entered, ask the user for a **search target**.

Search the array for the target:
- If found, print which index it's at
- If not found, say so
- If it appears more than once, print all indices where it appears

**Example Run:**
```
Enter 6 numbers:
Number 1: 10
Number 2: 25
Number 3: 10
Number 4: 7
Number 5: 42
Number 6: 10

Search for: 10
Found 10 at index: 0
Found 10 at index: 2
Found 10 at index: 5

Search for: 99
99 not found in the array.
```

**Hints:**
- Use a `boolean found = false` flag before your search loop, and set it to `true` whenever you find a match
- Don't `break` out of the loop early — you need to keep going to find all occurrences
- After the loop, check `if (!found)` to print the "not found" message
- You can run the search multiple times by wrapping it in a `do-while` that asks if they want to search again

---

### Problem 6: Array Reversal (Arrays)
**Concept:** array manipulation, swapping elements, for loop

Ask the user to enter **5 integers** into an array. Then **reverse the array in place** (without creating a second array) and print the reversed result.

**Example Run:**
```
Enter 5 numbers: 3 9 1 7 4

Original: 3 9 1 7 4
Reversed: 4 7 1 9 3
```

**Hints:**
- To swap two elements, you need a temporary variable: `int temp = arr[i]; arr[i] = arr[j]; arr[j] = temp;`
- Your loop only needs to run `length / 2` times — once the middle is reached, the rest is already done
- Print the array before and after using a helper loop so you can see both states

> 🌟 **Stretch Goal — for those who finish early**
> Extend your program to also find and print the second-largest number in the original array (before reversing). You've already solved max/min in Problem 5 — can you adapt that logic to track the top two values?

---


### Problem 7: BankAccount  (Classes)


Define a class called `BankAccount` with:
- Fields: `String owner`, `double balance`
- A constructor that takes `owner` and a starting `balance`
- A method `deposit(double amount)` that adds to the balance (reject if amount ≤ 0)
- A method `withdraw(double amount)` that subtracts from the balance — but print `"Insufficient funds."` if the balance would go negative
- A method `printBalance()` that prints the owner's name and current balance

In `main`, create **two** accounts and perform a mix of deposits, withdrawals, and balance checks — including at least one rejected withdrawal.

**Example Output:**
```
Alice's balance: $500.0
Depositing $200.0...
Alice's balance: $700.0
Withdrawing $900.0...
Insufficient funds.
Alice's balance: $700.0
```

**Hints:**
- In `withdraw()`, check `if (amount > balance)` before subtracting — don't let the balance go negative
- In `deposit()`, check `if (amount <= 0)` and return early (or print a warning) to reject bad inputs
- Each method should call `printBalance()` at the end so you can see the updated state after every action

>  **Stretch Goal — for those who finish early**
> Add a `transfer(double amount, BankAccount target)` method that withdraws from the current account and deposits into a target account in one step. Make sure it still respects the insufficient funds check — if the sender doesn't have enough, nothing should move.

---



> ### Bonus Problem 8 Stretch Goal — Create Your Own Class**
> 
> Write a `Scoreboard` class that holds an array of 5 integer scores. Give it a method to add a score, a method to print all scores, and a method to print them sorted from highest to lowest using selection sort. 
> Test it in `main` by adding five scores in any order and printing both the unsorted and sorted versions.