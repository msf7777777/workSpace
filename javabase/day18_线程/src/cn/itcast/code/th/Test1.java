package cn.itcast.code.th;

public class Test1 {
    public static void main(String[] args) {
        System.out.println("这里是main方法.... [main线程]");

        //创建MyThread对象
        MyThread mt = new MyThread("黑马");

        //启动线程
        mt.start();

        //在main方法中，循环打印
        for (int i = 0; i < 20; i++) {
            System.out.println("main方法中的：" + i);
        }
    }
}
