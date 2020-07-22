package com.itheima.thread;

public class ThreadTest {
    public static void main(String[] args) {

        //1. 创建Thread类子类对象
        MyThread myThread = new MyThread();
        //2. 启动线程
        myThread.start();
        //3. 循环遍历
        for(int i = 0 ; i<10 ; i++){

            // 线程名称
            String name = Thread.currentThread().getName();
            System.out.println(name+"线程:打印为:"+i);
        }
    }
}
