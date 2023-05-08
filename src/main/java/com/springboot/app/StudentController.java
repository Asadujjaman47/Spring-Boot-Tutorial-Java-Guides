package com.springboot.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    // http://localhost:8090/student
    @GetMapping("/student")
    public Student getStudent() {
        return new Student("Md. ", "Asad");
    }


    @GetMapping("/students")
    public List<Student> getStudents() {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Md. ", "Asad"));
        students.add(new Student("B ", "E"));
        students.add(new Student("C ", "F"));
        students.add(new Student("D", "G"));

        return students;
    }

    // http://localhost:8080/student/mohammad/ali
    // @PathVariable annotation
    @GetMapping("/student/{firstName}/{lastName}")
    public Student studentPathVariable(@PathVariable("firstName") String firstName, @PathVariable("lastName") String lastName) {
        return new Student(firstName, lastName) ;
    }
}
