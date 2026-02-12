/*
Task:
Write a program that asks the user to enter numbers (one at a time). Keep asking until they enter -1 to stop. Then print:
The sum of all even numbers entered
How many even numbers were entered
*/

import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sumEven = 0;
        int countEven = 0;
        int number = 0;

        while (number != -1) {
            System.out.print("Enter a number (-1 to stop): ");
            number = input.nextInt();

            if (number % 2 == 0) {
                sumEven += number;
                countEven++;
            }
        }

        System.out.println();
        System.out.println("Sum of even numbers: " + sumEven);
        System.out.println("Count of even numbers: " + countEven);
    }
}
