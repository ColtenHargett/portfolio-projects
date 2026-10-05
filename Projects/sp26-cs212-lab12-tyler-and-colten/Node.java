/**
 * This is my code! It's goal is to represent one node in a binary search tree.
 * CS 212 - Lab 12
 * @author Colten Hargett, Tyler Wilkinson
 * @version 1.0 2026-04-14
 */
public class Node {
    private final String data;
    public Node left;
    public Node right;

    /**
     * Creates a node with the given word.
     *
     * @param data the word stored in the node
     */
    public Node(String data) {
        this.data = data;
    }

    /**
     * Returns the data stored in the node.
     *
     * @return the word stored in the node
     */
    public String getData() {
        return data;
    }
}