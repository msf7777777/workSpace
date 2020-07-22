package com.itheima.runnable;

public class RunnableTest {

    public static void main(String[] args) {
        //1. 创建runnable子类的对象
        MyRunnable myRunnable = new MyRunnable();

        //2. 创建Thread类对象, 将没有Runnable作为参数传递中Thread中
        Thread thread = new Thread(myRunnable);

        //3. 启动线程
        thread.start();

        // 再次开启一次线程:
        Thread thread1 = new Thread(myRunnable);
        thread1.start();

        //4. 在main主线程中, 遍历
        for(int i=0; i<10;i++){
            // 获取线程的名称
            Thread thread2 = Thread.currentThread();
            String name = thread2.getName();


            System.out.println(name+":"+"当前线程打印:"+i);
        }

    }
}
