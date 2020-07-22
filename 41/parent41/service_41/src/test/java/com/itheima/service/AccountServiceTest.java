package com.itheima.service;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class AccountServiceTest {

    //测试service的转账方法transfer
    @Test
    public void transfer() throws IOException {
        AccountService service = new AccountServiceImpl();
        service.transfer("aaa","bbb",500);
    }
}