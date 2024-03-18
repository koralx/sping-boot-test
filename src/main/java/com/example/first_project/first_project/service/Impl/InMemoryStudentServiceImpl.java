package com.example.first_project.first_project.service.Impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.first_project.first_project.model.Student;
import com.example.first_project.first_project.repository.InMemoryStudentDAO;
import com.example.first_project.first_project.service.StudentService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class InMemoryStudentServiceImpl implements StudentService{

    private final InMemoryStudentDAO repository;

    @Override
    public List<Student> findAllStudent() {
        return repository.findAllStudent();
    }
    @Override
    public Student updateStudent(Student student) {
        return repository.updateStudent(student);
    }
    @Override
    public Student findByEmail(String email) {
        return repository.findByEmail(email);
    }
    @Override
    public Student saveStudent(Student student) {
        return repository.saveStudent(student);
    }
    @Override
    public void deleteStudent(String email) {
        repository.deleteStudent(email);
    }
}
