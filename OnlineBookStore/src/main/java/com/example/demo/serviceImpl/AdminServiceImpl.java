package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.Repo.AdminRepo;
import com.example.demo.entity.Admin;
import com.example.demo.entity.Login;
import com.example.demo.service.AdminService;
import com.example.demo.service.LoginService;


@Component
public class AdminServiceImpl implements AdminService {
	@Autowired
	AdminRepo adr;
	@Autowired
	LoginService serv;

	@Override
	public String admi(Admin s) {
		// TODO Auto-generated method stub
		adr.save(s);
		return "Data Admin Added";
	}

	@Override
	public List<Admin> showdet() {
		// TODO Auto-generated method stub
		return adr.findAll();
	}

	@Override
	public String update(Admin s) {
		// TODO Auto-generated method stub
		adr.save(s);
		return "Data Admin updated";
	}

	@Override
	public String delete(long id) {
		// TODO Auto-generated method stub
		adr.deleteById(id);
		return "Data deleted of admin";
	}

	@Override
	public String sucessSignin(long id, String email, String pass) {
		// TODO Auto-generated method stub
		List<Login> sign = serv.showdet();
		for (Login s : sign) {
			System.out.println("i am in for");
			System.out.println(s);
			if (s.getId() == id && s.getEmail().equals(email) && s.getPass().equals(pass)) {
				System.out.println("i am in if");
				return "Login Success";
			}
		}
		return "invalid login";
	}
}