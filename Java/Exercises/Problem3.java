/*
Task:
Write a program that asks the user to enter a password. Keep asking until they enter a valid password. A valid password must:
Be at least 8 characters long
Contain the word "java" (case-insensitive)
*/

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String password;
        boolean valid;

        do {
            System.out.print("Enter password: ");
            password = input.nextLine();

            if (password.length() < 8) {
                System.out.println("Invalid! Too short.");
                valid = false;
            } else if (!password.toLowerCase().contains("java")) {
                System.out.println("Invalid! Must contain 'java'.");
                valid = false;
            } else {
                System.out.println("Valid password! Access granted.");
                valid = true;
            }
        } while (!valid);
    }
}
