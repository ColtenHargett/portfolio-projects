/**
 * Menu-driven program for managing a to-do list.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ToDoList todos = new ToDoList();

        Scanner input = new Scanner(System.in);

        System.out.println("Hello and welcome to your ToDo list.");

        String menuOption;
        do{
            System.out.println("Your list is currently:");
            System.out.println(todos.toString());

            System.out.println("What would you like to do?");
            System.out.println("1. Add an item in the middle.");
            System.out.println("2. Add an item at the end.");
            System.out.println("3. Remove an item.");
            System.out.println("4. Mark an item as done.");
            System.out.println("5. Clear the list.");
            System.out.println("0. Quit");

            menuOption = input.nextLine();
            if (menuOption.equals("1")) {
                System.out.println("Current list: ");
                System.out.println(todos.toString());

                System.out.print("Enter item to add: ");
                String item = input.nextLine();

                System.out.print("Enter index in list: ");
                int index = input.nextInt() - 1;
                input.nextLine();

                if (index < 0 || index > todos.size()) {
                    System.out.println("Index is not in range");
                }
                else {
                    todos.addItem(item, index);
                }
            }
            else if (menuOption.equals("2")) {
                System.out.println("Current list: ");
                System.out.println(todos.toString());

                System.out.print("Enter item to add: ");
                String item = input.nextLine();

                todos.addItem(item);
            }
            else if (menuOption.equals("3")) {
                System.out.println("Current list: ");
                System.out.println(todos.toString());

                System.out.print("Enter index in list to remove: ");
                int index = input.nextInt() - 1;
                input.nextLine();

                if (index < 0 || index >= todos.size()) {
                    System.out.println("Index is not in range");
                }
                else {
                    todos.removeItem(index);
                }
            }
            else if (menuOption.equals("4")) {
                System.out.println("Current list: ");
                System.out.println(todos.toString());

                System.out.print("Enter index in list to mark as done: ");
                int index = input.nextInt() - 1;
                input.nextLine();

                if (index < 0 || index >= todos.size()) {
                    System.out.println("Index is not in range");
                }
                else {
                    todos.markAsDone(index);
                }
            }
            else if (menuOption.equals("5")) {
                todos.clearArray();
            }

        } while (! menuOption.equals("0"));

    }

}
