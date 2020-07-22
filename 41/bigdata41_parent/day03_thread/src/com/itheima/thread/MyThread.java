package com.itheima.thread;

public class MyThread extends Thread{

    @Override
    public void run() {
        // 写这个线程要执行的内容
        for(int i =0 ; i<10 ; i++){
            // 获取线程的名称
            String name = this.getName();
            System.out.println(name+":"+"当前线程打印:"+i);
        }

    }
}
