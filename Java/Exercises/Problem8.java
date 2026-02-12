/*
Task:
Write a program where the computer picks a random number between 1 and 20. The user keeps guessing until they get it right. After each guess, tell them:
"Too high!" if their guess is higher
"Too low!" if their guess is lower
"Correct! You got it in X tries!" when they guess right
*/

import java.util.Scanner;
import java.util.Random;


public class Problem8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int secret = rand.nextInt(20) + 1;
        int guess;
        int tries = 0;

        do {
            System.out.print("Guess a number (1-20): ");
            guess = input.nextInt();
            tries++;

            if (guess > secret) {
                System.out.println("Too high!");
            } else if (guess < secret) {
                System.out.println("Too low!");
            } else {
                System.out.println("Correct! You got it in " + tries + " tries!");
            }
        } while (guess != secret);
        
    }
}
