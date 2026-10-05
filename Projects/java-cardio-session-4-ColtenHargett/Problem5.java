import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[6];

        System.out.println("Enter 6 numbers:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        char again;

        do {
            System.out.print("\nSearch for: ");
            int target = input.nextInt();

            boolean found = false;

            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] == target) {
                    System.out.println("Found " + target + " at index: " + i);
                    found = true;
                }
            }

            if (!found) {
                System.out.println(target + " not found in the array.");
            }

            System.out.print("Search again? (y/n): ");
            again = input.next().charAt(0);

        } while (again == 'y' || again == 'Y');

        input.close();
    }
}