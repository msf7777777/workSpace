package cn.itcast.service;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//让 spring 和 junit 整合
@RunWith(SpringJUnit4ClassRunner.class)
//告诉 spring 配置文件的位置
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class ProductServiceTest {

    @Autowired
    @Qualifier("productService")
    private ProductService productService;


    /**
     * 查询所有
     */
    @org.junit.Test
    public void queryAll() {
        productService.queryAll();
    }

    /**
     * 新增商品
     */
    @org.junit.Test
    public void insertProduct() {
        productService.insertProduct();
    }

    /**
     * 修改商品
     */
    @org.junit.Test
    public void updateProduct() {
        productService.updateProduct();
    }

    /**
     * 根据编号删除商品
     */
    @org.junit.Test
    public void delById() {
        productService.delById();
    }
}
