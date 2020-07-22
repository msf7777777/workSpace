package cn.itcast.a_quickstart;

import cn.itcast.b_lifecycle.LifecycleBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SprintTest {
    @Test
    public void demo01() throws Exception{
        //1 床架核心对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2 调用方法
        UserDao userDao = ac.getBean("userDao", UserDao.class);
        userDao.queryUserByNameAndPassword();
    }

    @Test
    public void demo02() throws Exception{
        //1 创建核心对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2 调用方法
        UserService userService = ac.getBean("userService", UserService.class);
        userService.login();
    }

    @Test
    public void demo03() throws Exception{
        //1 创建核心对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2 调用方法
        LifecycleBean lifecycleBean = ac.getBean("lifecycleBean", LifecycleBean.class);
        System.out.println(lifecycleBean);
    }
}
