# Java Build Day Project 2: Fantasy Sports Team Manager

## Time Breakdown
- **Brainstorm & Plan:** 10 minutes
- **Code:** Rest of Class (time ends at end of day)
- **Test & Peer Testing:** Next Class
- **Total:** 

---

## Project Overview
Build a Fantasy Sports Team Manager where you can draft players, view team stats, calculate total team scores, and 
save/load your team from files. Think of it like managing your own fantasy league team!

---

## Brainstorm Phase (5 minutes)

### Step 1: Understand the Requirements
You'll need to use **ALL** of these Java concepts:

✅ **Classes** - `Player` class and `Team` class  
✅ **ArrayList** - Store your roster and available players  
✅ **HashMap** - Map positions to players, quick player lookups  
✅ **2D Array** - Track player stats across multiple games/weeks  
✅ **File I/O** - Read player database, save/load your team  

### Step 2: Plan Your Data Structure

**Player Class should have:**
- Name
- Position (QB, RB, WR, TE, K, DEF for football OR PG, SG, SF, PF, C for basketball)
- Points per game
- Season stats

**Team Class should have:**
- Team name
- Roster (ArrayList of Players)
- Methods to add/remove players, calculate total score

### Step 3: Sketch Out the Menu
```
=== FANTASY TEAM MANAGER ===
1. View Available Players
2. Draft a Player
3. View My Team
4. View Season Stats (2D Array)
5. Calculate Team Score
6. Save Team to File
7. Load Team from File
8. Exit
```

**✓ Checkpoint:** Understand the requirements before coding!

---

## Coding Phase (45 minutes)

### Required Files & Setup

#### 1. **Create `players.txt` (Sample Data File)**
Create this file with at least 15 players:
```
Tom Brady,QB,25.5
Derrick Henry,RB,18.3
Tyreek Hill,WR,16.7
Travis Kelce,TE,14.2
Justin Tucker,K,9.5
49ers,DEF,12.8
Patrick Mahomes,QB,27.1
Christian McCaffrey,RB,20.4
Davante Adams,WR,15.9
...
```
**Format:** `Name,Position,AvgPointsPerGame`

---

### Required Components

#### 2. **Player Class** (Must Have)
```java
public class Player {
    // Instance variables
    private String name;
    private String position;
    private double avgPoints;
    
    // Constructor
    public Player(String name, String position, double avgPoints) {
        // Initialize variables
    }
    
    // Getters
    public String getName() { }
    public String getPosition() { }
    public double getAvgPoints() { }
    
    // toString method for easy display
    @Override
    public String toString() {
        return name + " (" + position + ") - " + avgPoints + " pts/game";
    }
}
```

#### 3. **Team Class** (Must Have)
```java
import java.util.ArrayList;

public class Team {
    private String teamName;
    private ArrayList<Player> roster;
    
    // Constructor
    public Team(String teamName) {
        this.teamName = teamName;
        this.roster = new ArrayList<>();
    }
    
    // Method to add player
    public void addPlayer(Player p) { }
    
    // Method to remove player
    public void removePlayer(String playerName) { }
    
    // Method to calculate total team score
    public double calculateTeamScore() { }
    
    // Method to display roster
    public void displayRoster() { }
    
    // Getters
    public ArrayList<Player> getRoster() { }
    public String getTeamName() { }
}
```

#### 4. **Main Program Class** (Must Have)

**Required Methods:**

**a) Load Players from File (File Input)**
```java
public static ArrayList<Player> loadPlayersFromFile(String filename) {
    ArrayList<Player> players = new ArrayList<>();
    try {
        Scanner fileScanner = new Scanner(new File(filename));
        while (fileScanner.hasNextLine()) {
            String line = fileScanner.nextLine();
            String[] parts = line.split(",");
            // Create Player object and add to ArrayList
        }
        fileScanner.close();
    } catch (FileNotFoundException e) {
        System.out.println("File not found!");
    }
    return players;
}
```

**b) Save Team to File (File Output)**
```java
public static void saveTeamToFile(Team team, String filename) {
    try {
        PrintWriter writer = new PrintWriter(filename);
        writer.println(team.getTeamName());
        for (Player p : team.getRoster()) {
            writer.println(p.getName() + "," + p.getPosition() + "," + p.getAvgPoints());
        }
        writer.close();
        System.out.println("Team saved successfully!");
    } catch (FileNotFoundException e) {
        System.out.println("Error saving file!");
    }
}
```

**c) Load Team from File**
```java
public static Team loadTeamFromFile(String filename) {
    // Similar to loadPlayersFromFile but creates a Team object
}
```

**d) Create HashMap for Position Grouping**
```java
public static HashMap<String, ArrayList<Player>> organizeByPosition(ArrayList<Player> players) {
    HashMap<String, ArrayList<Player>> positionMap = new HashMap<>();
    // Group players by their position
    // Example: "QB" -> [Tom Brady, Patrick Mahomes]
    return positionMap;
}
```

**e) Create 2D Array for Season Stats**
```java
public static void displaySeasonStats(Team team) {
    // Create a 2D array: rows = players, columns = weeks/games
    // Example: 5 players × 4 weeks of stats
    
    int weeks = 4;
    int numPlayers = team.getRoster().size();
    double[][] stats = new double[numPlayers][weeks];
    
    // Fill with simulated or random stats
    Random rand = new Random();
    for (int i = 0; i < numPlayers; i++) {
        for (int j = 0; j < weeks; j++) {
            Player p = team.getRoster().get(i);
            // Generate random score around their average
            stats[i][j] = p.getAvgPoints() + (rand.nextDouble() * 10 - 5);
        }
    }
    
    // Display the table
    System.out.println("\n=== SEASON STATS (Last 4 Weeks) ===");
    System.out.printf("%-20s", "Player");
    for (int w = 1; w <= weeks; w++) {
        System.out.printf("Week %d\t", w);
    }
    System.out.println();
    
    for (int i = 0; i < numPlayers; i++) {
        System.out.printf("%-20s", team.getRoster().get(i).getName());
        for (int j = 0; j < weeks; j++) {
            System.out.printf("%.1f\t", stats[i][j]);
        }
        System.out.println();
    }
}
```

**f) Main Menu Loop**
```java
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Player> availablePlayers = loadPlayersFromFile("players.txt");
    Team myTeam = new Team("My Team");
    
    boolean running = true;
    while (running) {
        // Display menu
        // Get user choice
        // Call appropriate methods
        
        switch (choice) {
            case 1: // View available players
                break;
            case 2: // Draft a player
                break;
            case 3: // View my team
                break;
            case 4: // View season stats (2D array)
                break;
            case 5: // Calculate team score
                break;
            case 6: // Save team
                break;
            case 7: // Load team
                break;
            case 8: // Exit
                running = false;
                break;
        }
    }
}
```

---

## Required Features Checklist

### Must Implement:

- [ ] **Player Class** with at least 3 instance variables
- [ ] **Team Class** with ArrayList of Players
- [ ] **ArrayList** to store available players and roster
- [ ] **HashMap** to organize players by position
- [ ] **2D Array** to display season stats (players × weeks)
- [ ] **File Input** - Read players from `players.txt`
- [ ] **File Output** - Save team to a file
- [ ] **File Input** - Load saved team from file
- [ ] **Menu system** with at least 6 options
- [ ] **Draft functionality** - Move player from available to team
- [ ] **Calculate total team score** (sum of all player averages)
- [ ] **Display methods** - Show available players, show team roster, show stats table

---

## Testing Phase (10 minutes)

### Self-Testing Checklist (4-5 minutes)

1. **File I/O Test:**
   - Does the program load `players.txt` correctly?
   - Can you save your team to a file?
   - Can you load the saved team back?

2. **Drafting Test:**
   - Draft 5-7 players
   - Verify they appear in "View My Team"
   - Check they're removed from available players

3. **HashMap Test:**
   - Organize players by position
   - Verify each position shows correct players

4. **2D Array Test:**
   - View season stats
   - Check the table displays properly (rows and columns aligned)

5. **Calculation Test:**
   - Calculate team score
   - Manually verify it's the sum of player averages

### Peer Testing (5-6 minutes)

**Swap with a partner and test:**
- [ ] Can you navigate the menu easily?
- [ ] Do all options work without crashing?
- [ ] Are the 2D stats displayed in a readable table?
- [ ] Does save/load preserve all team data?
- [ ] Give feedback on code organization and comments

---

## Grading Rubric (100 points)

| Component | Points |
|-----------|--------|
| **Player Class** properly defined with constructor, getters | 15 pts |
| **Team Class** with ArrayList roster and methods | 15 pts |
| **ArrayList** used to store players | 10 pts |
| **HashMap** organizes players by position | 15 pts |
| **2D Array** displays season stats table | 15 pts |
| **File Input** reads player database | 10 pts |
| **File Output** saves team to file | 5 pts |
| **Load Team** from file works correctly | 5 pts |
| **Menu system** functional and user-friendly | 5 pts |
| **Code quality:** Comments, organization, naming | 5 pts |

---

## Helpful Hints & Tips

### Import Statements You'll Need:
```java
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
```

### Sample Data for Testing
Create `players.txt` with these players (or make your own!):

**Football:**
```
Patrick Mahomes,QB,27.1
Josh Allen,QB,26.4
Lamar Jackson,QB,24.8
Christian McCaffrey,RB,20.4
Derrick Henry,RB,18.3
Saquon Barkley,RB,17.9
Tyreek Hill,WR,16.7
Davante Adams,WR,15.9
Ja'Marr Chase,WR,15.2
Travis Kelce,TE,14.2
Mark Andrews,TE,12.5
Justin Tucker,K,9.5
49ers,DEF,12.8
Bills,DEF,11.9
Cowboys,DEF,10.7
```

**OR Basketball:**
```
Luka Doncic,PG,28.5
Stephen Curry,PG,27.3
Damian Lillard,PG,25.8
Devin Booker,SG,26.1
Donovan Mitchell,SG,24.7
LeBron James,SF,25.9
Kevin Durant,SF,27.4
Giannis Antetokounmpo,PF,30.2
Anthony Davis,PF,24.3
Joel Embiid,C,29.8
Nikola Jokic,C,26.4
```

### Quick Tips:
- **Start with the Player class** - it's the foundation
- **Test file reading early** - make sure you can load players before building other features
- **Use `.split(",")` ** to parse CSV lines
- **Use `printf` for aligned table output** in the 2D array display
- **Comment your code** as you write it!

---

## Bonus Challenges (Optional)

If you finish early:
- Add player removal from roster
- Add position limits (max 1 QB, 2 RB, etc.)
- Sort players by points
- Add a "trade" feature
- Generate random weekly scores that vary around the average

---

## Submission Requirements

Submit:
- `Player.java`
- `Team.java`
- `FantasyTeamManager.java` (or your main class name)
- `players.txt` (your data file)
- Sample output showing all features working

**Good luck and have fun managing your fantasy team!** 🏆
