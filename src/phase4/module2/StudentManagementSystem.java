package phase4.module2;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class Student {
    int id;
    String name;
    int marks;

    public Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}

class StudentService {
    private Set<Student> students = new TreeSet<Student>(
            Comparator.comparingInt((Student student) -> student.marks)
                    .reversed()
                    .thenComparingInt(s -> s.id)
    );

    public void addStudent(Student student){
        students.add(student);
    }

    public void viewStudents(){
        students.forEach(System.out::println);
    }
}

public class StudentManagementSystem {

    public static void main(String[] args) {

        StudentService studentService = new StudentService();
        studentService.addStudent(new Student(1, "Jack", 80));
        studentService.addStudent(new Student(2, "Jill", 90));
        studentService.addStudent(new Student(3, "James", 90));
        studentService.addStudent(new Student(3, "Arun", 70));

        studentService.viewStudents();

    }
}
