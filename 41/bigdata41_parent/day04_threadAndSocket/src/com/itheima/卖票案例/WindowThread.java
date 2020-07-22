package com.itheima.卖票案例;

// 卖票的窗口
public class WindowThread extends Thread {
    public WindowThread() {

    }

    public WindowThread(String name) {
        super(name);

    }

    // 定义票数:
    private static int ticket = 100;


    @Override
    public void run() {


        while (true) {//一直卖
            synchronized (WindowThread.class) {

                if (ticket > 0) {
                    try {
                        Thread.sleep(50); // 仅仅是为了让效果更佳明显一些, 没有实际的作用, 现在在哪里休眠, 就会在哪里起来
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    // 执行卖票的逻辑: 一直买, 窗口即使卖完了 也不会关闭窗口
                    String name = this.getName();
                    ticket--;
                    System.out.println(name + ":正在卖第" + ticket + "张票");


                }
            }
        }
    }
}
