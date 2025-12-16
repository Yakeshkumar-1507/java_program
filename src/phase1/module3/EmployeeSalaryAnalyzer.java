package phase1.module3;

import java.util.Scanner;

public class EmployeeSalaryAnalyzer {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of employees: ");
        int number = input.nextInt();


        System.out.println("Enter the employee salaries: ");
        int salaries[] = new int[number];
        for (int i = 0; i < number; i++) {
            salaries[i] = input.nextInt();
        }

        int choice;

        do {
            System.out.println("---------------Employee Salary Analyzer--------------");
            System.out.println("1. Max Salary");
            System.out.println("2. Min Salary");
            System.out.println("3. Average Salary");
            System.out.println("4. Sort Salaries (Ascending)");
            System.out.println("5. Sort Salaries (Descending)");
            System.out.println("6. Count Employee Salaries above average ");
            System.out.println("7. Search Salary");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1 -> System.out.println("Maximum salary: " + getMaxSalary(salaries));
                case 2 -> System.out.println("Minimum salary: " + getMinSalary(salaries));
                case 3 -> System.out.println("Average salary: " + averageSalary(salaries));
                case 4 -> sortAscending(salaries);
                case 5 -> sortDescending(salaries);
                case 6 -> countAverageSalary(salaries);
                case 7 -> {
                    System.out.println("Enter the salary");
                    int salary = input.nextInt();
                    System.out.println(searchSalary(salaries, salary));
                }
                case 0 -> {
                    System.out.println("Exit");
                    System.exit(0);
                }
                default -> System.out.println("Invalid choice");
            }

        } while (choice != 0);
    }

    static int getMaxSalary(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static int getMinSalary(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    static int averageSalary(int[] arr) {
        int sum = ArrayExample.sumOfArrays(arr);
        return sum / arr.length;
    }

    static void sortAscending(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Salaries in Ascending order: ");
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    static void sortDescending(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Salaries in Ascending order: ");
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    static String searchSalary(int[] arr, int salary) {
        for (int j : arr) {
            if (j == salary) {
                return "Salary found";
            }
        }
        return "Salary not found";
    }

    static void countAverageSalary(int[] arr) {
        int avg = averageSalary(arr);
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > avg) {
                count++;
            }
        }
        System.out.println("Count of Average Salary: " + count);

    }
}
