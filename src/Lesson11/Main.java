package Lesson11;

import java.util.Random;

public class Main {
    public static void main(String args[]) {
       // Random random = new Random();
        int num[] = new int[4];
        try {
            System.out.println("Before exception is generated.");
            num[5] = 10;
            System.out.println("this won't be displayed");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out-of-bounds!");
        }
        System.out.println("After catch statement.");

        System.out.println(" ");

        int a[] = {4, 8, 16, 32, 64, 128};
        int b[] = {2, 0, 4, 4, 0, 8};

        for (int i = 0; i < a.length; i++) {
            try {
                System.out.println(a[i] + " / " +
                        b[i] + " is " +
                        a[i] / b[i]);
            } catch (ArithmeticException exc) {
                System.out.println("Can't divide by Zero!");
            } finally {
                System.out.println("I can work");
            }
        }

    }
}
