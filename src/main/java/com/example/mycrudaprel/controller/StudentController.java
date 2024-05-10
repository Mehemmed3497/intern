package com.example.mycrudaprel.controller;

import com.example.mycrudaprel.entity.Student;
import com.example.mycrudaprel.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class StudentController {
    @Autowired
    public StudentService studentService;

    @GetMapping("/students")
    public List<Student> studentFindALl() {
        List<Student> studentList = studentService.findAllStudent();
        return studentList;
    }

    @GetMapping("/students/{id}")
    public Student studentById(@PathVariable Long id){
      return   studentService.findById(id);
    }

    @PostMapping
    public void  studentById(@RequestBody Student student){
           studentService.create(student);
    }



}
