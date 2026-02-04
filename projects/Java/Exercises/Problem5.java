import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        int rows = 6;

        for (int i = 1; i <= rows; i++) {
            for (int space = 0; space < (rows - i); space++) {
                System.out.print(" ");
            }
            for (int star = 0; star < (2 * i - 1); star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
