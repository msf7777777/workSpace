package cn.itcast.practice.No05_线程安全_案例买票系统.No02_同步方法;

//模拟卖票
public class Ticket02 implements Runnable {
    //共有80张票
    private int count2 = 80;

    //定义一个卖票方法 （同步方法）
    public synchronized void sellTicket() throws InterruptedException {
        if (count2 > 0){
            Thread.sleep(50);
            System.out.println(Thread.currentThread().getName() + ",出票" + count2);
            count2--;
        }
    }

    @Override
    public void run() {
        while(true){//一直处于卖票状态
            try {
                sellTicket();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
