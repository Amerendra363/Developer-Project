package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entity.ExamEntity;
import com.example.demo.entity.ResultEntity;
import com.example.demo.entity.StudentEntity;
import com.example.demo.repo.ExamRepo;
import com.example.demo.repo.ResultRepo;
import com.example.demo.repo.StudentRepo;
@Component
public class StaffServiceImpl {
	
	
	@Autowired
	StudentRepo studentRepo;
	@Autowired
	ExamRepo examRepo;
	@Autowired
	ResultRepo resultRepo;

	
	
	public void addStudent(StudentEntity stu) {
		studentRepo.save(stu);
	}
	public void addExam(ExamEntity e) {
		examRepo.save(e);
	}
	public void addResult(ResultEntity ad) {
		resultRepo.save(ad);
	}

}
