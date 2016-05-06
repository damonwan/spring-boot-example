package com.damon.example.springboot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.damon.example.springboot.entity.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Integer>{
	public Book findByBookName(String bookName);
}
