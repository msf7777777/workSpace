package cn.itcast.code.th;

public class MyThread2 extends Thread {

    //无参构造


    public void run(){
        for (int i = 0; i < 20; i++) {
            System.out.println(getName()+":"+i);
        }
        //获得当前正在执行的线程对象
        System.out.println(Thread.currentThread());
    }
}
