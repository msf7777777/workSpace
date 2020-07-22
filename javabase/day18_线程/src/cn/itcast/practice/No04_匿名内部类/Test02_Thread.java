package cn.itcast.practice.No04_匿名内部类;

public class Test02_Thread {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new Runnable(){

            @Override
            public void run() {
                for (int i = 1; i <= 6; i++) {
                    System.out.println(Thread.currentThread().getName() + i);
                }
            }
        }, "女朋友 张嘉敏");
        t.start();
        for (int i = 1; i <= 7; i++) {
            System.out.println("main 男朋友 麻少飞: " + i);
            Thread.sleep(1000);
        }
    }
}
