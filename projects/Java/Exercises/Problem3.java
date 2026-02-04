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
