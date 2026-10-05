import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Stores and manages a bookstore inventory.
 */
public class BookStore
{
    private HashMap<String, Double> inventory;

    /**
     * Creates an empty bookstore inventory.
     */
    public BookStore()
    {
        inventory = new HashMap<String, Double>();
    }

    /**
     * Reads books from a file and stores them in the inventory.
     *
     * @param fileName the name of the file
     */
    public void loadFromFile(String fileName)
    {
        try
        {
            Scanner fileScan = new Scanner(new File(fileName));

            while (fileScan.hasNextLine())
            {
                String line = fileScan.nextLine();
                String[] parts = line.split(":");

                if (parts.length == 2)
                {
                    String title = parts[0].trim();
                    double price = Double.parseDouble(parts[1].trim());
                    inventory.put(title, price);
                }
            }

            fileScan.close();
        }
        catch (FileNotFoundException e)
        {
            // do nothing, inventory stays empty
        }
    }

    /**
     * Prints all books.
     */
    public void listAllBooks()
    {
        if (inventory.isEmpty())
        {
            System.out.println("No books in inventory.");
        }
        else
        {
            for (String title : inventory.keySet())
            {
                System.out.println(title + " - $" + inventory.get(title));
            }
        }
    }

    /**
     * Prints books cheaper than given price.
     *
     * @param price max price
     */
    public void listBooksCheaperThan(double price)
    {
        boolean found = false;

        for (String title : inventory.keySet())
        {
            if (inventory.get(title) < price)
            {
                System.out.println(title + " - $" + inventory.get(title));
                found = true;
            }
        }

        if (!found)
        {
            System.out.println("No matching books found.");
        }
    }

    /**
     * Adds a book.
     */
    public void addBook(String title, double price)
    {
        inventory.put(title, price);
    }

    /**
     * Updates price if book exists.
     */
    public void updatePrice(String title, double price)
    {
        if (inventory.containsKey(title))
        {
            inventory.put(title, price);
        }
    }

    /**
     * Removes a book.
     */
    public void removeBook(String title)
    {
        inventory.remove(title);
    }

    /**
     * Finds books containing text.
     */
    public void findBookByTitle(String searchText)
    {
        for (String title : inventory.keySet())
        {
            if (title.toLowerCase().contains(searchText.toLowerCase()))
            {
                System.out.println(title + " - $" + inventory.get(title));
            }
        }
    }
}