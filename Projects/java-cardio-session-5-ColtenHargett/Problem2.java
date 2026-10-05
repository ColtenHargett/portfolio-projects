import java.util.Arrays;

public class Problem2 {
    public static void main(String[] args) {
        int[] numbers = {38, 27, 43, 3, 9, 82, 10};

        System.out.print("Original: " + Arrays.toString(numbers));

        int totalShifts = 0;

        System.out.println("\n\nInsertion Sort Steps:");

        for (int i = 1; i < numbers.length; i++) {
            int key = numbers[i];
            int j = i - 1;

            int shiftsThisPass = 0;

            while (j >= 0 && numbers[j] > key) {
                numbers[j + 1] = numbers[j];
                shiftsThisPass++;
                totalShifts++;
                j--;
            }

            numbers[j + 1] = key;

            System.out.print("Inserting " + key + ": " + Arrays.toString(numbers));
            System.out.println(" (" + shiftsThisPass + " shifts)");
        }

        System.out.print("\nSorted: " + Arrays.toString(numbers));
        System.out.println("\nTotal shifts: " + totalShifts);
    }

    }
