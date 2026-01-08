package phase5.module5;

import java.util.List;

public interface StudentDAO {

    void addStudent(Student student);
    String removeStudent(Long id);
    List<Student> getAllStudents();
}
