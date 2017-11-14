package pl.andrzejkalkowski.HibernateExercises.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.andrzejkalkowski.HibernateExercises.Models.Student;
import pl.andrzejkalkowski.HibernateExercises.Repositories.StudentCRUDRepository;
import pl.andrzejkalkowski.HibernateExercises.Repositories.StudentJPARepository;

import java.util.Collections;

@Service
public class StudentService {

    @Autowired
    StudentJPARepository studentJPARepository;

    @Autowired
    StudentCRUDRepository studentCRUDRepository;

    public Student findOne(Long id) {
        try {
            return studentJPARepository.findOne(id);
        } catch (Exception e) {
            e.printStackTrace();
            return Student.emptyStudent();
        }
    }

    public Iterable<Student> findAll() {
        try {
            return studentJPARepository.findAll();
        } catch (Exception e) {
            e.printStackTrace();
            return Collections.emptyList();
        }
    }

    public Student save(Student student) {
        return studentJPARepository.save(student);
    }

    public void delete (Long id) {
        studentJPARepository.delete(id);
    }
}
