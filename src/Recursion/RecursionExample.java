package Recursion;

public class RecursionExample {
    public static void main(String[] args) {
        int number = 5;
        System.out.println("From recursive method: " + getFactorial(number));
        System.out.println("From hard coded: " + 5 * 4 * 3 * 2 * 1);
    }

    public static int getFactorial(int x){
        if(x == 1){
            return 1;
        }
        return x * getFactorial(x);
    }
}
