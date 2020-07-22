package cn.itcast.code.th.impl;

public class Test1 {
    public static void main(String[] args) {
        System.out.println("main方法：开始执行....");

        //创建自定义的实现类
        MyRunnable mr = new MyRunnable();

        //创建线程对象：Thread
        //public Thread(Runnable target,String name) : 分配一个带有指定目标新的线程对象并指定名字
//        Thread t = new Thread(mr,"黑马");
//        t.start(); //开启线程

        //以上两行代码，可以使用：匿名对象实现
        new Thread(mr,"黑马").start();

        //
        for (int i = 100; i <=110 ; i++) {
            System.out.println(Thread.currentThread().getName()+" : "+i);
        }
    }
}
