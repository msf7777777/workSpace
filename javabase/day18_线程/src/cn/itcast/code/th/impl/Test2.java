package cn.itcast.code.th.impl;

public class Test2 {

    public static void main(String[] args) {
        System.out.println("Main方法执行：......");

        //匿名内部类的方式 ： 使用父类引用 接收了匿名创建的对象
        //Runnalbe r 表示父引用
//        Runnable r = new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i <10 ; i++) {
//                    System.out.println(Thread.currentThread().getName()+":"+i);
//                }
//            }
//        };//最后是有分号

        Thread t = new Thread( new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i <10 ; i++) {
                    System.out.println(Thread.currentThread().getName()+":"+i);
                }
            }
        } ,"黑马");
        t.start(); //开启线程


        for (int i = 0; i < 10; i++) {
            System.out.println("Main方法中的循环值："+i);
        }
    }
}
