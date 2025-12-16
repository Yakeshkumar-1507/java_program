package phase1;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char choice;

        do {
            System.out.println("Enter first number");
            int a = sc.nextInt();
            System.out.println("Enter second number");
            int b = sc.nextInt();

            System.out.println("Enter operator(+,-,*,/)");
            char operator = sc.next().charAt(0);
            switch (operator) {
                case '+':
                    System.out.println(a + b);
                    break;
                case '-':
                    System.out.println(a - b);
                    break;
                case '*':
                    System.out.println(a * b);
                    break;
                case '/':
                    if (b == 0) {
                        System.out.println("Cannot divide by zero");
                    }
                    System.out.println(a / b);
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
            System.out.println("Enter do you want continue (y/n) ?");
            choice = sc.next().charAt(0);
        } while (choice == 'Y' || choice == 'y');

        System.out.println("calculator exited. GoodBye!!!!");
        sc.close();
    }
}
