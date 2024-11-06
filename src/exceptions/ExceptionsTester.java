package exceptions;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionsTester {
    public static void main(String[] args){
        System.out.println("Enter an integer please");
        int inputInt;
        while (true){
            try {
                inputInt = new Scanner(System.in).nextInt();
                break;
            } catch (InputMismatchException ex) {
                System.out.println("Please only enter integers");
            }
    }

        System.out.println("About to divide by zero");
        try {
            int badNum = 4 / 0;
        }catch (ArithmeticException ex){
            System.out.println("Divided by Zero exception caught.");
        }

        int[] nullArray = new int[3];
        try {
            int i = 0;
            while (true) {
                System.out.println(nullArray[i]);
                i++;
            }
        }catch (ArrayIndexOutOfBoundsException ignored){}
        try {
            doSomething();
        }catch (CustomException ex){
            System.out.println("I handled the exception.");
        }
    }

    public static void doSomething() throws CustomException{
        System.out.println("Wow I did something");
        throw new CustomException("From doSomething");
    }
}
