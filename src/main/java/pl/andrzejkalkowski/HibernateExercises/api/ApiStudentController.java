package pl.andrzejkalkowski.HibernateExercises.api;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.andrzejkalkowski.HibernateExercises.Models.Student;
import pl.andrzejkalkowski.HibernateExercises.services.StudentService;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/api/students")
public class ApiStudentController {

    @Autowired
    StudentService studentService;

    @GetMapping(value = "/showall")
    @ResponseBody
    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();
        for (Student iterStudent : studentService.findAll()) {
            students.add(iterStudent);
        }
        return students;
    }

    @GetMapping(value = "/{id}")
    @ResponseBody
    public Student getAllStudents(@PathVariable Long id) {
        Student student = studentService.findOne(id);
        return student;
    }

    @PostMapping(value = "")
    @ResponseBody
    public void saveStudent(@RequestBody Student student) {
        studentService.save(student);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteStudent(@PathVariable Long id) {
        studentService.delete(id);
    }
}
