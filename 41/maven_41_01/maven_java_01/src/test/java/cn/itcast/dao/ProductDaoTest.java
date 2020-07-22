package cn.itcast.dao;

import org.junit.Test;

import static org.junit.Assert.*;

public class ProductDaoTest {

    @Test
    public void add() {
        ProductDao productDao = new ProductDao();
        productDao.add();
    }

    @Test
    public void del() {
        ProductDao productDao = new ProductDao();
        productDao.del();
    }

    @Test
    public void edit() {
        ProductDao productDao = new ProductDao();
        productDao.edit();
    }

    @Test
    public void query() {
        ProductDao productDao = new ProductDao();
        productDao.query();
    }
}