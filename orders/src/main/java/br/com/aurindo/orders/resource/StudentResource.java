package br.com.aurindo.orders.resource;

import br.com.aurindo.orders.model.Student;
import br.com.aurindo.orders.service.RegisterStudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentResource {

    @Autowired
    private RegisterStudentsService registerStudentsService;

    @PostMapping
    public Iterable<Student> enrollStudent() {
        return registerStudentsService.enrolleStudents();
    }

}
