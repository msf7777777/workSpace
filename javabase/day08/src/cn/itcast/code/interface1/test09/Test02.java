package cn.itcast.interface1.test09;

import java.util.Scanner;
/*
    接口中可以很方便定义自定义常量
 */
public class Test02 {

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
            case A.PERSON_SERVICE:
                System.out.println("进入人工服务,您好女士|先生");
                break;
            case A.INTERNET_SERVICE:
                System.out.println("进入宽带业务,您好女士|先生");
                break;
            case A.PAY_SERVICE:
                System.out.println("进入话费充值,您好女士|先生");
                break;
            case A.PAY_SELECT_SERVICE:
                System.out.println("进入流量办理,您好女士|先生");
                break;
            case A.FLOW_SERVICE:
                System.out.println("进入人工服务,您好女士|先生");
                break;
        }
    }
}
