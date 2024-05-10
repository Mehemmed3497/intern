package com.example.mycrudaprel.repository;

import com.example.mycrudaprel.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long>  {
}
