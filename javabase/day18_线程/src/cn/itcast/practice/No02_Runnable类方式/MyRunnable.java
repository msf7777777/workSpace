package cn.itcast.practice.No02_Runnable类方式;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 6; i++) {
            //public static Thread currentThread() ：返回对当前正在执行的线程对象的引用
            System.out.println(Thread.currentThread().getName() + "" + i);
        }
    }
}
