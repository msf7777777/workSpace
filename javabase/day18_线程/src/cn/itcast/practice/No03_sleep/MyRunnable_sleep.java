package cn.itcast.practice.No03_sleep;

public class MyRunnable_sleep implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 6; i++) {
            System.out.println(Thread.currentThread().getName() + i);
        }
    }
}
