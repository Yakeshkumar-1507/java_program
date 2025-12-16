package phase1.module3;

public class FunctionExample {

    //non return function

    static void message(String name) {
        System.out.println("Welcome " + name);
    }

    // return function
    static boolean checkPalindrome(int number) {
        int temp = number;
        int result = 0;

        while (number != 0) {
            int remainder = number % 10;
            result = result * 10 + remainder;
            number = number / 10;
        }
        return temp == result;
    }

    public static void main(String[] args) {
        message("Yakesh Kumar");
        boolean output = checkPalindrome(121);
        String message = output ? "Its a palindrome number " : "Not a palindrome number ";
        System.out.println(message);
    }
}
