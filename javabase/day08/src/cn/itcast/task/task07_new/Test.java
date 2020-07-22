package cn.itcast.task.task07_new;
/*
一. 已知有学生类, 属性为: 姓名, 语文成绩, 数学成绩, 英语成绩,  他们都要吃饭, 睡觉和学习.
    提示用户键盘录入5个学生的信息, 并将这些信息封装成学生对象后, 存储到数组中.
        //数组类型:  Student[] arr = new Student[5];
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

public class Test {
    public static void main(String[] args) {
        Student[] arr = new Student[2];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i+ 1) + "个同学的 名字");
            String name = scanner.next();
            System.out.println("请输入第" + (i+ 1) + "个同学的 语文 成绩");
            int chinese = scanner.nextInt();
            System.out.println("请输入第" + (i+ 1) + "个同学的 数学 成绩");
            int math = scanner.nextInt();
            System.out.println("请输入第" + (i+ 1) + "个同学的 英语 成绩");
            int english = scanner.nextInt();
            Student student = new Student(name, chinese, math, english);
            arr[i] = student;
        }

        //1.打印所有学生的信息
        for (int i = 0; i < arr.length; i++) {
            Student student = arr[i];
            System.out.println(student.getName()
                             + " 的 语文 成绩是 " + student.getChinese()
                             + " 的 数学 成绩是 " + student.getMath()
                             + " 的 英语 成绩是 " + student.getEnglish());
        }

        //2.打印每个学生的总分
        for (int i = 0; i < arr.length; i++) {
            Student student = arr[i];
            //student.getChinese() + student.getMath() + student.getEnglish()
            int sum = student.getSum();
            System.out.println(student.getName() + " 的总分是 " + sum);
        }

        //3.打印分数最高的学生信息
        Student maxStu = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i].getSum() > maxStu.getSum()){
                maxStu = arr[i];
            }
        }
        System.out.println("学生 " + maxStu.getName() + " 的总分最大,是: " + maxStu.getSum());
    }
}
