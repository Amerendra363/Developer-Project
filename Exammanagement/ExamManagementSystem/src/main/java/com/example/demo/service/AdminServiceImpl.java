package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entity.AdminEntity;
import com.example.demo.entity.ExamEntity;
import com.example.demo.entity.ResultEntity;
import com.example.demo.entity.StaffEntity;
import com.example.demo.entity.StudentEntity;
import com.example.demo.repo.AdminRepo;
import com.example.demo.repo.ExamRepo;
import com.example.demo.repo.ResultRepo;
import com.example.demo.repo.StaffRepo;
import com.example.demo.repo.StudentRepo;
@Component
public class AdminServiceImpl implements AdminService {
	@Autowired
	AdminRepo adminRepo;
	@Autowired
	StudentRepo studentRepo;
	@Autowired
	ExamRepo examRepo;
	@Autowired
	StaffRepo staffRepo;
	@Autowired
	ResultRepo resultRepo;

	
	@Override
	public List<AdminEntity> details() {
		return adminRepo.findAll();
	}
	public List<AdminEntity> addAdmin(AdminEntity ad) {
		adminRepo.save(ad);
		return adminRepo.findAll();
		
	}
	public List<StudentEntity> addStudent(StudentEntity stu) {
		studentRepo.save(stu);
		return studentRepo.findAll();
	}
	public void addExam(ExamEntity e) {
		examRepo.save(e);
	}
	public void addStaff(StaffEntity sta) {
		staffRepo.save(sta);
	}
	public void addResult(ResultEntity ad) {
		resultRepo.save(ad);
	}
}
