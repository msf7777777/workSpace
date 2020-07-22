package cn.itcast.task.homework.test04;

import java.util.Scanner;

/*
    1.4 题目四
	请定义main()方法，在main()中按以下顺序要求编写代码：
	定义一个String[]数组如下：
	String[] arr = {”星期一”,”星期二”,”星期三”,”星期四”,”星期五”,”星期六”,”星期日”};
	请用户输入一个整数1--7的值：
	根据用户输入，从数组中取出对应的星期名称，例如：
	用户输入：1
	程序提示：星期一
	为了防止用户输入小于1或者大于7的值，请使用异常处理从数组中取出对应的“星期名称”，在异常处理中打印：输入错误！！
 */
public class Test01 {

    public static void main(String[] args) {
        String[] arr = {"星期一","星期二","星期三","星期四","星期五","星期六","星期日"};
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("请录入1-7之间的值");
            int index = scanner.nextInt();// [1-7] --->[0-6]
            String s = arr[index - 1];
            System.out.println(s);
        } catch (Exception e) {
            System.out.println("录入的有问题");
        }


    }
}
