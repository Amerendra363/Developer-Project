package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.Repo.LoginRepo;
import com.example.demo.entity.Login;
import com.example.demo.service.LoginService;


@Component
public class LoginServiceImpl implements LoginService{
@Autowired
LoginRepo repo;

@Override
public String signin(Login s) {
	// TODO Auto-generated method stub
	repo.save(s);
	return "Signin successfully done";
}

@Override
public List<Login> showdet() {
	// TODO Auto-generated method stub
	return repo.findAll();
}

@Override
public String update(Login s) {
	// TODO Auto-generated method stub
	repo.save(s);
	return "Updated successfully";
}

@Override
public String delete(long id) {
	// TODO Auto-generated method stub
	repo.deleteById(id);
	return "Data deleted successfully";
}
	
}
