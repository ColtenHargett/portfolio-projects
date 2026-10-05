import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        SortedLinkedList phonebook = new SortedLinkedList();

        String choice;

        do {
            System.out.println("\n1. Add Contact");
            System.out.println("2. Remove Contact");
            System.out.println("3. Print Contacts");
            System.out.println("0. Quit");

            choice = in.nextLine();

            switch (choice) {

                case "1":
                    System.out.print("Name: ");
                    String name = in.nextLine();

                    System.out.print("Phone: ");
                    String phone = in.nextLine();

                    Contact newContact = new Contact(name, phone);
                    phonebook.add(newContact);
                    break;

                case "2":
                    System.out.print("Name to remove: ");
                    String removeName = in.nextLine();

                    phonebook.remove(removeName);
                    break;

                case "3":
                    System.out.println(phonebook);
                    break;

                case "0":
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option.");
            }

        } while (!choice.equals("0"));
    }
}
