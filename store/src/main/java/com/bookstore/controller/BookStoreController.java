package com.bookstore.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bookstore.service.BookStoreService;
import com.bookstore.vo.BookAuthor;


@Controller
public class BookStoreController {
	
	@Autowired
	private BookStoreService bookStoreService;

	@RequestMapping(value="/toAddBook")
	public ModelAndView toAddBook() {
		ModelAndView modelAndView = new ModelAndView("addBook","BookAuthor",new BookAuthor());
		modelAndView.setViewName("addBook");
		modelAndView.addObject("genders", new String[]{"F","M"});
		modelAndView.addObject("genders", new String[]{"F","M"});
		return modelAndView;
	}
	
	@RequestMapping(value="/addBook")
	public ModelAndView addBook(BookAuthor book) {
		
		bookStoreService.addBook(book);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("addBook");
		return modelAndView;
	}
	
	@RequestMapping(value="/findBooks")
	public String findBooks(HttpServletRequest request, HttpServletResponse response) {
		
		List<BookAuthor> booklist = bookStoreService.findAllBook();
		for(BookAuthor book : booklist) {
			System.out.println(book.getTitle());
		}
		List<String> list = new ArrayList<String>();  
        list.add("java");  
        list.add("c++");  
        list.add("oracle"); 
		request.setAttribute("list", list);
		request.setAttribute("booklist", booklist);
		/*ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("bookResult");
		modelAndView.addObject("bookList", bookList);*/
		return "bookResult";
	}
}
