package com.damon.example.springboot.service;

import javax.annotation.Resource;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.damon.example.springboot.entity.Book;
import com.damon.example.springboot.repository.BookRepository;

@Service
public class BookService {
	
	@Resource
	private BookRepository bookRepository;
	
	@Cacheable(value = "bookcache",keyGenerator = "keyGenerator")
	public Book findByBookName(String bookName) {
		System.out.println("no cache");
		return bookRepository.findByBookName(bookName);
	}
}
