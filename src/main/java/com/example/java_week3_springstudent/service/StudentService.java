package com.example.java_week3_springstudent.service;

import com.example.java_week3_springstudent.model.Student;
import com.example.java_week3_springstudent.repository.StudentRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    StudentRepo repo = new StudentRepo();

    public List<Student> getAllStudents() {
        return repo.getAllStudents();
    }

    public Student getStudentByID(String id) {
        return repo.getStudentByID(id);
    }

    public Student addStudent(Student student) {
        return repo.addStudent(student);
    }

    public Student removeStudentById(String id) {
        return repo.removeStudentById(id);
    }

    public Student updateNameOfStudentById(Student student) {
        return repo.updateNameOfStudentById(student);
    }
}
