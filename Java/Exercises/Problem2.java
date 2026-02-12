/*
Task:
Write a program that counts down from 30 to 1. But:
If the number is divisible by 3, print "Beep" after the number
If the number is divisible by 5, print "Boop" after the number
If divisible by both, print "BeepBoop" after the number
Otherwise, just print the number
*/
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
