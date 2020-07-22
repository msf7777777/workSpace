package cn.itcast.demo;

import cn.itcast.di.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonTest {

    //【userService】
    @Test
    public void person() {

        //通过Spring来加载对象，不能直接new！！！

        ApplicationContext context = new ClassPathXmlApplicationContext("person.xml");

        Person person = context.getBean("person", Person.class);

        System.out.println(person);

    }

    //【userService】
    @Test
    public void personZ() {

        //通过Spring来加载对象，不能直接new！！！

        ApplicationContext context = new ClassPathXmlApplicationContext("person.xml");

        Person person = context.getBean("personZ", Person.class);

        System.out.println(person);

    }

}
