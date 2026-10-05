## Reflection

This project was mostly about figuring out who should do what. At first I wanted to put the searching in the CLI, but it made more sense for Band to search its own members and for the CLI to just print the results. Not being allowed to use get or set methods was weird at first, but using hasName and plays instead made the code easier to read since the objects answer the question themselves.

Using an Iterator instead of a for each loop took a little getting used to, but it was pretty simple once I did it. Making Band generic was the part I had to think about the most, mainly figuring out where the E goes and what type the CLI should use. It was cool to see that Band could hold subclasses of BandMember without changing any of the search code.

The feedback on my design helped a lot. I switched from ArrayList to List for the members and changed my test band to Dirty Heads. I also forgot that the arrows in a UML diagram actually mean something, so I need to be more careful with those. If I did this again I would test the error cases earlier, since those were the easiest to miss.
