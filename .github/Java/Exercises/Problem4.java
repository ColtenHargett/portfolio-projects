import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        for (int row = 1; row <= 7; row++) {
            for (int col = 1; col <= 7; col++) {
                System.out.print((row * col) + "\t");
            }
            System.out.println();
        }
    }
}
