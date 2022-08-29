package com.example.demo.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.demo.entity.ExamEntity;
import com.example.demo.entity.ResultEntity;
import com.example.demo.entity.StudentEntity;
@Component
@Service
public interface StaffService {
	
	public void addStudent(StudentEntity stu);
	public void addExam(ExamEntity ex);
	public void addResult( ResultEntity re);

}
