package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Book;
import com.example.demo.service.BookService;


@RestController
@RequestMapping("/book")
public class BookController {
	@Autowired
	BookService book;


	@GetMapping("/")
	public List<Book> disbook()
	{
		return book.display();
	}

	@PostMapping("/")
	public String addbook(@RequestBody Book e)
	{
		return book.addbook(e);
	}
	@PutMapping("/{id}")
	public void editbook(@PathVariable("id")long id) {
		
	}
}