package cn.itcast.service;

import org.springframework.stereotype.Service;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
    @Override
    public void add() {
        System.out.println("5.增加客户... ...");
    }

    @Override
    public void del() {
        System.out.println("6.删除客户... ...");
    }

    @Override
    public void edit() {
        System.out.println("7.修改客户... ...");
    }

    @Override
    public void query() {
        System.out.println("8.查询客户... ...");
    }
}
