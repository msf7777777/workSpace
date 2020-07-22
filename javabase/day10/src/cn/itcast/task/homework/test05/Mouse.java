package cn.itcast.task.homework.test05;
/*
        connet():打印鼠标连接了
        disconnet():打印鼠标断开了
 */
public class Mouse implements USB {


    public void connect(){
        System.out.println("鼠标连接电脑了");
    }

    public void disconnet(){
        System.out.println("鼠标断开电脑了");
    }

}
