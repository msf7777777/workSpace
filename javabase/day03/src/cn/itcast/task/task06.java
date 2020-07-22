package cn.itcast.task;
	/*
	6. 键盘录入学生考试成绩，判断学生等级:
		90-100	优秀
		80-90	好
		70-80	良
		60-70	及格
		60以下	不及格
		尽可能多的用多种思路实现.
    */
import java.util.Scanner;
public class task06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1.输入学生成绩
        System.out.println("输入学生成绩：");
        int achievement = sc.nextInt();
        //2.判断学生等级
        //第1种
        if(achievement > 100 || achievement < 0){
            System.out.println("fuck off");
        }else if(achievement <= 100 && achievement >= 90){
            System.out.println("这个学生成绩：" + achievement + "，优秀");
        }else if(achievement >= 80){
            System.out.println("这个学生成绩：" + achievement + "，好");
        }else if(achievement >= 70){
            System.out.println("这个学生成绩：" + achievement + "，良");
        }else if(achievement >= 60){
            System.out.println("这个学生成绩：" + achievement + "，及格");
        }else{
            System.out.println("这个学生成绩：" + achievement + "，不及格");
        }
        System.out.println("---------------------------------------");
        //第2种
    }
}
