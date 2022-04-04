package com.example.java_week3_springstudent.controller;

import com.example.java_week3_springstudent.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("student") //http://localhost:8080/student
public class StudentController {

    @GetMapping
    public List<Student> getAllStudents() {

        return List.of(new Student("Hanna", "101"), new Student("Tobias", "202"));
    }

}
