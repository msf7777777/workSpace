package cn.itcast.demo;

import cn.itcast.life.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class StudentTest {

    //【service】
    @Test
    public void service() {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("student.xml");

        Student student = context.getBean("student", Student.class);

        System.out.println("service【user2】");
//        student.init();
        student.service();
//        student.destroy();
        context.close();
        System.out.println("关闭之后.......");
        student.service();
        Student student1 = context.getBean("student", Student.class);
        student1.service();


    }


}
