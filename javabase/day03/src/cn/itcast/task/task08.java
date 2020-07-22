package cn.itcast.task;
	/*
	8. 学校举行运动会，百米赛跑成绩在10秒以内的学生有资格进决赛，根据性别分为男子组和女子组。
		提示：
		1.创建键盘录入对象
		2.定义double类型的变量score用于接收成绩，定义String类型的变量gender用于接收性别
		3.给score和gender赋值
		4.首先要判断是否能够进入决赛
		5.在确保进入决赛的情况下，再判断是进入男子组，还是进入女子组
    */
import java.util.Scanner;
public class task08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1.输入百米赛跑成绩
        System.out.println("输入百米赛跑成绩：");
        double score = sc.nextDouble();
        if (score < 0) {
            System.out.println("fuck off");
        } else if (score > 10) {
            System.out.println("你没进决赛，所以男子组和女子组都进不去");
        } else {
            //2.输入性别
            System.out.println("输入性（“男生” 或者 “女生”）)");
            String gender = sc.next();
            System.out.println("你可以进决赛" + gender + "组");
            System.out.println("--------------------------------------");

            if (gender.equals("男生")) {
                System.out.println("你可以进决赛" + "男子组");
            } else if (gender.equals("女生")) {
                System.out.println("你可以进决赛" + "女子组");
            } else {
                System.out.println("fuck off");
            }

        }
    }
}
