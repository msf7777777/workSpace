package cn.itcast.c;

import cn.itcast.b.ProductService;
import cn.itcast.b.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class SpringTest {

    @Autowired
    @Qualifier("userService")
    private UserService userService;

    @Autowired
    @Qualifier("productService")
    private ProductService productService;

    @Test
    public void demo01() {
        productService.add();
        productService.del();
        productService.update();
        productService.query();
    }

    @Test
    public void demo02() {
        userService.add();
        userService.del();
        userService.update();
        userService.query();
    }

}
