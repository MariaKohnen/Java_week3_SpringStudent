package com.example.java_week3_springstudent.controller;

import com.example.java_week3_springstudent.model.Student;
import com.example.java_week3_springstudent.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("student") //http://localhost:8080/student
public class StudentController {

    StudentService service = new StudentService();

    @GetMapping
    public List<Student> getAllStudents() {
        return service.getAllStudents();
    }

    @GetMapping(path = "{id}")
    public Student getStudentByID(@PathVariable String id) {
        return service.getStudentByID(id);
    }

    @PostMapping
    public Student addStudent(@RequestBody Student student) {
        return service.addStudent(student);
    }

    @DeleteMapping(value = "{id}")
    public Student removeStudentById(@PathVariable String id) {
        return service.removeStudentById(id);

    }

    @PutMapping("/updateStudents")
    public Student updateNameOfStudentById(@RequestBody Student student) {
        return service.updateNameOfStudentById(student);
    }

}
