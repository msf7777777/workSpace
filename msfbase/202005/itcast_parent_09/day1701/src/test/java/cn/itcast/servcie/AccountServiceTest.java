package cn.itcast.servcie;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
// 加载配置方式一
//@ContextConfiguration(locations = {"classpath:spring/applicationContext_dao.xml","classpath:spring/applicationContext_service.xml"})
// 加载配置方式二
@ContextConfiguration(locations = "classpath:spring/applicationContext_*.xml")
public class AccountServiceTest {

    @Autowired
    private AccountService accountService;

    @Test
    public void zhuanzhang() {
        accountService.zhuanzhang("aaa", "bbb", 300);
    }
}