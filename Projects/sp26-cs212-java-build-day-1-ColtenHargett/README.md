# Java Build Day Project: Personality Test Application

## Time Breakdown
- **Brainstorm:** 5 minutes
- **Code:** 25 minutes
- **Test & Peer Testing:** 15 minutes
- **Total:** 45 minutes

---

## Project Overview
Build a console-based personality test application in Java that asks users 10 questions and categorizes them into one of four personality types based on their responses.

---

## Brainstorm Phase (5 minutes)

### Step 1: Design Your Questions & Scoring Logic
Before coding, plan out:

1. **Choose 4 Personality Types** (examples):
   - **The Leader** - Decisive, extroverted, action-oriented
   - **The Thinker** - Analytical, logical, introspective
   - **The Social Butterfly** - Outgoing, people-focused, empathetic
   - **The Creative** - Imaginative, artistic, innovative

2. **Create 10 Questions** with 4 answer choices (A, B, C, D)
   - Each answer maps to one personality type
   - Example mapping:
     - A → Leader
     - B → Thinker
     - C → Social Butterfly
     - D → Creative

3. **Plan Your Scoring System**
   - Track points for each personality type
   - Highest score = user's personality type

**✓ Checkpoint:** Show your questions to instructor/tutor before coding!

---

## Coding Phase (25 minutes)

### Required Components

#### 1. **Question Storage**
- Store questions and answer options (use arrays or ArrayList)
- Store answer-to-personality mappings

#### 2. **User Input Loop**
- Display questions one at a time
- Get user's answer (A, B, C, or D)
- Validate input (handle invalid entries)

#### 3. **Scoring System**
- Track points for each personality type using variables or HashMap
- Add points based on user's answers

#### 4. **Results Calculation**
- Determine which personality type has the highest score
- Handle ties (pick first one or notify user)

#### 5. **Results Display**
- Show user's personality type
- Display description of traits
- **REQUIRED:** Include "Words of Affirmation" reference in at least one personality description

#### 6. **Error Handling**
- Check for invalid answer choices
- Re-prompt user if input is invalid
- Use try-catch for input errors (optional but recommended)

### Suggested Class Structure

```java
public class PersonalityTest {
    public static void main(String[] args) {
        // Main program flow
    }
    
    // Method to display questions
    // Method to get valid user input
    // Method to calculate scores
    // Method to determine personality type
    // Method to display results
}
```

---

## Testing Phase (15 minutes)

### Self-Testing (5-7 minutes)
1. **Valid Input Test:** Answer all questions with valid choices
2. **Invalid Input Test:** Try entering invalid options (E, 5, xyz)
3. **Edge Cases:** Test different answer combinations
4. **Tie Test:** Try to create a tie between personality types

### Peer Testing (8-10 minutes)
1. **Swap with a partner**
2. **Take each other's tests**
3. **Provide feedback:**
   - Does the test run without errors?
   - Are questions clear?
   - Do results make sense?
   - Is error handling working?
   - Did you find the "Words of Affirmation" reference?

---

## Grading Checklist (100 points)

- [ ] **10+ questions with 4 multiple-choice answers** (20 pts)
- [ ] **Questions display one at a time** (10 pts)
- [ ] **User input is collected and validated** (15 pts)
- [ ] **Scoring system tracks points for each personality type** (20 pts)
- [ ] **Program calculates highest-scoring personality** (15 pts)
- [ ] **Results display with personality description** (10 pts)
- [ ] **"Words of Affirmation" reference included** (5 pts)
- [ ] **Error handling for invalid inputs** (10 pts)

---

## Helpful Hints

**For Input Handling:**
```java
Scanner scanner = new Scanner(System.in);
String answer = scanner.nextLine().toUpperCase();
```

**For Scoring:**
- Use separate int variables: `leaderScore`, `thinkerScore`, etc.
- OR use a HashMap: `HashMap<String, Integer> scores`

**For Validation:**
```java
while (!answer.equals("A") && !answer.equals("B") && 
       !answer.equals("C") && !answer.equals("D")) {
    System.out.println("Invalid choice. Please enter A, B, C, or D:");
    answer = scanner.nextLine().toUpperCase();
}
```

---

## Submission Requirements
- Submit your link to your github repo on Moodle 
- Include comments explaining your logic
- Make sure code compiles and runs without errors

**Good luck and have fun building!**
