/**
 * This is my code! It's goal is to read words from the user, insert them
 * into a binary search tree, and print them in alphabetical order.
 * CS 212 - Lab 12
 * @author Colten Hargett, Tyler Wilkinson
 * @version 1.0 2026-04-14
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