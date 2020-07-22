package cn.itcast.practice.No05_线程安全_案例买票系统.No01_同步代码块;

//模拟卖票
public class Ticket01 implements Runnable {
    //
    private int count = 100;

    //创建一个对象锁
    Object lock = new Object();



    @Override
    public void run() {
        while(true){//一直处于卖票状态
            synchronized (lock){
                if(count > 0){
                    //模拟出票的时间(有停顿)
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    //获取线程对象的名称
                    String name= Thread.currentThread().getName();
                    System.out.println(name + ",出票:" + count--);//卖出一张票后,数量减少-1
                }else{
                    break;
                }
            }
        }
    }
}
