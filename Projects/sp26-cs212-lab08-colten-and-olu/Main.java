import java.util.Scanner;

/**
 * This is my code! It's goal is to run the bookstore inventory program.
 * CS 212 - Lab 8
 * @author Colten Hargett Olu Owolabi
 * @version 1.0 03/20/2026
 */
public class Main
{
    /**
     * Runs the program.
     */
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        BookStore store = new BookStore();

        System.out.println("Welcome to Byte Me Book Store.");
        store.loadFromFile("books.txt");

        int choice = 0;

        while (choice != 7)
        {
            System.out.println("Here are the options:");
            System.out.println("1. List all books");
            System.out.println("2. List all books that are cheaper than the chosen price");
            System.out.println("3. Add a new book");
            System.out.println("4. Update the price of a book");
            System.out.println("5. Remove a book");
            System.out.println("6. Find a book by title");
            System.out.println("7. Quit");
            System.out.print("Enter your choice: ");

            if (keyboard.hasNextInt())
            {
                choice = keyboard.nextInt();
                keyboard.nextLine();

                if (choice == 1)
                {
                    store.listAllBooks();
                }
                else if (choice == 2)
                {
                    System.out.print("Enter a price: ");

                    if (keyboard.hasNextDouble())
                    {
                        double price = keyboard.nextDouble();
                        keyboard.nextLine();
                        store.listBooksCheaperThan(price);
                    }
                    else
                    {
                        System.out.println("Invalid price.");
                        keyboard.nextLine();
                    }
                }
                else if (choice == 3)
                {
                    System.out.print("Enter a title: ");
                    String title = keyboard.nextLine();

                    System.out.print("Enter a price: ");

                    if (keyboard.hasNextDouble())
                    {
                        double price = keyboard.nextDouble();
                        keyboard.nextLine();
                        store.addBook(title, price);
                    }
                    else
                    {
                        System.out.println("Invalid price.");
                        keyboard.nextLine();
                    }
                }
                else if (choice == 4)
                {
                    System.out.print("Enter a title: ");
                    String title = keyboard.nextLine();

                    System.out.print("Enter a price: ");

                    if (keyboard.hasNextDouble())
                    {
                        double price = keyboard.nextDouble();
                        keyboard.nextLine();
                        store.updatePrice(title, price);
                    }
                    else
                    {
                        System.out.println("Invalid price.");
                        keyboard.nextLine();
                    }
                }
                else if (choice == 5)
                {
                    System.out.print("Enter the exact title: ");
                    String title = keyboard.nextLine();
                    store.removeBook(title);
                }
                else if (choice == 6)
                {
                    System.out.print("Enter text to search for: ");
                    String text = keyboard.nextLine();
                    store.findBookByTitle(text);
                }
                else if (choice == 7)
                {
                    System.out.println("Goodbye.");
                }
                else
                {
                    System.out.println("Invalid menu choice.");
                }
            }
            else
            {
                System.out.println("Invalid input.");
                keyboard.nextLine();
            }

            System.out.println();
        }

        keyboard.close();
    }
}