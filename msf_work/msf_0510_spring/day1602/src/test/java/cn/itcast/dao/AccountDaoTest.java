package cn.itcast.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class AccountDaoTest {

    @Autowired
    @Qualifier("accountDao")
    private AccountDao accountDao;

    //转账
    @Test
    public void out() {
        accountDao.out("麻少飞", -7);
        System.out.println(accountDao);
    }

    //收款
    @Test
    public void in() {
        accountDao.in("张嘉敏", 6);
    }

    //买礼物
    @Test
    public void zhuanzhang1() {
//        accountDao.zhuanzhang("麻少飞", "张嘉敏", -7777777);
        accountDao.zhuanzhang("麻少飞", "张嘉敏", 7777777);
        System.out.println("麻少飞 给 张嘉敏 转账：7777777 元钱");
    }
}