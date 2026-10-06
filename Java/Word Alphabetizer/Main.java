/**
 * Reads words from the user, inserts them into a binary search tree,
 * and prints them in alphabetical order.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the alphabetizer!");

        Scanner in = new Scanner(System.in);

        BinarySearchTree sorter = new BinarySearchTree();

        System.out.println("Please enter a word to put into order. Type ZZZ to quit.");
        String word = in.nextLine();

        while (!word.equalsIgnoreCase("ZZZ")) {
            sorter.insert(word);

            System.out.println("Enter your next word or type ZZZ to quit.");
            word = in.nextLine();
        }

        System.out.println("Your words in alphabetical order:");
        sorter.inOrder();

        in.close();
    }
}