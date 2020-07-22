package com.itheima.threadAPI;

public class MyThread extends Thread {

    public MyThread() {
    }

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {

        for (int i = 0 ; i<10; i++){

            try {
                Thread.sleep(1000);  // 休眠一秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            String name = this.getName();

            System.out.println(name+": 当前线程打印为"+i);

        }

    }
}
