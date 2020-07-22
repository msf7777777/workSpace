package cn.itcast.task.homework.test07;
/*
扩展题:
一. 已知有学生类, 属性为: 姓名, 语文成绩, 数学成绩, 英语成绩,  他们都要吃饭, 睡觉和学习.
   提示用户键盘录入5个学生的信息, 并将这些信息封装成学生对象后, 存储到数组中.
   //数组类型:  Student[] arr = new Student[5];
   // int[] arr = new int[10];
   需求1: 打印所有学生的信息, 格式为:
		姓名为张三的同学, 语文成绩为100分, 数学成绩为100分, 英语成绩为100分.
		...
   需求2: 打印每个学生的总分, 格式为:
		姓名为张三的同学, 总分为: 300分
		...
   需求3: 打印分数最高的学生信息, 格式如下:
		分数最高的学生是张三, 总分为300分, 其中语文成绩为100分, 数学成绩为100分, 英语成绩为100分.
 */

import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {
        //创建长度为5的数组, 装5个学生对象(5个学生地址)
        Student[] arr = new Student[1];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请录入姓名");
            String name = scanner.next();
            System.out.println("请录入语文成绩");
            int chinese = scanner.nextInt();
            System.out.println("请录入数学成绩");
            int math = scanner.nextInt();
            System.out.println("请录入英语成绩");
            int english = scanner.nextInt();
            //将4个数据打包成一个学生对象
            Student student = new Student(name, chinese, english, math);
            //将学生放到数组中
            arr[i] = student;
        }

       /* 需求1: 打印所有学生的信息, 格式为:
        姓名为张三的同学, 语文成绩为100分, 数学成绩为100分, 英语成绩为100分.*/
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            System.out.println(stu.getName() + "," + "....");
        }

       /* 需求2: 打印每个学生的总分, 格式为:
        姓名为张三的同学, 总分为: 300分*/
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            // int sum = stu.getChinese()+stu.getEnglish()+ stu.getMath();
            int sum = stu.getSum();
            System.out.println(stu.getName() + "的总分是" + sum);
        }

      /*  需求3: 打印分数最高的学生信息, 格式如下:
        分数最高的学生是张三, 总分为300分, 其中语文成绩为100分, 数学成绩为100分, 英语成绩为100分.*/
        //int max = arr[0].getSum();
        Student maxStudent = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].getSum() > maxStudent.getSum()) {
                maxStudent = arr[i];
            }
        }
        System.out.println(maxStudent.getName()+"的总份最大:"+maxStudent.getSum());

    }
}
