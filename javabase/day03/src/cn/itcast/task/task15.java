package cn.itcast.task;
	/*
	15. 某人准备去海南旅游，现在要订购机票。机票的价格收季节忘记、淡季的影响，头等舱和经济舱价格也不同。
		假设机票原价假设为5000元（键盘录入），4-10月为旺季，旺季头等舱打9折，经济舱打8折，淡季头等舱打5折，经济舱打4折。
		编写程序，使用嵌套if选择结构根据出行的月份和选择的仓位输出实际的机票价格

			分析：
			1.创建键盘录入对象
			2.创建int类型的money表示机票价格，int类型的month表示月份
			3.通过键盘录入给变量money和month赋值
			4.定义int类型的变量type表示机票的类型和double类型的变量discount表示折扣率
			5.通过键盘录入给变量type赋值
			6.使用if语句根据type和month的值，计算实际的机票价格
			7.打印最后的结果, 格式如下:
				旺季4月份出行，头等舱打0.5折，原价5000，折后价3000
	*/
import java.util.Scanner;
public class task15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1.输入现在机票价格
        System.out.println("输入现在机票价格是：");
        int money = sc.nextInt();
        //2.输入现在的月份
        System.out.println("输入现在的月份");
        int month = sc.nextInt();
        //3.定义机票的类型
        System.out.println("输入机票类型");
        System.out.println("头等舱输入：1");
        System.out.println("经济舱输入：0");
        int type = sc.nextInt();
        //4.定义机票折扣率
        double discount;
        if(money >= 0){
            if(month >= 4 && month <= 10){
                if(type == 1){
                    discount = 0.9;
                    System.out.println("旺季" + month + "月份出行，头等舱打 " + (int)(discount * 10) + " 折，原价" + money + "，折后价" + money * discount);
                }else if(type == 0){
                    discount = 0.8;
                            System.out.println("旺季" + month + "月份出行，经济舱打 " + (int)(discount * 10) + " 折，原价" + money + "，折后价" + money * discount);
                }else{
                    System.out.println("fuck off");
                }
            }else if(month == 1 || month == 2 || month == 3 || month == 11 || month == 12){
                if(type == 1){
                    discount = 0.5;
                    System.out.println("淡季" + month + "月份出行，头等舱打 " + (int)(discount * 10) + " 折，原价" + money + "，折后价" + money * discount);
                }else if(type == 0){
                    discount = 0.4;
                    System.out.println("淡季" + month + "月份出行，经济舱打 " + (int)(discount * 10) + " 折，原价" + money + "，折后价" + money * discount);
                }else{
                    System.out.println("fuck off");
                }
            }else{
                System.out.println("fuck off");
            }
        }else{
            System.out.println("fuck off");
        }
    }
}
