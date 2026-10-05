import java.util.Random;
import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        int[][] grid = new int[5][5];
        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[r].length; c++) {
                grid[r][c] = rand.nextInt(50) + 1;
            }
        }

        System.out.println("Treasure Map:");
        for (int[] ints : grid) {
            for (int anInt : ints) {
                System.out.printf("%-3d ", anInt);
            }
            System.out.println();
        }

        System.out.print("\nEnter treasure value: ");
        int treasure = input.nextInt();

        int count = 0;

        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[r].length; c++) {
                if (grid[r][c] == treasure) {
                    System.out.println("Treasure found at (" + r + ", " + c + ")");
                    count++;
                }
            }
        }

        if (count == 0) {
            System.out.println("Treasure " + treasure + " not found on the map.");
        } else {
            System.out.println("Total treasures found: " + count);
        }

        input.close();
    }
}
