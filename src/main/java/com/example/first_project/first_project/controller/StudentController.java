package com.example.first_project.first_project.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.first_project.first_project.model.Student;
import com.example.first_project.first_project.service.StudentService;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;



@RestController
@RequestMapping("api/v1/students")
@AllArgsConstructor
public class StudentController {
    
    private final StudentService service;
 
    @GetMapping
    public List<Student> findAllStudent() {
        return service.findAllStudent();
    }

    
    @PostMapping("/save_student")
    public Student saveStudent(@RequestBody Student student) {
        return service.saveStudent(student);
    }

    @GetMapping("/{email}")
    public Student findByEmail(@PathVariable("email") String email) {
        return service.findByEmail(email);
    }
    
    @PutMapping("/update_student")
    public Student updateStudent(Student student) {
        return service.updateStudent(student);
    }

    @DeleteMapping("delete_student/{email}")
    public void deleteStudent(@PathVariable("email") String email) {
        service.deleteStudent(email);
    }

    @GetMapping("/")
    public String mainPath(@RequestParam String param) {
        return "index";
    }
    
}
