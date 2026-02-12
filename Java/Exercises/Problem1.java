/*
Task:
write a program that prints numbers from 1 to 50. But:
For multiples of 4, print "Buzz" instead of the number
For multiples of 7, print "Fizz" instead of the number
For multiples of both 4 and 7, print "BuzzFizz"
*/

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            if (i % 4 == 0 && i % 7 == 0) {
                System.out.println("BuzzFizz");
            } else if (i % 4 == 0) {
                System.out.println("Buzz");
            } else if (i % 7 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }
    }
}
