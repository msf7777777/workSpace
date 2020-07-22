package cn.itcast.po;

import org.junit.Test;

public class PersonTest {

    @Test
    public void  testPerson(){
        Person p = new Person();
        p.setName("张嘉敏");
        p.setAge(24);
        p.setSex("女");

        System.out.println(p.getAge());
        p.setAge(23);

        System.out.println(p.getName());
        System.out.println(p);
    }
}