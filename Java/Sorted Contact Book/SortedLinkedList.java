/**
 * A sorted linked list of Contact objects
 */

public class SortedLinkedList {
    private Node head;

    public SortedLinkedList() {
        head = null;
    }

    /**
     * Adds a contact in sorted order
     */
    public void add(Contact newContact) {
        Node newNode = new Node(newContact);

        if (head == null) {
            head = newNode;
            return;
        }

        if (newContact.compareTo(head.data) < 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node current = head;

        while (current.next != null && newContact.compareTo(current.next.data) > 0) {
            current = current.next;
        }

        newNode.next = current.next;
        current.next = newNode;
    }

    /**
     * Removes a contact by name
     */
    public void remove(String name) {
        if (head == null) {
            return;
        }
        if (head.data.getName().equals(name)) {
            head=head.next;
            return;
        }
        Node current = head;

        while (current.next!=null) {

            if (current.next.data.getName().equals(name)) {
                current.next=current.next.next;
                return;
            }

            current = current.next;
        }
    }

    /**
     * Returns a string of all contacts
     */
    public String toString() {

        String result = "";

        Node current = head;
        while (current != null) {
            result+=current.data.toString()+"->";
            current = current.next;
        }

        return result;
    }
}
