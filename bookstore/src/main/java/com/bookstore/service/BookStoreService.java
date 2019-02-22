package com.bookstore.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bookstore.vo.BookAuthor;

@Service
public interface BookStoreService {

	public void addBook(BookAuthor bookAuthor);
	
	public List<BookAuthor> findAllBook();
}
