package cn.itcast.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/applicationContext_dao.xml")
public class AccountMapperTest {

    @Autowired
    @Qualifier("accountMapper")
    private AccountMapper accountMapper;

    //收款
    @Test
    public void in() {
        accountMapper.in("腾讯QQ", 1000);
    }

    //充值
    @Test
    public void out() {
        accountMapper.out("张嘉敏", 1000);
    }
}