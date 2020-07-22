package com.itheima.卖票案例;

public class WindowTest {

    public static void main(String[] args) {
        //1. 定义出四个窗口来卖票
        WindowThread window1 = new WindowThread("窗口1");
        WindowThread window2 = new WindowThread("窗口2");
        WindowThread window3 = new WindowThread("窗口3");
        WindowThread window4 = new WindowThread("窗口4");


        //2. 启动四个窗口:
        window1.start();
        window2.start();
        window3.start();
        window4.start();

    }
}
