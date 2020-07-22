package cn.itcast.practice.No05_线程安全_案例买票系统.No02_同步方法;

public class Test02 {
    public static void main(String[] args) {
        Ticket02 tk = new Ticket02();

        //模拟三个窗口
        Thread t1 = new Thread(tk, "窗口1");
        Thread t2 = new Thread(tk, "窗口2");
        Thread t3 = new Thread(tk, "窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}
