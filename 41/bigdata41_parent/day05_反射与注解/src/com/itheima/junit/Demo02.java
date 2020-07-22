package com.itheima.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Demo02 {

    @Test
    public void test01(){
        System.out.println("11111111");

    }
    @Test
    public void test05(){
        System.out.println("555555");

    }
    @Before
    public void test02(){

        System.out.println("222222");
    }
    @After
    public void test03(){
        System.out.println("3333333");

    }

    @Before
    public void test04(){

        System.out.println("4444444444444");
    }

}
