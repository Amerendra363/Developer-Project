package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;




@RestController
@RequestMapping("/User")
public class UserController {
@Autowired
UserService service;

@GetMapping("/{id}/{pass}/{email}")
public String signupcheck(@PathVariable("id") long id, @PathVariable("pass") String pass,
		@PathVariable("email") String email) {
	return service.sucessSignin(id, email, pass);
}


@GetMapping("/")
public List<User> details() {
	return service.showdet();
}

@PostMapping("/")
public String adddetails(@RequestBody User s) {
	return service.use(s);
}

@PutMapping("/")
public String updatedetails(@RequestBody User s) {
	return service.update(s);
}

@DeleteMapping("/{id}")

public String deletedetails(@PathVariable("id") long id) {
	return service.delete(id);
}
}

