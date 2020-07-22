package cn.itcast.practice.No01_Thread类方式;

public class Test_MyThread {
    public static void main(String[] args) {
        System.out.println("这里是main线程");
        MyThread mt = new MyThread("麻少飞");
        mt.start();
        for (int i = 0; i < 6; i++) {
            System.out.println("张嘉敏:" + i);
        }
    }
}
