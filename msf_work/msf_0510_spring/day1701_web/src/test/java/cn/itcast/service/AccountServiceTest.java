package cn.itcast.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
/**
 * 加载配置文件 方式一
 *  @ContextConfiguration(locations = {"classpath:spring/applicationContext_service.xml",
 *                                     "classpath:spring/applicationContext_dao.xml"})
 */
// 加载配置文件 方式二
@ContextConfiguration(locations = "classpath:spring/applicationContext_*.xml")
public class AccountServiceTest {

    @Autowired
    private AccountService accountService;

    @Test
    public void zhuanzhang() {

        accountService.zhuanzhang("腾讯QQ", "张嘉敏", 1000);

    }
}