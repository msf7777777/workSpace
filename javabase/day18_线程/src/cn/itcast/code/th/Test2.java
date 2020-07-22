package cn.itcast.code.th;

public class Test2 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("main线程：开始执行....");

        //创建线程子类对象
        MyThread2 mt = new MyThread2();
        //给线程设置名称
        mt.setName("传智播客");

        //启动线程
        mt.start();

        for (int i = 0; i < 10; i++) {
            //Thread.currentThread().getName()
            //Thread.currentThread(): 获取到当前正在执行的线程，就是main线程
            //线程对象.getName()   获取到线程的名称
            System.out.println(Thread.currentThread().getName()+" : "+i);
            Thread.sleep(1000); //表示当前线程睡眠：1000毫秒
        }
    }
}
