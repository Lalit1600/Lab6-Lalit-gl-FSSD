package com.greatlearning.StudentManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.StudentManagementSystem.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}