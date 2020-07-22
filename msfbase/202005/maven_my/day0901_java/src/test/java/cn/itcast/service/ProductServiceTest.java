package cn.itcast.service;

import static org.junit.Assert.*;

public class ProductServiceTest {

    ProductService productService = new ProductService();

    @org.junit.Test
    public void add() {
        productService.add();
    }

    @org.junit.Test
    public void del() {
        productService.del();
    }

    @org.junit.Test
    public void update() {
        productService.update();
    }

    @org.junit.Test
    public void query() {
        productService.query();
    }
}