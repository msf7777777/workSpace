package com.itheima.thread;

public class ThreadTest {

    public static void main(String[] args) {

        //1. 创建thread的子类对象
        MyThread myThread = new MyThread();

        //2. 启动线程
        myThread.start();



        //3. 在main主线程中, 遍历
        for(int i=0; i<10;i++){
            // 获取线程的名称
            Thread thread = Thread.currentThread();
            String name = thread.getName();

            System.out.println(name+":"+"当前线程打印:"+i);
        }
    }
}
