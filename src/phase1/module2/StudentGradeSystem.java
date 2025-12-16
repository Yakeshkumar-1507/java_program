package phase1.module2;

import java.util.Scanner;

public class StudentGradeSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String choice;
        int passedCount = 0, failedCount = 0;
        do {
            System.out.println("Enter student name :");
            String name = sc.next();

            System.out.println("Enter marks : ");
            int marks = sc.nextInt();

            if (marks < 0 || marks > 100) {
                System.out.println("Invalid marks");
            }

            String grade;
            if (marks > 90) {
                grade = "A";
                passedCount++;
            } else if (marks > 75) {
                grade = "B";
                passedCount++;
            } else if (marks > 55) {
                grade = "C";
                passedCount++;
            } else if (marks > 40) {
                grade = "D";
                passedCount++;
            } else {
                grade = "Fail";
                failedCount++;
            }

            System.out.println("Student Name : " + name);
            System.out.println("Student Marks : " + marks);
            System.out.println("Student Grade : " + grade);

            System.out.println("Do you want to continue? y/n");
            choice = sc.next();
        } while (choice.equalsIgnoreCase("y"));

        System.out.println("Number of passed students : " + passedCount);
        System.out.println("Number of failed students : " + failedCount);
    }
}
