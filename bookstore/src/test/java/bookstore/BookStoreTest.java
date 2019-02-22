package bookstore;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bookstore.dao.BookStoreDao;
import com.bookstore.vo.AuthorVo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:/*.xml"})
public class BookStoreTest {

	@Resource
    private BookStoreDao bookStoreDao;

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
        System.out.println("×÷Õßid:" + author.getAuthorId());
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
}
