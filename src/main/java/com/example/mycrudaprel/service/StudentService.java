package com.example.mycrudaprel.service;

import com.example.mycrudaprel.entity.Student;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface StudentService {
   List<Student> findAllStudent();
   Student findById(Long id);
   void create(Student student);
   void  update(Long id,Student student);
   void delete(Long id);

}
