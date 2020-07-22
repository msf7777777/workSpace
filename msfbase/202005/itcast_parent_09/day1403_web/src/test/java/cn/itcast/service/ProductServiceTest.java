package cn.itcast.service;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

// spring和junit整合
@RunWith(SpringJUnit4ClassRunner.class)
// 告诉spring配置文件的位置
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class ProductServiceTest {

    @Autowired
    @Qualifier("productService")
    private ProductService productService;

    @org.junit.Test
    public void queryAll() {
        productService.queryAll();
    }

    @org.junit.Test
    public void insertProduct() {
        productService.insertProduct();
    }

    @org.junit.Test
    public void updateProduct() {
        productService.updateProduct();
    }

    @org.junit.Test
    public void delById() {
        productService.delById();
    }
}
