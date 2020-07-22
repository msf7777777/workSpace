package com.itheima.thread;

public class MyThread extends Thread {
    @Override
    public void run() {

        for(int i = 0 ; i<10 ; i++){
            //获取线程的名称
            String name = this.getName();
            System.out.println(name+": 线程打印为"+i);
        }
    }
}
