package cn.itcast.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class AccountDaoTest {

    @Autowired
    @Qualifier("accountDao")
    private AccountDao accountDao;

    @Test
    public void out() {
        accountDao.out("麻少飞", 200);
    }

    @Test
    public void in() {
        accountDao.in("张嘉敏", 200);
    }
}