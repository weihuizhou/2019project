package com.bookstore.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.bookstore.vo.AuthorVo;
import com.bookstore.vo.BookAuthor;
import com.bookstore.vo.BookVo;

@Repository
public interface BookStoreDao {

	public AuthorVo findAuthorById(int id);
	
	public List<AuthorVo> findAuthorAll();
	
	public void addAuthor(AuthorVo authorVo);
	
	public void modAuthor(AuthorVo authorVo);
	
	public BookVo findBookVoById(int id);
	
	public List<BookAuthor> findBookAll();
	
	public void addBook(BookVo bookVo);
	
	public void modBook(BookVo bookVo);
	
	public void addBookAuthor(@Param("bookId")String bookId,@Param("authorId")String authorId);
}
