package exceptions;

import java.util.Scanner;

public class ExceptionsTester {
    public static void main(String[] args) {
        System.out.println("Enter an integer please");
        int inputInt = new Scanner(System.in).nextInt();

        System.out.println("About to divide by zero");
        int badNum = 4/0;

        int[] nullArray = new int[3];
        System.out.println(nullArray[6]);

        doSomething();
    }

    public static void doSomething() throws CustomException {
        System.out.println("Wow I did something");
        throw new CustomException("Wow you really did something.");
    }
}
