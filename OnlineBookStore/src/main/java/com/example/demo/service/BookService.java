package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.entity.Book;


@Component
public interface BookService {

public String addbook(Book bk);
public List<Book>display();
public String update(Book s);
public String delete(long id);

}
