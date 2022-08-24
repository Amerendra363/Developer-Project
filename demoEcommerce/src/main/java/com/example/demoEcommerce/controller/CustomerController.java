package com.example.demoEcommerce.controller;


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

import com.example.demoEcommerce.entity.CustomerEntity;
import com.example.demoEcommerce.entity.ProductEntity;
import com.example.demoEcommerce.repo.CustomerRepo;
import com.example.demoEcommerce.repo.productRepo;


@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	productRepo pRepo;

	@Autowired
	CustomerRepo repo;
	
	@GetMapping("/")
	public List<CustomerEntity> showDetails(){
		
		return repo.findAll();			
	}
	
	@PostMapping("/")
	public List<CustomerEntity> addDetails(@RequestBody CustomerEntity cus){
		
		ProductEntity prod = pRepo.findById(cus.getProduct().getId()).get();
		cus.setProduct(prod);
		repo.save(cus);
		return repo.findAll();
	}
	
	@PutMapping("/")
	public List<CustomerEntity> updateDetails(@RequestBody CustomerEntity cus){
		
		repo.save(cus);
		return repo.findAll();
	}
	

	
	@DeleteMapping("/{id}")
	public List<CustomerEntity> deleteDetails(@PathVariable("id") int id){
		
		repo.deleteById(id);
		return repo.findAll();
	}
	
	
}