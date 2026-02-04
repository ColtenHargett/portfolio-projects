import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        int n = 30;

        while (n >= 1) {
            if (n % 3 == 0 && n % 5 == 0) {
                System.out.println(n + " BeepBoop");
            } else if (n % 3 == 0) {
                System.out.println(n + " Beep");
            } else if (n % 5 == 0) {
                System.out.println(n + " Boop");
            } else {
                System.out.println(n);
            }
            n--;
        }
    }
}
