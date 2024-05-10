package com.example.mycrudaprel.service.impl;

import com.example.mycrudaprel.entity.Student;
import com.example.mycrudaprel.repository.StudentRepository;
import com.example.mycrudaprel.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    public StudentRepository studentRepository;


    @Override
    public List<Student> findAllStudent() {
        List<Student> students = studentRepository.findAll();
        return students;
    }



    @Override
    public Student findById(Long id) {
        Student empty = null;
        if (studentRepository.findById(id).isPresent()) {
            return studentRepository.findById(id).get();
        } else {
            return empty;
        }

    }

    @Override
    public void create(Student student) {
        studentRepository.save(student);

    }

    @Override
    public void update(Long id, Student student) {
        Student oldStudent = findById(id);
        oldStudent.setName(student.getName());
        oldStudent.setLastname(student.getLastname());
        oldStudent.setAge(student.getAge());
        oldStudent.setPrice(student.getPrice());


    }

    @Override
    public void delete(Long id) {
        studentRepository.deleteById(id);

    }
}
