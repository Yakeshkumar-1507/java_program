package phase5.module4;

import java.util.Scanner;

public class HelloWorld {

    /**
     * Need to collect two values from the user a and b
     * need to collect the operation of the symbol -> +-/*
     * return the answer
     * write the logic in function instead of main method
     *
     */

    public int calculator(int a, int b, String operation) {
        return switch (operation) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> a / b;
            default -> 0;
        };
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number a: ");
        int a = sc.nextInt();
        System.out.println("Enter the number b: ");
        int b = sc.nextInt();
        System.out.println("Enter the operation: ");
        String operation = sc.next();

        HelloWorld hw = new HelloWorld();
        System.out.println(hw.calculator(a, b, operation));
    }
}
