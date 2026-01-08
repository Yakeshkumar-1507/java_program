package phase5.module5;

import java.util.Scanner;

public class Test extends StudentImpl{

    public static void main(String[] args) {

        StudentImpl s = new StudentImpl();
        Scanner sc = new Scanner(System.in);
        char choice;
        do {
            int option;
            System.out.println("Enter the options: ");
            System.out.println("1. Get All Students");
            System.out.println("2. Add Student");
            System.out.println("3. Remove Student");
            System.out.println("Enter your option: ");
            switch (option = sc.nextInt()) {
                case 1:
                    System.out.println("All Students:");
                    for (Student student : s.getAllStudents()) {
                        System.out.println(student.getId() + " "
                                + student.getFirstName() + " " + student.getLastName() + " " + student.getDepartment());
                    }
                    break;
                case 2:
                    System.out.println("Enter id, first name, last name, course");
                    Long id = sc.nextLong();
                    String firstName = sc.next();
                    String lastName = sc.next();
                    String course = sc.next();
                    s.addStudent(new Student(id, firstName, lastName, course));
                    break;
                case 3:
                    System.out.println("Enter id to remove student");
                    Long removeId = sc.nextLong();
                    System.out.println(s.removeStudent(removeId));
                    break;
                default:
                    System.out.println("Invalid option");
            }

            System.out.println("Enter do you want continue (y/n) ?");
            choice = sc.next().charAt(0);
        } while (choice == 'Y' || choice == 'y');

    }
}
