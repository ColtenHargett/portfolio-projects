public class Node {
    private String ingredient;
    Node next;

    public Node(String ingredient) {
        this.ingredient = ingredient;
        this.next = null;
    }

    public String getData() {
        return ingredient;
    }
}