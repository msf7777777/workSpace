package com.itheima.threadAPI;

public class ThreadTest {

    public static void main(String[] args) {

        //1. 创建 继承thread类的子类对象
        MyThread myThread = new MyThread("老张线程");

        //2.启动线程
        myThread.start();


    }
}
