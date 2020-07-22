package cn.itcast.task.task05_new;
/*
5.
	1.已知电脑类(Computer), 有开机和关机的功能,以及使用鼠标和键盘的功能
	2.已知鼠标类(Mouse), 也有连接电脑和断开电脑的功能
		connet():打印鼠标连接了
		disconnet():打印鼠标断开了
	3.已知键盘类(Keyboard), 也有连接电脑和断开电脑的功能
		connet():打印键盘连接了
		disconnet():打印键盘断开了
	总结,只要是符合USB设备的东可以连接电脑和断开电脑的功能
	请编写测试类, 测试电脑开机, 电脑使用鼠标, 电脑使用键盘, 电脑关机的功能
 */
public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer();
        System.out.println("〓开机〓");
        computer.bootup();
        computer.usbup(new Mouse());
        computer.usbup(new Keyboard());
        System.out.println("〓关机〓");
        computer.shutdown();
        computer.usbdown(new Mouse());
        computer.usbdown(new Keyboard());
    }
}
