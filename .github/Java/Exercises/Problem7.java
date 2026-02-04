import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
        int row = 1;

        while (row <= 5) {
            int col = 1;

            while (col <= 5) {
                if (row == col) {
                    System.out.print("X ");
                } else if ((row + col) % 2 == 0) {
                    System.out.print("E ");
                } else {
                    System.out.print("O ");
                }
                col++;
            }

            System.out.println();
            row++;
        }
    }
}
