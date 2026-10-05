/*
Programmers: Colten Hargett
Course: CS212, John Nweke
Due Date: 01/27/2026
Lab Assignment: 1.2
Problem Statement: Calculates the cost of monthly phone plan
Data In: package type, amount of data used
Data Out: total phone bill cost
Credits: Class notes / zyBook
*/

import java.util.Scanner;

public class PhoneBill {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // initialize variables
        String packageName = "";
        double dataUsed = 0;
        double totalCost = 0.0;

        // ask user for package type
        System.out.print("Enter package name (Green, Blue, Purple): ");
        packageName = input.nextLine().toLowerCase();

        // error check package type
        while (!packageName.equals("green") && !packageName.equals("blue") && !packageName.equals("purple")) {
            System.out.println("Invalid package name. Please try again.");
            System.out.println("Enter package name (Green, Blue, Purple): ");
            packageName = input.nextLine().toLowerCase();

            }

        // get amount of data
        System.out.print("Enter data used (in GB): ");
        dataUsed = input.nextDouble();

        // calculate cost for green
        if (packageName.equals("green")) {
            totalCost = 49.99;

            if (dataUsed > 2) {
                totalCost += (dataUsed - 2) * 15;
            }

            // determine if coupon is used
            System.out.print("Do you have a coupon? (true/false): ");
            boolean hasCoupon = input.nextBoolean();

            if (hasCoupon && totalCost >= 75) {
                totalCost -= 20;
            }
        }
        // calculate cost for blue
        else if (packageName.equals("blue")) {
            totalCost = 70.00;

            if (dataUsed > 4) {
                totalCost += (dataUsed - 4) * 10;
            }
        }
        // calculate cost for purple
        else { // purple
            totalCost = 99.95;
        }

        // output cost to user
        System.out.printf("The total monthly bill is $%.2f%n", totalCost);

        input.close();
    }
}