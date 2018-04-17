package br.com.aurindo.orders.service;

import br.com.aurindo.orders.model.Student;
import br.com.aurindo.orders.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterStudentsService {

    @Autowired
    private StudentRepository studentRepository;

    public Iterable<Student> enrolleStudents() {

         String id = new Integer(new Double(Math.random() * 10000).intValue()).toString();

        Student student = new Student(id, "John", Student.Gender.MALE, 1);

        System.out.println(studentRepository.findAll());

        studentRepository.save(student);
        System.out.println("The student has been enrolled");

        Iterable<Student> students = studentRepository.findAll();

        System.out.println(students);

        return students;
    }

}
