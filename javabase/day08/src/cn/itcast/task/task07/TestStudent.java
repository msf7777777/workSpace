package cn.itcast.task.task07;

import java.util.Scanner;

/*
一. 已知有学生类, 属性为: 姓名, 语文成绩, 数学成绩, 英语成绩,  他们都要吃饭, 睡觉和学习.
    提示用户键盘录入5个学生的信息, 并将这些信息封装成学生对象后,
        存储到数组中. 	//数组类型:  Student[] arr = new Student[5];
    需求1: 打印所有学生的信息, 格式为:
		姓名为张三的同学, 语文成绩为100分, 数学成绩为100分, 英语成绩为100分.
		...

    需求2: 打印每个学生的总分, 格式为:
		姓名为张三的同学, 总分为: 300分
		...

    需求3: 打印分数最高的学生信息, 格式如下:
		分数最高的学生是张三, 总分为300分, 其中语文成绩为100分, 数学成绩为100分, 英语成绩为100分.
 */
public class TestStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入 第一个 学生的:名字,语文成绩,数学成绩和英语成绩");
        Student student1 = new Student(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());
        System.out.println("请输入 第二个 学生的:名字,语文成绩,数学成绩和英语成绩");
        Student student2 = new Student(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());
        System.out.println("请输入 第三个 学生的:名字,语文成绩,数学成绩和英语成绩");
        Student student3 = new Student(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());
        System.out.println("请输入 第四个 学生的:名字,语文成绩,数学成绩和英语成绩");
        Student student4 = new Student(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());
        System.out.println("请输入 第五个 学生的:名字,语文成绩,数学成绩和英语成绩");
        Student student5 = new Student(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());

        String[] arrStudent = {student1.getName(), student2.getName(), student3.getName(), student4.getName(), student5.getName()};

        for (int i = 0; i < 4; i++) {
            System.out.println(arrStudent[i]);
        }
    }

}
