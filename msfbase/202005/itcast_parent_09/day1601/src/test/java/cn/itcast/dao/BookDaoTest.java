package cn.itcast.dao;

import cn.itcast.pojo.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class BookDaoTest {

    @Autowired
    @Qualifier("bookDao")
    private BookDao bookDao;

    @Test
    public void addBook() {
        Book book = new Book(0, "打狗棍", 28);
        bookDao.addBook(book);
    }

    @Test
    public void delById() {
        bookDao.delById(5);
    }

    @Test
    public void updateBook() {
        Book book = new Book(3, "葵花宝典", 5);
        bookDao.updateBook(book);
    }

    @Test
    public void getNameById() {
        String bookName = bookDao.getNameById(3);

        System.out.println(bookName);
    }

    @Test
    public void getTotalCount() {
        Integer totalCount = bookDao.getTotalCount();

        System.out.println("totalCount = " + totalCount);
    }

    @Test
    public void queryBookById() {
        Book book = bookDao.queryBookById(2);

        System.out.println(book);
    }

    @Test
    public void queryAll() {
        List<Book> bookList = bookDao.queryAll();
        for (Book book : bookList) {
            System.out.println("====================");
            System.out.println(book);
        }
    }

}