package cn.itcast.a;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext_aspectj.xml")
public class SprintTest {
    @Autowired
    @Qualifier("accountService")
    private AccountService accountService;

    @Test
    public void zhuanzhang() {
        // 目标: 给业务类的方法 增加事务, 但是 不允许改变 业务类的方法的代码
        accountService.zhuanzhang("麻少飞", "张嘉敏", 7777777);
    }
}
