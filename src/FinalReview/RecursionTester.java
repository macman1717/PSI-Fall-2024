package FinalReview;

public class RecursionTester {
    public static void main(String[] args) {
//        System.out.println(addDigits(123));
        System.out.println(reverseString("Stanley"));

        /*
        Sev11asdfl11asdlfkf11dl1111 -> 5
        if(indexOf("11" < 0){
        return 0;
        }
        return 1 + recursion(word.subString(word.indexOf("11") + 2);
         */


    }
    public static int addDigits(int num){
        if(num == 0){
            return 0;
        }
        return (num % 10) + addDigits(num / 10);
    }

    public static String reverseString(String word){
        if(word.length() == 0){
            return "";
        }
        return word.substring(word.length() - 1, word.length()) + reverseString(word.substring(0, word.length() - 1));
    }
}
