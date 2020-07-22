package cn.itcast.dao;

import cn.itcast.pojo.Book;
import com.sun.deploy.panel.ITreeNode;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
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

    //【增】【增】【增】【增】【增】【增】【增】
    @Test
    public void addBook() {
        Book book = new Book(0, "麻少飞的沙雕人生", 7777777);
        bookDao.addBook(book);
    }

    //【删】【删】【删】【删】【删】【删】【删】
    @Test
    public void delById() {
        bookDao.delById(9);
    }

    //【改】【改】【改】【改】【改】【改】【改】
    @Test
    public void updateBook() {
        Book book = new Book(10, "《麻少飞是个乖宝宝》", 1);
        bookDao.updateBook(book);
    }

    //【查】【查】【查】【查】【查】【查】【查】
    //根据ID查名字
    @Test
    public void getNameById() {
        String bookName = bookDao.getNameById(7);
        System.out.println(bookName);
    }
    //查询总记录数
    @Test
    public void getTotalCount() {
        Integer totalCount = bookDao.getTotalCount();
        System.out.println("总记录数是：【" + totalCount + "】");
    }
    @Test
    public void queryBookById() {
        Book queryBookById = bookDao.queryBookById(8);
        System.out.println(queryBookById);
    }
    @Test
    public void queryAll() {
        List<Book> bookList = bookDao.queryAll();
        for (Book book : bookList) {
            System.out.println("*********************************************");
            System.out.println(book);
        }
    }
}