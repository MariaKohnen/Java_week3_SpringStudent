package com.example.java_week3_springstudent.repository;

import com.example.java_week3_springstudent.model.Student;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentRepo {

    Map<String, Student> students = new HashMap<>();

    public StudentRepo() {
    }

    public List<Student> getAllStudents() {
        return List.copyOf(students.values());
    }

    public Student getStudentByID(String id) {
        return students.get(id);
    }

    public Student addStudent(Student student) {
        students.put(student.getId(), student);
        return student;
    }

    public Student removeStudentById(String id) {
        return students.remove(id);
    }

    public Student updateNameOfStudentById(Student student) {
        Student existStudent = students.get(student.getId());
        existStudent.setName(student.getName());
        return student;
    }
}
