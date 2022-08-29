package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.demo.entity.AdminEntity;
import com.example.demo.entity.ExamEntity;
import com.example.demo.entity.ResultEntity;
import com.example.demo.entity.StaffEntity;
import com.example.demo.entity.StudentEntity;
@Component
@Service
public interface AdminService {
	public List<AdminEntity> details();
	public List<AdminEntity> addAdmin(AdminEntity ad);
	
	public void addStaff(StaffEntity sta);
	
	public List<StudentEntity> showStudent();
	public List<StudentEntity> addStudent(StudentEntity stu);
	
	
	public void addExam(ExamEntity ex);
	
	
	public void addResult( ResultEntity re);

}
