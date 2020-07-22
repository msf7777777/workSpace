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

//javac Test08.java
//java Test08
import java.util.Scanner;
public class task08_teacher {
    public static void main(String[] args) {
        //1.键盘录入2个数据，一个成绩，一个性别
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入成绩：");
        double score = sc.nextDouble();
        System.out.println("请输入成绩：");
        String gender = sc.next();
        //2.判断成绩是否能进入决赛
        if(score <= 10){
			/*3.判断他的性别  ----->  字符串在判断内容是否
				相同的时候，应该采用equals方法，不能用==*/
            if(gender.equals("男")){
                System.out.println("进入男子组");
            }else{
                System.out.println("进入女子组");
            }
        }else{
            System.out.println("没进入决赛");
        }
    }
}
