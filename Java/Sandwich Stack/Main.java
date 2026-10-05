import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack sandwich = new Stack();

        String userChoice;

        System.out.print("Welcome to Dagwood Sandwiches! Here are your sandwich-bulding choices:\n");
        do {
            System.out.println("1. Add an ingredient to the sandwich.");
            System.out.println("2. Remove an ingredient.");
            System.out.println("3. Show the sandwich.");
            System.out.println("0. Finish.");

            System.out.println("Enter the number of your choice:  ");

            userChoice = input.nextLine();

            switch (userChoice) {
                case "1":
                    System.out.print("Enter an ingredient to add: ");
                    String ingredient = input.nextLine();
                    ingredient = ingredient.substring(0, 1).toUpperCase() + ingredient.substring(1).toLowerCase();
                    sandwich.push(ingredient);
                    System.out.println(ingredient + " added to the sandwich.");
                    break;
                case "2":
                    Node removed = sandwich.pop();

                    if (removed == null) {
                        System.out.println("There is nothing on the sandwich to remove.");
                    } else {
                        System.out.println("Removed: " + removed.getData());
                    }
                    break;
                case "3":
                    if (sandwich.toString().equals("")) {
                        System.out.println("The sandwich is empty.");
                    } else {
                        System.out.println("Current sandwich:");
                        System.out.print("\n-Bread-\n" + sandwich + "-Bread-\n");
                    }
                    break;
                case "0":
                    System.out.println("Come back soon!");
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        }
        while (!userChoice.equals("0"));    

    }
}