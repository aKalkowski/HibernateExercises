package pl.andrzejkalkowski.HibernateExercises.Models;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Student {

    private static final Student EMPTY_STUDENT = new Student(" ", " ", " ");

    @Id
    @GeneratedValue
    Long id;

    String name;
    String surname;
    String email;

    public Student() {
    }

    public Student(String name, String surname, String email) {
        this.name = name;
        this.surname = surname;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static Student emptyStudent() {
        return EMPTY_STUDENT;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
