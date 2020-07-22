package cn.itcast.practice.No02_Runnable类方式;

public class Test_MyRunnable {
    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable();
        Thread t = new Thread(mr, "张嘉敏");
        t.start();
        for (int i = 0; i < 7; i++) {
            System.out.println("main麻少飞:" + i);
        }
    }
}
