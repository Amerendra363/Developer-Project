package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.StudentEntity;

public interface StudentRepo extends JpaRepository<StudentEntity, Integer> {

}