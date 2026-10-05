# Lottery Quick Pick

Simulates the Quick Pick button on a lottery machine: it generates 8 tickets of 6 random numbers and wishes the player luck.

Built with a classmate.

---

## Overview

```
What's your name?    Colten Hargett
Here are your tickets:
13 15 16 22 40 28
01 10 65 66 17 25
...
Good luck Colten!
Estimated Jackpot:
$225,938,745
```

---

## How It Works

- **Nested loops** build 8 tickets of 6 numbers each.
- **No repeats on a ticket:** a boolean array tracks which numbers from 1 to 69 have already been drawn.
- **Clean name handling:** extra spaces are trimmed and only the first name is used.
- **Formatting:** numbers are zero-padded (`07`), and the jackpot prints with commas.

---

## Running it

```
javac LotteryQuickPick.java
java LotteryQuickPick
```
