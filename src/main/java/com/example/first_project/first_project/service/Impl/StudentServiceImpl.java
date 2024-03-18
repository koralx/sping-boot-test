package com.example.first_project.first_project.service.Impl;

import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.example.first_project.first_project.model.Student;
import com.example.first_project.first_project.repository.StudentRepository;
import com.example.first_project.first_project.service.StudentService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
@Primary
class StudentServiceImpl implements StudentService {

    private final StudentRepository repository;

    @Override
    public void deleteStudent(String email) {
        repository.deleteByEmail(email);
    }

    @Override
    public List<Student> findAllStudent() {
        return repository.findAll();
    }

    @Override
    public Student findByEmail(String email) {
        return repository.findStudentByEmail(email);
    }

    @Override
    public Student saveStudent(Student student) {
        return repository.save(student);
    }

    @Override
    public Student updateStudent(Student student) {
        return repository.save(student);
    }

    
}