package cn.itcast.practice.No02_反射.No01_获取Class对象;

import org.junit.Test;

public class TestForPerson {
    @Test
    public void testFun1(){
        Person p = new Person();
        Class pClass = p.getClass();
        System.out.println("对象 调用: " + pClass);
    }

    @Test
    public void testFun2(){
        Class personClass = Person.class;
        System.out.println("类名 调用: " + personClass);
    }

    @Test
    public void testFun3() throws ClassNotFoundException {
        Class aClass = Class.forName("cn.itcast.practice.No02_反射.No01_获取Class对象.Person");
        System.out.println("类的全名称 调用: " + aClass);
    }

    @Test
    public void testFun4() throws ClassNotFoundException {
        System.out.println("对象调用");
        System.out.println(new Person().getClass());

        System.out.println("类名调用");
        System.out.println(Person.class);

        System.out.println("类的全名称调用");
        System.out.println(Class.forName("cn.itcast.practice.No02_反射.No01_获取Class对象.Person"));

        boolean b1 = new Person().getClass() == Person.class;
        boolean b2 = Person.class == Class.forName("cn.itcast.practice.No02_反射.No01_获取Class对象.Person");
        System.out.println(b1 && b2);
    }
}
