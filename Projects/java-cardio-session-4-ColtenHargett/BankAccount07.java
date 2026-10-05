public class BankAccount07 {

    // Fields
    String owner;
    double balance;

    // Default Constructor
    public BankAccount07() {
        owner = "";
        balance = 0.0;
    }

    // Regular Constructor
    public BankAccount07(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    // Adds amount to balance (reject if amount <= 0)
    public void deposit(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid deposit.");
            return;
        }

        System.out.println("Depositing $" + amount + "...");
        balance += amount;
        printBalance();
    }

    // Subtracts amount from balance (print "Insufficient funds." if too low)
    public void withdraw(double amount) {

        System.out.println("Withdrawing $" + amount + "...");

        if (amount > balance) {
            System.out.println("Insufficient funds.");
            return;
        }

        balance -= amount;
        printBalance();
    }

    // Prints the owner's name and current balance
    public void printBalance() {
        System.out.println(owner + "'s balance: $" + balance);
    }
}