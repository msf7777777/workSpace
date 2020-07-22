package cn.itcast.code.final1.variable;

import java.util.Scanner;

public class Test3 {
    //自定义常量, 就是让普通的常量更具备可读性!!!!!!!!!
    public static final int PERSON_SERVICE = 0;
    public static final int INTERNET_SERVICE = 1;
    public static final int PAY_SERVICE = 2;
    public static final int PAY_SELECT_SERVICE = 3;
    public static final int FLOW_SERVICE = 4;

    public static void main(String[] args) {
        System.out.println("欢迎来到联动客服中心");
        System.out.println("请输入你的操作");
        System.out.println("1.宽带业务");
        System.out.println("2.话费充值");
        System.out.println("3.话费查询");
        System.out.println("4.流量办理");
        System.out.println("0.人工服务");
        Scanner scanner = new Scanner(System.in);
        int choose = scanner.nextInt();
        switch (choose) {
            case PERSON_SERVICE:
                System.out.println("进入人工服务,您好女士|先生");
                break;
            case INTERNET_SERVICE:
                System.out.println("进入宽带业务,您好女士|先生");
                break;
            case PAY_SERVICE:
                System.out.println("进入话费充值,您好女士|先生");
                break;
            case PAY_SELECT_SERVICE:
                System.out.println("进入流量办理,您好女士|先生");
                break;
            case FLOW_SERVICE:
                System.out.println("进入人工服务,您好女士|先生");
                break;
        }
    }
}
