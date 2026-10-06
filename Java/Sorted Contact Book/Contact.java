/**
 * Represents a contact in the phonebook
 */
public class Contact implements Comparable<Contact> {
    private String name;
    private String phone;
    public Contact(String name, String phone) {
        this.name=name;
        this.phone=phone;
    }
    public String getName() {
        return name;
    }
    public String toString() {
        return "Name: "+name+" Phone: "+phone;
    }
    // Return negative if this < other
    // Return 0 if equal
    // Return positive if this > other
    public int compareTo(Contact other) {
        return this.getName().compareTo(other.getName());
    }
}
