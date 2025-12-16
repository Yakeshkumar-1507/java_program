package phase1.module2;

import java.util.Scanner;

public class ConditionalStatement {

    static Scanner sc = new Scanner(System.in);

    static void ifCondition() {
        System.out.println("Enter the age: ");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }

    }

    static void elseIfCondition() {
        System.out.println("Enter the mark: ");
        int mark = sc.nextInt();
        if (mark >= 90) {
            System.out.println("Grade A");
        }
        else if (mark >= 75) {
            System.out.println("Grade B");
        }
        else if (mark >= 60) {
            System.out.println("Grade C");
        }
        else{
            System.out.println("Fail");
        }
    }

    public static void main(String[] args) {

        ifCondition();
        elseIfCondition();
    }
}
