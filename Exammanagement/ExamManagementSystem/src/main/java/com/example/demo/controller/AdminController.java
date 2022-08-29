package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.AdminEntity;
import com.example.demo.entity.ExamEntity;
import com.example.demo.entity.ResultEntity;
import com.example.demo.entity.StaffEntity;
import com.example.demo.entity.StudentEntity;
import com.example.demo.service.AdminService;

@RestController
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	AdminService service;
	@GetMapping("/")
	public List<AdminEntity> showAdmin(AdminEntity admin) {
		return service.details();
	}
	@PostMapping("/")
	public List<AdminEntity> addAdmin(@RequestBody AdminEntity ad) {
		return service.addAdmin(ad);
	}
	@GetMapping("/student")
	public List<StudentEntity> showStudent(@RequestBody StudentEntity stu) {
		return service.showStudent();
	}
	@PostMapping("/student")
	public List<StudentEntity> addStudent(@RequestBody StudentEntity stu) {
		return service.addStudent(stu);
	}
	@PostMapping("/staff")
	public void addStaff(@RequestBody StaffEntity sta) {
		service.addStaff(sta);
	}
	@PostMapping("/exam")
	public void addExam(@RequestBody ExamEntity ex) {
		service.addExam(ex);
	}
	@PostMapping("/result")
	public void addResult(@RequestBody ResultEntity re) {
		service.addResult(re);
	}

}
