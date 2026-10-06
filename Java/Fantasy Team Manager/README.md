# Fantasy Team Manager

A command-line fantasy football draft tool. Browse a pool of real NFL players, draft your team, check simulated weekly scores, and save your roster to come back to later.

---

## Overview

The program loads 130+ players from a text file and lets you build a team through a simple menu:

```
=== FANTASY TEAM MANAGER ===
1. View Available Players
2. Draft a Player
3. View My Team
4. View Season Stats
5. Calculate Team Score
6. Save Team to File
7. Load Team from File
8. View Players Grouped by Position
9. Exit
```

Drafting moves a player out of the available pool and onto your roster, so nobody can be picked twice.

---

## How It Works

- **Player and Team classes** keep the data and the logic separate. A `Team` owns its roster and knows how to add, remove and total up its players.
- **ArrayLists** hold the available player pool and your roster.
- **A HashMap** groups players by position (QB, RB, WR, TE, K, DEF) so you can scout one position at a time.
- **A 2D array** builds a players × weeks stats table. Each weekly score is simulated around that player's season average.
- **File input/output** reads the player pool from `players.txt` and saves or loads your team from `saved_team.txt`.

---

## Files

- `Player.java` – a player's name, position and average points
- `Team.java` – a named roster with add, remove and scoring methods
- `Main.java` – file loading, the draft logic and the menu
- `players.txt` – the player pool (`name,position,points per game`)

---

## Running it

```
javac *.java
java Main
```
