package com.bookstore.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.bookstore.dao.BookStoreDao;
import com.bookstore.vo.AuthorVo;
import com.bookstore.vo.BookAuthor;
import com.bookstore.vo.BookVo;



@Transactional
@Component
public class BookStoreServiceImpl implements BookStoreService{

	@Autowired
	private BookStoreDao bookStoreDao;
	
	@Override
	public void addBook(BookAuthor bookAuthor) {
		BookVo book = new BookVo();
		AuthorVo author = new AuthorVo();
		BeanUtils.copyProperties(bookAuthor, book);
		BeanUtils.copyProperties(bookAuthor, author);
		
		bookStoreDao.addAuthor(author);
		bookStoreDao.addBook(book);
		bookStoreDao.addBookAuthor(book.getBookId(), author.getAuthorId());
		
	}

	@Override
	public List<BookAuthor> findAllBook() {
		// TODO Auto-generated method stub
		return bookStoreDao.findBookAll();
	}

	
}
