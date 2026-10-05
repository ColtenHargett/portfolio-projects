/**
 * Represents a contact in the phonebook
 */
public class Contact implements Comparable<Contact> {
    private String name;
    private String phone;

    // TODO: Constructor
    public Contact(String name, String phone) {
        this.name=name;
        this.phone=phone;
    }

    // TODO: Getter for name
    public String getName() {
        return name;
    }

    // TODO: toString method
    public String toString() {
        return "Name: "+name+" Phone: "+phone;
    }

    // TODO: compareTo
    // Return negative if this < other
    // Return 0 if equal
    // Return positive if this > other
    public int compareTo(Contact other) {
        return this.getName().compareTo(other.getName());
    }
}
