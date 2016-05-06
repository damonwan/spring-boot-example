package com.damon.example.springboot.controller;

import javax.annotation.Resource;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.damon.example.springboot.entity.Book;
import com.damon.example.springboot.service.BookService;

@RestController
@EnableAutoConfiguration
public class BookController {
	
	@Resource
	private BookService bookService;

	@RequestMapping(value ="/hello", method = RequestMethod.GET)
    @ResponseBody
    public String hello(){
        return "hello world";
    }
	
	@RequestMapping(value ="/book/{bookName}", method = RequestMethod.GET)
    @ResponseBody
    public String query(@PathVariable String bookName){
		Book book = bookService.findByBookName(bookName);
		return book.toString();
    }

}
