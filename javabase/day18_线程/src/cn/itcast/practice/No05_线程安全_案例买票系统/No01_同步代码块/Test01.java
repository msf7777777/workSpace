package cn.itcast.practice.No05_线程安全_案例买票系统.No01_同步代码块;

public class Test01 {
    public static void main(String[] args) {
        Ticket01 tk = new Ticket01();

        //模拟三个窗口
        Thread t1 = new Thread(tk, "窗口1");
        Thread t2 = new Thread(tk, "窗口2");
        Thread t3 = new Thread(tk, "窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}
