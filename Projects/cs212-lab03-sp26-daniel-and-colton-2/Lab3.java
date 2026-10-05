/*
  # Programmers:  Daniel and Colten
  # Course:  CS212
  # Due Date: 2/6/2026
  # Lab Assignment: Lab3
  # Problem Statement: simulates the Quick Play option on a lottery machine.
  # Data In: Username
  # Data Out:  Tickets list, jackpot info
  # Credits: N/A
*/

import java.util.Scanner;
import java.util.Random;

class Lab3 {
    public static void main(String[] args) {
        long prize = 225938745L;
        int tickets = 0;
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        System.out.println("CS 212 - Lab 3");
        System.out.println("This program generates 8 lottery tickets.");

        // get user's name
        System.out.print("What's your name? ");
        String customerName = input.nextLine();

        // print out 8 sets of lottery tickets
        System.out.println("Here are the ticket:");
        while (tickets < 8){
            int count = 0;
            while (count < 10) {
                int randomNum = random.nextInt(69)+1;
                System.out.printf("%02d", randomNum);
                System.out.print(" ");
                count ++;
            }
            System.out.println();
            tickets ++;
        }

        // display jackpot information
        System.out.println("-----------");
        System.out.println("Good luck " + customerName + "!");
        System.out.println("Estimated Jackpot:");
        System.out.printf("$%,d", prize);
        System.out.println("\n-----------");


    }
}
