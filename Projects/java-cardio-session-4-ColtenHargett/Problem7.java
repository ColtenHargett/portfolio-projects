public class Problem7 {
    public static void main(String[] args) {

        BankAccount07 acc1 = new BankAccount07("Alice", 500);
        BankAccount07 acc2 = new BankAccount07("Bob", 300);

        acc1.printBalance();

        acc1.deposit(200);
        acc1.withdraw(900);
        acc1.withdraw(100);

        acc2.deposit(50);
        acc2.withdraw(100);
    }
}