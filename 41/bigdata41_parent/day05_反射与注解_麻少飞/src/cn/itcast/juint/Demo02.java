package cn.itcast.juint;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Demo02 {

    @Test
    public void test01() {

        System.out.println("【test01】我是test01");

    }

    @Test
    public void test02() {

        System.out.println("【test02】我是test02");

    }

    @Before
    public void before01() {

        System.out.println("【before01】before01");

    }

    @Before
    public void before02() {

        System.out.println("【before02】before02");

    }

    @After
    public void after01() {

        System.out.println("【after01】after01");

    }

    @After
    public void after02() {

        System.out.println("【after02】after02");

    }
}
