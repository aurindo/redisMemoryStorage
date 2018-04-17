package br.com.aurindo.orders.repository;

import br.com.aurindo.orders.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, String> {}