## Reflection

Using a class hierarchy made the lab easier to organize. Since RegularPolygon already handled the shared logic for shapes, Square and Hectogon just extended it and only had to specify their number of sides, which made it so there was no need to rewrite code twice. Circle and RightTriangle extended Shape directly. We used the interface named Geometry to give the shapes calculate area and perimeter to the classes that needed it.

Making color protected means subclasses can access and change it directly, but classes outside the hierarchy cant touch it. Its a good middle ground between private and public.

If you remove super(color, name); from the RegularPolygon constructor, it won't compile. Java automatically tries to call the superclass's constructor even if you dont, and since Shape doesn't have one, youll get an error.

The only issue I ran into with git was trying to pull, but I had uncommitted changes, although I just wanted git to overide my local files. I fixed it by finding this command online: git reset --hard origin/main. It was a little confusing at first because I have never needed to do this before, but I now know the command.

Overall I got a better feel for when to use inheritance vs an interface, and why planning the class diagram first was benifical for the long run. Pair programming worked well for us as we were able to bounce ideas off one another in class and split up the work outside of class.
