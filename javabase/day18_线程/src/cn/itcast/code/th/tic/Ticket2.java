package cn.itcast.code.th.tic;

//模拟卖票:
public class Ticket2 implements Runnable {
    //共有100张票
    private int count = 100;

    //定义一个卖票方法 （同步方法）
    public synchronized void sellTicket(){
        if (count > 0) {
            //模拟出票的时间（稍停顿）
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            //获取线程对象的名称
            String name = Thread.currentThread().getName();

            System.out.println(name + " , 出票: " + count);
            count--;//卖出一张票后，数量减少
        }
    }

    @Override
    public void run() {
        //模拟窗口卖票
        while (true) {//一直处于卖票状态
            sellTicket();//调用卖票的方法
        }
    }
}
