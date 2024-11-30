package com.cjc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.model.Student;

@Repository
public interface StudentRepository  extends JpaRepository<Student,Integer>{

}
