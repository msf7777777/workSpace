package cn.itcast.service;

import org.springframework.stereotype.Service;

@Service("productService")
public class ProductServiceImpl implements ProductService {
    @Override
    public void add() {
        System.out.println("1.增加商品 ... ...");
    }

    @Override
    public void del() {
        System.out.println("2.删除商品 ... ...");
    }

    @Override
    public void edit() {
        System.out.println("3.修改商品 ... ...");
    }

    @Override
    public void query() {
        System.out.println("4.查询商品 ... ...");
    }
}
