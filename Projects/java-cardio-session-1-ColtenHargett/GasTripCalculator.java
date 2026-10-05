/*
Programmers: Colten Hargett
Course: CS212, John Nweke
Due Date: 01/27/2026
Lab Assignment: 1
Problem Statement: Calculates the cost of gas for a road trip
Data In: miles traveled, miles per gallon, gas price per gallon
Data Out: total gas cost
Credits: Class notes / zyBook
*/

import java.util.Scanner;

public class GasTripCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // get miles from user
        System.out.print("Enter number of miles to travel: ");
        double miles = input.nextDouble();

        // get mpg from user
        System.out.print("Enter miles per gallon (MPG): ");
        double mpg = input.nextDouble();

        // get ost of gallon from user
        System.out.print("Enter cost of gas per gallon: ");
        double pricePerGallon = input.nextDouble();

        // do the calculations
        double gallonsNeeded = miles / mpg;
        double totalCost = gallonsNeeded * pricePerGallon;

        // out to user
        System.out.printf("The total gas cost for the trip: $%.2f%n", totalCost);

        input.close();
    }
}