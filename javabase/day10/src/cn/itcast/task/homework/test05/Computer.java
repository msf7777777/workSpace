package cn.itcast.task.homework.test05;
// 1.已知电脑类(Computer), 有开机和关机的功能,以及使用鼠标和键盘的功能
public class Computer {

    //1.开机

    public void startUp(){
        System.out.println("电脑开机");
    }
    //2.关机
    public void shutDown(){
        System.out.println("电脑关机");
    }

    public void useUSB(USB usb){//USB usb = new Mouse()
        usb.connect();
        usb.disconnet();
    }
    /*//3.使用鼠标
    public void useMouse(Mouse mouse){//
        mouse.connect();
        mouse.disconnet();
    }
    //4. 使用键盘
    public void useKeyboard(Keyboard keyboard){
        keyboard.connect();
        keyboard.disconnet();

    }*/
   /* //5. 使用u盘
    public void useKeyboard(Keyboard keyboard){
        keyboard.connect();
        keyboard.disconnet();

    }

    //5. 使用硬盘
    public void useKeyboard(Keyboard keyboard){
        keyboard.connect();
        keyboard.disconnet();

    }*/
}
