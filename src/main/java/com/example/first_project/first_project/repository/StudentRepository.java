package com.example.first_project.first_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.first_project.first_project.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
    void deleteByEmail(String email);
    Student findStudentByEmail(String email);
}
