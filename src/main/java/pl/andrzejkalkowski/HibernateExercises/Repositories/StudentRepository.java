package pl.andrzejkalkowski.HibernateExercises.Repositories;

import org.springframework.stereotype.Component;
import pl.andrzejkalkowski.HibernateExercises.Models.Student;

import java.util.ArrayList;
import java.util.List;

@Component
public class StudentRepository {
    List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public Student findOne(Long id) {
        for (Student s : students) {
            if (s.getId().equals(id)) {
                return s;
            }
        }
        throw new IllegalArgumentException("sudent with id=" + id + " not found");
    }

    public List<Student> findAll() {
        return students;
    }

    public Student save(Student student) {
        students.add(student);
        return student;
    }
}
