public class MenuBST {
    private class Node {
        MenuItem item;
        Node left;
        Node right;

        Node(MenuItem item) {
            this.item = item;
        }
    }

    private Node root;

    public void insert(MenuItem item) {
        root = insert(root, item);
    }

    private Node insert(Node node, MenuItem item) {
        if (node == null) {
            return new Node(item);
        }

        if (item.getName().compareToIgnoreCase(node.item.getName()) < 0) {
            node.left = insert(node.left, item);
        } else {
            node.right = insert(node.right, item);
        }

        return node;
    }

    public MenuItem search(String name) {
        return search(root, name);
    }

    private MenuItem search(Node node, String name) {
        if (node == null) {
            return null;
        }

        int compare = name.compareToIgnoreCase(node.item.getName());

        if (compare == 0) {
            return node.item;
        } else if (compare < 0) {
            return search(node.left, name);
        } else {
            return search(node.right, name);
        }
    }

    public void displayMenu() {
        inOrder(root);
    }

    private void inOrder(Node node) {
        if (node != null) {
            inOrder(node.left);
            System.out.println(node.item);
            inOrder(node.right);
        }
    }
}