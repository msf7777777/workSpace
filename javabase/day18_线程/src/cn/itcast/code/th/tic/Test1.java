package cn.itcast.code.th.tic;

public class Test1 {
    public static void main(String[] args) {
        //创建线程对象
        Ticket2 tk = new Ticket2();

        //模拟三个窗口
        Thread t1 = new Thread(tk,"窗口1");
        Thread t2 = new Thread(tk,"窗口2");
        Thread t3 = new Thread(tk,"窗口3");

        //开启同时卖票
        t1.start();
        t2.start();
        t3.start();

    }
}
