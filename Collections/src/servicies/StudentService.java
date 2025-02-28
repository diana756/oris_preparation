package servicies;

import models.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAll();
    void addStudent(Student student);
    void deleteStudent(Student student);
}
