package cn.itcast.b;

import java.util.Date;
import java.util.Random;

public class ProductServiceImpl implements ProductService {
    @Override
    public void add() {
        System.out.println("1.增加商品... ...");
        Random r = new Random();
        try {
            Thread.sleep(r.nextInt(1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void del() {
        System.out.println("2.删除商品... ...");
        Random r = new Random();
        try {
            Thread.sleep(r.nextInt(1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update() {
        System.out.println("3.修改商品... ...");
        Random r = new Random();
        try {
            Thread.sleep(r.nextInt(1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void query() {
        System.out.println("4.查询商品... ...");
        Random r = new Random();
        try {
            Thread.sleep(r.nextInt(1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
