package com.example.first_project.first_project.service;

import java.util.List;

import com.example.first_project.first_project.model.Student;

public interface StudentService {

    public List<Student> findAllStudent();
    Student saveStudent(Student student);
    Student findByEmail(String email);
    Student updateStudent(Student student);
    void deleteStudent(String email);
}