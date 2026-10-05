# Getting data from ArrayList vs LinkedList

![Get: ArrayList vs LinkedList](gettimes.png)

## Speculation

ArrayList: We think get(i) is O(1) for an ArrayList. Since it uses an array it can go straight to index i. So getting all N elements should be O(N) overall.

LinkedList: We think get(i) is O(N) for a LinkedList. It has to go node by node from the front (or back) until it gets to index i. So getting all N elements should be O(N^2) overall.

## How the graph supports this

The LinkedList line curves up like a parabola. Every time we doubled N, the time went up about 4 times (2.05 s -> 8.16 s -> 33.33 s). At 8N it took about 86 times longer than at N, which is pretty close to 8^2 = 64. This matches O(N^2) overall, or O(N) for each get.

The ArrayList line stays flat at 0 on the graph. Even with 400000 elements it took less than 0.01 s, so it looks like O(1) for each get.
