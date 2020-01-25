package com.springboot.repositories;

import com.springboot.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepositories extends JpaRepository<Student, Long> {
    List<Student> findAllByName(String name);
}
