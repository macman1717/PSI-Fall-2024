package Recursion;

public class RecursionExample {
    public static void main(String[] args) {
        int number = 5;
        System.out.println("From recursive method: " + getFactorial(number));
        System.out.println("From hard coded: " + 5 * 4 * 3 * 2 * 1);

        System.out.println(getFib(1));
        System.out.println(getFib(4));
        System.out.println(getFib(10));
    }

    public static int getFactorial(int x){
        if(x == 1){
            return 1;
        }
        return x * getFactorial(x - 1);
    }

    /*
    getFib(1) = 0;
    getFib(4) = 2;
    getFib(10) = 34;
     */
    public static int getFib(int x){
        if(x == 1){
            return 0;
        }
        else if(x == 2){
            return 1;
        }
        return getFib(x-1)+getFib(x-2);

    }
}
