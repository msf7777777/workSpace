package cn.itcast.demo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class UserServiceTest {

    //【userService】
    @Test
    public void fucking() {

        //通过Spring来加载对象，不能直接new！！！

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserService userService = (UserService) context.getBean("userService");

        System.out.println("fucking【userService】");

        userService.fucking();

        UserService userService2 = (UserService) context.getBean("userService_msf");

        userService2.fucking();

    }

    //【user】
    @Test
    public void testUser01() {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        User user = (User) context.getBean("user");

        System.out.println("testUser01【user】");
        System.out.println(user);

    }

    //【user】
    @Test
    public void testUser02() {

        ApplicationContext context = new FileSystemXmlApplicationContext
                ("F:\\workSpace\\41\\spring41_01\\src\\main\\resources\\applicationContext.xml");

        User user = (User) context.getBean("user");

        System.out.println("testUser02【user】");
        System.out.println(user);

    }

    //【user】
    @Test
    public void testUser03() {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        User user = context.getBean("user", User.class);

        System.out.println("testUser03【user】");
        System.out.println(user);

    }

    //【user】
    @Test
    public void testUser04() {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        User user = context.getBean(User.class);

        System.out.println("testUser04【user】");
        System.out.println(user);

    }

    //【staticFactoryBean】
    @Test
    public void testUser05() {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        User user = context.getBean("staticFactoryBean", User.class);

        System.out.println("testUser05【staticFactoryBean】");
        System.out.println(user);

    }

    //【factoryBean】
    @Test
    public void testUser06() {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        User user = context.getBean("factoryBean", User.class);
        User user2 = context.getBean("factoryBean", User.class);
        User user3 = context.getBean("factoryBean", User.class);

        System.out.println("testUser06【factoryBean】");
        System.out.println(user);
        System.out.println(user2);
        System.out.println(user3);

        boolean b = user == user2;
        boolean bb = user2 == user3;
        System.out.println(b + " and " + bb);

    }

    //【user2】
    @Test
    public void testUser07() {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        User user = context.getBean("user2", User.class);
        User user2 = context.getBean("user2", User.class);
        User user3 = context.getBean("user2", User.class);

        System.out.println("testUser07【user2】");
        System.out.println(user);
        System.out.println(user2);
        System.out.println(user3);

        boolean b = user == user2;
        boolean bb = user2 == user3;
        System.out.println(b + " and " + bb);

    }


}
