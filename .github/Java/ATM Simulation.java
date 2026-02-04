import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //variables
        String customerName;
        double balance = 212.90; // Opening balance
        double depositTotal = 0.0;
        double withdrawTotal = 0.0;
        int choice;

        //Get customer name
        System.out.println("Enter your name: ");
        customerName = input.nextLine();

        System.out.println("Welcome to the ATM, " + customerName + "!");

        do { 
            System.out.println("Your choices are: \n" + 
                            "1. deposit \n" + 
                            "2. withdrawal\n" + 
                            "3. balance\n" + 
                            "4. exit");
            System.out.println("Your choice is: ");
            choice = input.nextInt();
            
            switch (choice) {
                case 1: //when the choice is deposit
                    System.out.print("How much money would you like to deposit? ");
                    double deposit = input.nextDouble();

                    while (deposit < 0) {
                        System.out.println("Invalid input. Please enter a positive dollar amount.");
                        System.out.print("How much money would you like to deposit? ");
                        deposit = input.nextDouble();
                    }   

                    balance += deposit;
                    depositTotal += deposit;

                    System.out.printf("Deposit successful. New balance: $%.2f%n%n", balance);
                    break;

                case 2: //when the choice is withdrawal
                    System.out.print("How much money would you like to withdraw? ");
                    double withdrawal = input.nextDouble();

                    while (withdrawal < 0) { // Prevent negative withdrawals
                        System.out.println("Invalid input. Please enter a positive dollar amount.");
                        System.out.print("How much money would you like to withdraw? ");
                        withdrawal = input.nextDouble();
                    }   

                    if (withdrawal <= balance) { // Prevent overdraft
                        balance -= withdrawal;
                        withdrawTotal += withdrawal;
                        System.out.printf("Withdrawal successful. New balance: $%.2f%n%n", balance);
                    }

                    else {
                        System.out.println("Insufficient funds. Withdrawal denied.\n");
                    }   
                    break;

                case 3: //when the choice is to show balance
                    System.out.printf("Your current balance is $%.2f%n%n", balance);
                    break;

                case 4: //Do nothing — loop will end
                    break;

                default:
                    System.out.println("Invalid choice. Please select 1, 2, 3, or 4.\n");
                break;
            }
        } while (choice != 4);

        // Transaction summary
        System.out.println("\n===== Transaction Summary =====");
        System.out.printf("Total Deposited: $%.2f%n", depositTotal);
        System.out.printf("Total Withdrawn: $%.2f%n", withdrawTotal);
        System.out.printf("Final Balance: $%.2f%n", balance);

        System.out.println("\nThank you for using the ATM!");
        System.out.println("Please remember to take your receipt or check your email for confirmation.");        
    }
}
