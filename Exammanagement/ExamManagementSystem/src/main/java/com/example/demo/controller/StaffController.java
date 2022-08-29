package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.entity.ExamEntity;
import com.example.demo.entity.ResultEntity;
import com.example.demo.entity.StudentEntity;
import com.example.demo.service.StaffService;

public class StaffController {
	
	
	
	@Autowired
	StaffService service;
	@PostMapping("/exam")
	public void addExam(@RequestBody ExamEntity ex) {
		service.addExam(ex);
	}
	@PostMapping("/result")
	public void addResult(@RequestBody ResultEntity re) {
		service.addResult(re);
	}
	@PostMapping("/student")
	public void addStudent(@RequestBody StudentEntity stu) {
		service.addStudent(stu);
	}

	


}
