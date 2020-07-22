package cn.itcast.task.homework.test05;

public class Keyboard implements USB {

    public void connect(){
        System.out.println("键盘连接电脑了");
    }

    public void disconnet(){
        System.out.println("键盘断开电脑了");
    }
}
