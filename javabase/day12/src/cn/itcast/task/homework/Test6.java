package cn.itcast.task.homework;

import java.util.Scanner;

public class Test6 {

    public static void main(String[] args) {
        //键盘录入一行数据
        Scanner scanner = new Scanner(System.in);
        System.out.println("请录入学员的信息");
        String info = scanner.next();//"张三,18,男"   "李四,19,女"
        //String s = "姓名(张三),年龄(18),性别(女)";
        String[] arr = info.split(","); //arr[0]="张三" arr[1] = "18" arr[2] ="男"
        Student student = new Student();
        student.setName(arr[0]);//设置姓名
        //如何将String类型的变成int类型 ----> parseInt
        student.setAge(Integer.parseInt(arr[1]));
        student.setGender(arr[2].charAt(0));
        System.out.println(student);


    }
}
