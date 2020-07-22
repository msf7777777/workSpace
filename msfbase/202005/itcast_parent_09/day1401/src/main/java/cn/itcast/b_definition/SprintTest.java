package cn.itcast.b_definition;

import cn.itcast.a_quickstart.UserDao;
import cn.itcast.a_quickstart.UserDaoImpl;
import cn.itcast.a_quickstart.UserService;
import cn.itcast.a_quickstart.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SprintTest {


    @Test
    public void demo01() {
        // 需求: 从spring容器中获取Bean1
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        Bean1 bean1 = ac.getBean("bean1", Bean1.class);
        System.out.println(bean1);
    }

    @Test
    public void demo02() {
        // 需求: 从spring容器中获取Bean2
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        Bean2 bean2 = ac.getBean("bean2", Bean2.class);
        System.out.println(bean2);
    }

    @Test
    public void demo03() {
        // 需求: 从spring容器中获取Bean3
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        Bean3 bean3 = ac.getBean("bean3", Bean3.class);
        System.out.println(bean3);
    }

    @Test
    public void demo04() {
        // 需求: 从spring容器中获取Bean3
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        Bean3 bean3 = ac.getBean("bean3_2", Bean3.class);
        System.out.println(bean3);
    }
}
