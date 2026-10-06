/**
 * Stores words in a binary search tree and prints them using
 * preorder, inorder and postorder traversals.
 */
public class BinarySearchTree {
    private Node root;

    /**
     * Creates an empty binary search tree.
     */
    public BinarySearchTree() {
        root = null;
    }

    /**
     * Inserts a word into the binary search tree.
     *
     * @param word the word to insert into the tree
     */
    public void insert(String word) {
        Node curr = root;
        Node prev = null;
        String direction = "none";

        while (curr != null) {
            prev = curr;

            if (word.compareTo(curr.getData()) < 0) {
                curr = curr.left;
                direction = "left";
            } else {
                curr = curr.right;
                direction = "right";
            }
        }

        if (prev == null) {
            root = new Node(word);
        } else if (direction.equals("left")) {
            prev.left = new Node(word);
        } else {
            prev.right = new Node(word);
        }
    }

    /**
     * Prints the tree in preorder traversal.
     */
    public void preOrder() {
        preOrderRecursive(root);
    }

    /**
     * Recursively performs preorder traversal.
     *
     * @param curr the current node being visited
     */
    private void preOrderRecursive(Node curr) {
        if (curr == null) {
            return;
        }

        System.out.print(curr.getData() + " ");
        preOrderRecursive(curr.left);
        preOrderRecursive(curr.right);
    }

    /**
     * Prints the tree in inorder traversal.
     */
    public void inOrder() {
        inOrderRecursive(root);
    }

    /**
     * Recursively performs inorder traversal.
     *
     * @param curr the current node being visited
     */
    private void inOrderRecursive(Node curr) {
        if (curr == null) {
            return;
        }

        inOrderRecursive(curr.left);
        System.out.print(curr.getData() + " ");
        inOrderRecursive(curr.right);
    }

    /**
     * Prints the tree in postorder traversal.
     */
    public void postOrder() {
        postOrderRecursive(root);
    }

    /**
     * Recursively performs postorder traversal.
     *
     * @param curr the current node being visited
     */
    private void postOrderRecursive(Node curr) {
        if (curr == null) {
            return;
        }

        postOrderRecursive(curr.left);
        postOrderRecursive(curr.right);
        System.out.print(curr.getData() + " ");
    }
}