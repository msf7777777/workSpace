package com.itheima.同步;

public class Demo01 {
    public static void main(String[] args) {
        CheckClass checkClass = new CheckClass();

        new Thread(){

            @Override
            public void run() {
                while(true) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    checkClass.method1();
                }
            }
        }.start();



        new Thread(){

            @Override
            public void run() {
                while(true) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    checkClass.method2();
                }
            }
        }.start();
    }
}
