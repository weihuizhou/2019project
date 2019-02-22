package com.bookstore.test;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bookstore.dao.BookStoreDao;
import com.bookstore.service.BookStoreService;
import com.bookstore.vo.AuthorVo;
import com.bookstore.vo.BookAuthor;
import com.bookstore.vo.BookVo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class BookStoreTest {

	@Resource
    private BookStoreDao bookStoreDao;
	
	@Autowired
	private BookStoreService bookStoreService;

    @Test
    public void addAuthor() {
        AuthorVo author = new AuthorVo();
        author.setFirstName("zhou");
        author.setLastName("weihui");
        author.setStreet("longhua");
        author.setCity("shenzhen");
        try {
        	bookStoreDao.addAuthor(author);
		} catch (Exception e) {
			e.printStackTrace();
		}
        System.out.println("����id:" + author.getAuthorId());
    }

    @Test
    public void findAuthorAll() {
        List<AuthorVo> authorList = bookStoreDao.findAuthorAll();
        for (AuthorVo author : authorList) {
            System.out.println(author.getFirstName()+" "+author.getLastName());
        }
    }
    
    @Test
    public void modAuthor() {
    	 AuthorVo author = new AuthorVo();
    	 author.setAuthorId("2");
         author.setFirstName("mali");
         author.setLastName("Deo");
         author.setStreet("longhua");
         author.setCity("shenzhen");
         try {
        	 bookStoreDao.modAuthor(author);
		} catch (Exception e) {
			e.printStackTrace();
		}
         System.out.println(author.getAuthorId() + " " + author.getCity());
         
    }
    
    @Test
    public void addBook() {
        BookVo book = new BookVo();
        book.setTitle("java���˼��");
        book.setDescription("����java������һ����!");
        book.setLongDescription("�ܹ���һǧ��ҳ���ܹ���һǧ��ҳ���ܹ���һǧ��ҳ���ܹ���һǧ��ҳ���ܹ���һǧ��ҳ���ܹ���һǧ��ҳ��");
        try {
        	bookStoreDao.addBook(book);
		} catch (Exception e) {
			e.printStackTrace();
		}
        System.out.println("��id:" + book.getBookId());
    }
    
    @Test
    public void addBookAuthor() {
    	BookAuthor bookAuthor = new BookAuthor();
    	bookAuthor.setTitle("java�������");
    	bookAuthor.setDescription("����java������һ����!");
    	bookAuthor.setLongDescription("�ܹ���һǧ��ҳ���ܹ���һǧ��ҳ���ܹ���һǧ��ҳ���ܹ���һǧ��ҳ���ܹ���һǧ��ҳ���ܹ���һǧ��ҳ��");
    	bookAuthor.setFirstName("��");
    	bookAuthor.setLastName("��");
    	bookAuthor.setStreet("�ֵ�");
    	bookAuthor.setCity("�׶�");
        try {
        	bookStoreService.addBook(bookAuthor);
		} catch (Exception e) {
			e.printStackTrace();
		}
        System.out.println("��id:" + bookAuthor.getBookId());
    }
    
    @Test
    public void findAllBookAuthor() {
        List<BookAuthor> bookAuthorList = bookStoreDao.findBookAll();
        for (BookAuthor book : bookAuthorList) {
            System.out.println(book.getBookId()+" ������"+book.getTitle() + " ����:"+book.getDescription()
            		+" ��������" + book.getLongDescription() +" ���ߣ�"+book.getFirstName()+" "+book.getLastName());
        }
    }
}
