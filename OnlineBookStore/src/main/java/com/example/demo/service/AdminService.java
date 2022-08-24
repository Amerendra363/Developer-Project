package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.entity.Admin;

@Component
public interface AdminService {

	public String admi(Admin s);
	public List<Admin> showdet();
	public String update(Admin s);
	public String delete(long id);
	public String sucessSignin(long id,String email,String pass);
}
