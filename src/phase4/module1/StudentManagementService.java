package phase4.module1;

import java.util.ArrayList;
import java.util.List;

class Student {
    int id, marks;
    String name;

    public Student(int id, int marks, String name) {
        this.id = id;
        this.marks = marks;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", marks=" + marks +
                ", name='" + name + '\'' +
                '}';
    }
}

class StudentService {

    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        if (getStudent(student.id) != null) {
            System.out.println("Student already exists!");
            return;
        }
        students.add(student);
        System.out.println("Student added successfully");
    }

    public void viewStudents() {
        students.forEach(System.out::println);
    }

    public void removeStudent(int id) {
        students.removeIf(student -> student.id == id);
    }

    public Student getStudent(int id) {
        return students.stream().filter(student -> student.id == id).findFirst().orElse(null);
    }

    public void updateMarks(int id, int marks) {
        Student student = getStudent(id);
        if (student != null) {
            student.marks = marks;
            System.out.println("Student marks updated successfully");
        } else {
            System.out.println("Student not found!");
        }
    }

    public void showTopper() {
        try {
            if (students.isEmpty()) {
                System.out.println("Student list is empty!");
                return;
            }
            Student topper = students.get(0);
            for (Student s : students) {
                if (s.marks > topper.marks) {
                    topper = s;
                }
            }
            System.out.println("Student topper is " + topper);
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("Student list is empty!");
        }
    }
}

public class StudentManagementService {

    public static void main(String[] args) {
        StudentService studentService = new StudentService();

        studentService.addStudent(new Student(1,70,"Ravi"));
        studentService.addStudent(new Student(2,30,"Anil"));
        studentService.addStudent(new Student(1,40,"Mathes"));

        studentService.viewStudents();

        studentService.updateMarks(2,80);

        studentService.viewStudents();

        studentService.showTopper();

        studentService.removeStudent(1);

        studentService.viewStudents();
    }
}
