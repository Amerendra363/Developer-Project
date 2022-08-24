package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.entity.User;


@Component
public interface UserService {

public String sucessSignin(long id,String email,String pass);
public String use(User s);
public List<User> showdet();
public String update(User s);
public String delete(long id);
}