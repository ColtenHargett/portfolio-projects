import java.util.Arrays;

public class Problem1 {
    public static void main(String[] args) {
       int[] numbers = {45, 23, 67, 12, 89, 34, 56, 78, 90, 11};

       System.out.print("Original: " + Arrays.toString(numbers));

       int comparisons = 0;
       int swaps = 0;

       System.out.println("\n\nStarting selection sort...");

        for (int i = 0; i < numbers.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < numbers.length; j++) {
                comparisons++;
                if (numbers[j] < numbers[minIndex]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                int temp = numbers[i];
                numbers[i] = numbers[minIndex];
                numbers[minIndex] = temp;
                swaps++;
            }

            System.out.println("After pass " + (i + 1) + ": " + Arrays.toString(numbers));
        }

        System.out.print("\nSorted: " + Arrays.toString(numbers));
        System.out.println("\nTotal comparisons: " + comparisons);
        System.out.println("Total swaps: " + swaps);
    }


    }