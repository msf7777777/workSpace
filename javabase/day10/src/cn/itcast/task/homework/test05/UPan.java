package cn.itcast.task.homework.test05;

public class UPan implements USB {
    @Override
    public void connect() {
        System.out.println("u盘连接了");
    }

    @Override
    public void disconnet() {
        System.out.println("u盘断开了");
    }
}
