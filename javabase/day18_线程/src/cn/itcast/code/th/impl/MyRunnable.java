package cn.itcast.code.th.impl;

//实现接口的方式，书写线程任务
public class MyRunnable implements Runnable{
    //重写run方法
    @Override
    public void run() {
        //线程体代码
        for (int i = 1; i <= 20; i++) {
            //打印线程名称及循环值i
            System.out.println(Thread.currentThread().getName()+" : "+i);
        }
    }
}
