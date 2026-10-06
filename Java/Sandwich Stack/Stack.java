public class Stack {
    private Node top;

    public String toString() {
        String ret = "";
        Node curr = top;
        while (curr != null) {
            ret += curr.getData() + "\n";
            curr = curr.next;
        }
        return ret;
    }

    public void push(String ingredient) {
        Node newNode = new Node(ingredient);
        newNode.next = top;
        top = newNode;
    }

    public Node pop() {
        if (top == null) {
            return null;
        }

        Node removed = top;
        top = top.next;
        return removed;
    }
}