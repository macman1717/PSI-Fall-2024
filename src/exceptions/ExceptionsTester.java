package exceptions;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionsTester {
    public static void main(String[] args) {
        try {
            System.out.println("Enter an integer please");
            int inputInt = new Scanner(System.in).nextInt();
        }catch (InputMismatchException ex){
            System.out.println("Input must be an integer");
        }finally {
            System.out.println("End of first try block");
        }

        try {
            System.out.println("About to divide by zero");
            int badNum = 4 / 0;
        }catch(ArithmeticException ex){
            System.out.println("Cant divide by 0");
        }

        try {
            int[] nullArray = new int[3];
            System.out.println(nullArray[6]);
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Index 6 is out of bounds for array");
        }
        try {
            doSomething();
        }catch (CustomException ex){
            System.out.println("Last Catch block");
        }

    }
    public static void doSomething()  throws CustomException{
        System.out.println("Wow I did something");

        throw new CustomException("I like blue");
    }
}
