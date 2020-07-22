package cn.itcast.practice.No03_sleep;

public class Test_sleep {
    public static void main(String[] args) throws InterruptedException {
        MyRunnable_sleep ms = new MyRunnable_sleep();
        Thread t = new Thread(ms, "张嘉敏");
        t.start();
        for (int i = 1; i <= 7; i++) {
            System.out.println("main麻少飞:" + i);
            Thread.sleep(2000);
        }
    }
}
