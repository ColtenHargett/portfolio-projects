# Java Cardio: Session 5

**Topics Covered:** Sorting Algorithms (Selection Sort, Insertion Sort), 2D Arrays

---

### Problem 1: Selection Sort with Statistics (Sorting)
**Concept:** selection sort, tracking comparisons and swaps, algorithm analysis

Write a program that:
1. Creates an `int` array: `{45, 23, 67, 12, 89, 34, 56, 78, 90, 11}`
2. Implements **selection sort** to sort it in ascending order
3. Tracks and prints:
   - How many **comparisons** were made (every time you check if one element is smaller than another)
   - How many **swaps** were made
   - The sorted array

**Example Output:**
```
Original: 45 23 67 12 89 34 56 78 90 11

Sorting with Selection Sort...
After pass 1: 11 23 67 12 89 34 56 78 90 45
After pass 2: 11 12 67 23 89 34 56 78 90 45
After pass 3: 11 12 23 67 89 34 56 78 90 45
...

Sorted: 11 12 23 34 45 56 67 78 89 90
Total comparisons: 45
Total swaps: 9
```

**Hints:**
- A comparison happens every time you use `<` or `>` to compare two array elements
- A swap only happens when `minIndex != i` — increment your swap counter only then
- Print the array after each pass of the outer loop to visualize the sorting process
- Use the code for selection sort and modify it to have counters/print statements

---

### Problem 2: Insertion Sort Implementation (Sorting)
**Concept:** insertion sort, shifting elements, building sorted portion

Write a program that:
1. Creates an `int` array: `{38, 27, 43, 3, 9, 82, 10}`
2. Implements **insertion sort** to sort it in ascending order
3. Prints the array after each insertion to show the growing sorted portion
4. Counts and prints how many **shifts** were made (each time you move an element one position)

**Example Output:**
```
Original: 38 27 43 3 9 82 10

Inserting 27: 27 38 43 3 9 82 10 (1 shift)
Inserting 43: 27 38 43 3 9 82 10 (0 shifts)
Inserting 3: 3 27 38 43 9 82 10 (3 shifts)
Inserting 9: 3 9 27 38 43 82 10 (4 shifts)
Inserting 82: 3 9 27 38 43 82 10 (0 shifts)
Inserting 10: 3 9 10 27 38 43 82 (5 shifts)

Sorted: 3 9 10 27 38 43 82
Total shifts: 13
```

**Hints:**
- Insertion sort builds the sorted portion on the left by taking each element and "inserting" it into its correct position
- Use a while loop to shift elements to the right until you find the correct spot
- The first element is already "sorted" — start your loop at index 1
- Each time you do `arr[j+1] = arr[j]` inside the while loop, that's one shift
- Use the code for insertion sort and modify it to have counters/print statements

> 🌟 **Stretch Goal — for those who finish early**
> Run both selection sort (Problem 1) and insertion sort (Problem 2) on an **already sorted** array like `{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}`. Which algorithm makes fewer operations? Why do you think that is?

---

### Problem 3: 2D Array Basics — Arcade Leaderboard (2D Arrays)
**Concept:** 2D array declaration, nested loops, row and column traversal

Create a 2D array representing scores for 4 players across 3 different arcade games. Hardcode the values (scores out of 100):
```
Player 1 (Alex):   85, 90, 78
Player 2 (Jamie):  92, 88, 84
Player 3 (Sam):    76, 81, 79
Player 4 (Riley):  88, 85, 91
```

Print:
- The entire leaderboard in a table format
- Each player's average score across all games
- The average score for each game (column average) 
- The overall arcade average

**Example Output:**
```
🎮 ARCADE LEADERBOARD 🎮
Player 1 (Alex):   85  90  78  | Average: 84.33
Player 2 (Jamie):  92  88  84  | Average: 88.00
Player 3 (Sam):    76  81  79  | Average: 78.67
Player 4 (Riley):  88  85  91  | Average: 88.00

Game Averages:
Game 1 (Pac-Man):      85.25
Game 2 (Space Invaders): 86.00
Game 3 (Donkey Kong):  83.00

Overall Arcade Average: 84.75
```

**Hints:**
- Declare the 2D array like this: `int[][] scores = {{85, 90, 78}, {92, 88, 84}, {76, 81, 79}, {88, 85, 91}};`
- `scores.length` gives you the number of rows (players), `scores[0].length` gives you the number of columns (games)
- Use nested loops: outer loop for rows (players), inner loop for columns (games)
- For column averages, flip the loop order — outer loop on columns, inner loop on rows

---

### Problem 4: 2D Array Search — Treasure Hunt (2D Arrays)
**Concept:** 2D array traversal, linear search in 2D, tracking positions

Create a 5x5 2D array filled with **random integers** from 1 to 50. Ask the user for a **treasure value** to search for.

Search the entire grid and:
- Print all positions `(row, col)` where the treasure is found
- If not found, say so
- Print how many treasures were found total

**Example Run:**
```
Treasure Map:
12  45  3   28  17
34  12  50  9   22
41  7   12  33  18
29  15  40  12  6
8   23  31  44  12

Enter treasure value: 12

Treasure found at (0, 0)
Treasure found at (1, 1)
Treasure found at (2, 2)
Treasure found at (3, 3)
Treasure found at (4, 4)

Total treasures found: 5

Enter treasure value: 99
Treasure 99 not found on the map.
```

**Hints:**
- Use Random Module
- Use nested loops to visit every position: `for (int row = 0; row < grid.length; row++)` then `for (int col = 0; col < grid[row].length; col++)`
- Track with a counter variable initialized to 0, increment it each time you find a match
- Print positions as you find them, don't store them in another array
- Use a `boolean` flag or check `if (count == 0)` after the loops to print "not found"

---

### Problem 5: Sorting Each Row of a 2D Array (Sorting + 2D Arrays)
**Concept:** combining sorting with 2D arrays, row-by-row operations

Create a 4x5 2D array with unsorted integers (hardcode values). Use **selection sort** to sort **each row independently** in ascending order. Print the array before and after sorting.

**Example Output:**
```
Original 2D Array:
64  25  12  22  11
90  3   47  85  19
33  15  28  9   41
72  56  38  61  44

Sorting each row...

Sorted 2D Array:
11  12  22  25  64
3   19  47  85  90
9   15  28  33  41
38  44  56  61  72
```

**Hints:**
- You'll need **three** loops total: an outer loop for each row, then the two loops for selection sort on that row
- Treat each row as a 1D array — `grid[row]` gives you the entire row
- You can reuse your selection sort code from Problem 1, just apply it to `grid[row]` instead of a standalone array
- To keep it clean, consider writing a helper method `sortRow(int[] row)` that takes a 1D array and sorts it

> 🌟 **Stretch Goal — for those who finish early**
> After sorting each row, find and print the **median value** of each row (the middle element after sorting). For rows with an even number of elements, print the average of the two middle elements.

---

**Common Mistakes to Watch For:**
- Confusing the number of comparisons with the number of swaps in sorting
- Off-by-one errors in insertion sort's while loop condition
- Mixing up `grid.length` (rows) with `grid[0].length` (columns)
- Forgetting to use `grid[row].length` for column count — each row could theoretically have different lengths (jagged arrays)
- Not initializing your shift/swap counters before the sorting loops

---

> 🌟 **Bonus Stretch Goal — Create Your Own**
> Write a program that creates a 6x6 2D array filled with random numbers from 1-100. Then:
> 1. Sort the **entire 2D array** as if it were one long 1D array (flatten it, sort it, then rebuild the 2D structure)
> 2. Use **insertion sort** for the sorting step
> 3. Print the array before and after sorting
> 
> **Hint:** You can "flatten" by copying all values into a 1D array, sorting that, then copying back into the 2D grid.
