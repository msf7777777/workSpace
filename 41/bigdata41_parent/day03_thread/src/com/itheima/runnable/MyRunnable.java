package com.itheima.runnable;

public class MyRunnable implements  Runnable{
    @Override
    public void run() {
        // 写这个线程要执行的内容
        for(int i =0 ; i<10 ; i++){
            // 获取线程的名称
           //  String name = this.getName();  // 为啥报错了呢?  getName方法是Thread类中方法, 而不是runnable接口中方法
            String name = Thread.currentThread().getName();
            System.out.println(name+":"+"当前线程打印:"+i);
        }
    }
}
