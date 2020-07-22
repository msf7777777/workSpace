package com.itheima.service;

import java.io.IOException;

public interface AccountService {

    //只有一个转账方法: 该转账方法里面调用了2个dao的方法
    public void transfer(String inName, String outName, double money) throws IOException;
}
