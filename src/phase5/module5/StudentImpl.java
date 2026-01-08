package phase5.module5;

import java.util.ArrayList;
import java.util.List;

public class StudentImpl implements StudentDAO {

    List<Student> students = new ArrayList<>();

    public List<Student> getAllStudents() {
        students.add(new Student(1L, "John", "Doe", "Computer Science"));
        students.add(new Student(2L, "Jane", "Smith", "Mathematics"));
        students.add(new Student(3L, "Alice", "Johnson", "Physics"));
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public String removeStudent(Long id) {
        for (Student student : students) {
            if (student.getId().equals(id)) {
                students.remove(student);
                return "Student removed successfully";
            }
        }
        return "Student not found";
    }
}
