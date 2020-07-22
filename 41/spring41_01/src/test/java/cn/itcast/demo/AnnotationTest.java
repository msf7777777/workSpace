package cn.itcast.demo;

import cn.itcast.annotation.UserDaoImpl1;
import cn.itcast.annotation.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationTest {

    @Test
    public void userDaoTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("annotation.xml");
        UserDaoImpl1 userDaoImpl1 = context.getBean(UserDaoImpl1.class);
        userDaoImpl1.findUsers();
    }

    @Test
    public void userServiceTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("annotation.xml");
        UserServiceImpl userServiceImpl = context.getBean(UserServiceImpl.class);
        userServiceImpl.findUsers();
    }
}
