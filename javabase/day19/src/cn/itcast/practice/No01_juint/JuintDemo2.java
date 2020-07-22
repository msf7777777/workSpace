package cn.itcast.practice.No01_juint;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JuintDemo2 {
    int number;

    @Before
    public void testNum(){
        number = 7;
    }

    @After
    public void testNum1(){
        number = 6;
        System.out.println(number);
    }

    @Test
    public void testMethod(){
        int num = number;
        System.out.println(num);
        System.out.println("测试方法中的代码....");
    }


}
