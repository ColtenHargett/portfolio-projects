/**
 * One node in the binary search tree.
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