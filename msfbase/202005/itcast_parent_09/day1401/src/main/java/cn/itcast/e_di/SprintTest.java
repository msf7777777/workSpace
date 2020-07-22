package cn.itcast.e_di;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SprintTest {
    @Test
    public void demo01() throws Exception {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        Car car = ac.getBean("car", Car.class);
        System.out.println(car);
    }

    @Test
    public void demo02() throws Exception {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        Employee employee = ac.getBean("employee", Employee.class);
        System.out.println(employee);
    }

    @Test
    public void demo03() throws Exception {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        Employee employee = ac.getBean("employee2", Employee.class);
        System.out.println(employee);
    }

    @Test
    public void demo04() throws Exception {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        CollectionBean collectionBean = ac.getBean("collectionBean", CollectionBean.class);
        System.out.println(collectionBean);
    }
}
