package cn.itcast.service.impl;

import cn.itcast.service.ProductService;
import org.springframework.stereotype.Service;
import org.springframework.web.context.ContextLoaderListener;

import java.util.Date;

@Service("productService")
public class ProductServiceImpl implements ProductService {

    public ProductServiceImpl() {
        System.out.println("调用 ProductServiceImpl 的构造方法... ...");
    }

    @Override
    public void queryAll() {
        System.out.println("1 业务层 查询所有商品... ..." + new Date().toLocaleString());
        ContextLoaderListener cll;
        // org.springframework.web.context.ContextLoaderListener
    }

    @Override
    public void insertProduct() {
        System.out.println("2 新增商品.. ...");
    }

    @Override
    public void updateProduct() {
        System.out.println("3 修改商品.. ...");
    }

    @Override
    public void delById() {
        System.out.println("4 根据id删除商品.. ...");
    }
}
