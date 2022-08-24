package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.entity.Login;


@Component
public interface LoginService {
public String signin(Login s);
public List<Login> showdet();
public String update(Login s);
public String delete(long id);

}
