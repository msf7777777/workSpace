package cn.itcast.code.th;

/*
步骤：
1、创建一个子类，继承Thread类
2、重写Thread类中的run()方法
3、创建Thread的子类对象
4、调用线程对象中的start()方法，来启动线程并执行线程体代码
* */
public class MyThread extends Thread {

    public MyThread(String name) {
        super(name);//调用父类中的构造方法： Thread(String name)
    }


    //重写Thread类中的run方法
    public void run() {
        //线程要执行的任务（代码）
        //线程体
        for (int i = 0; i < 10; i++) {
            System.out.println(getName() + "正在执行：" + i);
        }
    }
}

