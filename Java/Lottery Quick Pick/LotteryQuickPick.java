/**
 * Simulates the Quick Pick option on a lottery machine.
 */

import java.util.Scanner;
import java.util.Random;

class LotteryQuickPick {
    public static void main(String[] args) {
        long prize = 225938745L;
        int tickets = 0;
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        System.out.println("This program generates 8 lottery tickets.");

        // get user's name, ignoring extra spaces, and keep only the first name
        System.out.print("What's your name? ");
        String fullName = input.nextLine().trim();
        String firstName = fullName.split("\\s+")[0];

        // print out 8 tickets of 6 different numbers from 1 to 69
        System.out.println("Here are your tickets:");
        while (tickets < 8) {
            boolean[] used = new boolean[70];
            int count = 0;
            while (count < 6) {
                int randomNum = random.nextInt(69) + 1;
                if (!used[randomNum]) {
                    used[randomNum] = true;
                    System.out.printf("%02d ", randomNum);
                    count++;
                }
            }
            System.out.println();
            tickets++;
        }

        // display jackpot information
        System.out.println("-----------");
        System.out.println("Good luck " + firstName + "!");
        System.out.println("Estimated Jackpot:");
        System.out.printf("$%,d", prize);
        System.out.println("\n-----------");
    }
}
