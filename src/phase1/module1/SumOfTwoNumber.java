package phase1.module1;

import java.util.Scanner;

public class SumOfTwoNumber {

    static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();

        int result = sum(a, b);
        System.out.println("Sum of two numbers is: " + result);
    }
}
