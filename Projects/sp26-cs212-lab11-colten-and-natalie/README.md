# Lab 11 - A Stack of Meats and Cheeses

## Description

You have a new job at a fancy sandwich place that exclusively makes 
[Dagwood sandwiches](https://en.wikipedia.org/wiki/Dagwood_sandwich). Since you don't want them to collapse, you can
only add or remove ingredients to or from the top, but you can view the whole sandwich at any time.

## Requirements 
You should provide your user with the following menu:

```
1. Add an ingredient to the sandwich.
2. Remove an ingredient. 
3. Show the sandwich.
0. Finish.
```

Option 1 should prompt the user for an ingredient to add to the top of the sandwich.

Option 2 should remove the top ingredient and tell the user what was removed. If there is nothing on the sandwich when
the user attempts to remove something, the user should be told this.

Option 3 should print the entire sandwich.

Option 0 should exit the program.

## Design
I have provided you with `Stack,` so that you did not have to write the `toString` for a List. You will need to create a Node class that plays nicely with `Stack` as well as a `Main` 
class that uses `Stack` to carry out the assigned task.

Besides the constructor, here is the list of methods you need to make:
1. `push(String)` - add a String to the top of the `Stack`
2. `pop()` - remove (and return?) the top item on the `Stack`

If you choose not to have `pop` return anything, you will need a third method, `peek()`, to view the top of the `Stack`.

## Testing
You should create testcases.txt describing at least 4 test cases for your program. Make use of the debugger or the 
provided `toString` to see what is happening in your list.

## Submission
To GitHub:
1. `testcases.txt` listing at least 4 test cases, including input, description, and expected output.
2. All code needed to run your program.
3. A reflection addressing at least the following:
   1. How are you feeling about Linked data structures (Stack and Queue)?
   2. Did playing with them in lab help or was class sufficient?
   3. How did having my skeleton code affect your coding process?
