package pl.andrzejkalkowski.HibernateExercises.Repositories;

import pl.andrzejkalkowski.HibernateExercises.Models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentJPARepository extends JpaRepository<Student, Long> {
}
