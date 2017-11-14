package pl.andrzejkalkowski.HibernateExercises.Repositories;

import org.springframework.data.repository.CrudRepository;
import pl.andrzejkalkowski.HibernateExercises.Models.Student;

public interface StudentCRUDRepository extends CrudRepository<Student, Long> {
}
