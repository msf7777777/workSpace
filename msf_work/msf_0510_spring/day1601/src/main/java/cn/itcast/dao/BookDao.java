package cn.itcast.dao;

import cn.itcast.pojo.Book;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.util.List;

public class BookDao extends JdbcDaoSupport {

    /**
     * 目标: 如何省略 setJdbcTemplate() 方法
     * 解决: 继承某一个父类, 里面封装了这个功能
     * 省略一下代码：
     * private JdbcTemplate jdbcTemplate;
     *
     *     public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
     *         this.jdbcTemplate = jdbcTemplate;
     *     }
     */


    //【增】【增】【增】【增】【增】【增】【增】
    public void addBook(Book book) {
        //书写sql语句
        String sql = "insert into book values(null, ?, ?)";
        //执行sql语句
//        getJdbcTemplate().update(sql, book.getName(), book.getPrice());
        getJdbcTemplate().update(sql, book.getName(), book.getPrice());
    }

    //【删】【删】【删】【删】【删】【删】【删】
    public void delById(int id) {
        //书写sql语句
        String sql = "delete from book where id=?";
        //执行sql语句
        getJdbcTemplate().update(sql, id);
    }

    //【改】【改】【改】【改】【改】【改】【改】
    public void updateBook(Book book) {
        //书写sql语句
        String sql = "update book set name=?, price=? where id=?";
        //执行sql语句
//        getJdbcTemplate().update(sql, book.getName(), book.getPrice());
        getJdbcTemplate().update(sql, book.getName(), book.getPrice(), book.getId());
    }

    //【查】【查】【查】【查】【查】【查】【查】
    // 需求1: 根据编号查询书名
    public String getNameById(int id) {
        //书写sql
        String sql = "select name from book where id=?";
        //执行sql
        String name = getJdbcTemplate().queryForObject(sql,String.class, id);
        //返回结果
        return name;
    }
    // 需求2: 查询总记录数
    public Integer getTotalCount() {
        //书写sql
        String sql = "select count(1) from book";
        //执行sql
        Integer count = getJdbcTemplate().queryForObject(sql, Integer.class);
        //返回结果
        return count;
    }
    // 需求3: 根据编号查询 book信息
    public Book queryBookById(int id) {
        String sql = "select * from book where id=?";
        Book book = getJdbcTemplate().queryForObject(sql,new BeanPropertyRowMapper<Book>(Book.class), id);
        return book;
    }
    // 需求4: 查询所有book集合
    public List<Book> queryAll() {
        String sql = "select * from book";
        List<Book> bookList = getJdbcTemplate().query(sql, new BeanPropertyRowMapper<Book>(Book.class));
        return bookList;
    }
}
