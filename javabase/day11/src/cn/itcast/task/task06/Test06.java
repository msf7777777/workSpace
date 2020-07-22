package cn.itcast.task.task06;

import java.util.Scanner;

/*
题目六
	程序从控制台一次性接收一个学员信息，
	要求程序必须能正确处理以下几种格式的数据：
		“张三,20,男”
	编程：
	定义学员类，可以存储上述数据(姓名String，年龄int，性别char)
	定义测试类，创建一个学员对象，从控制台接收一名学员信息，
	并能正确解析，并将数据存储到学员对象中，最后打印这个学员对象的所有属性的值。
 */
public class Test06 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("请输入学员姓名:");
        String nameStudent = scanner.next();
        System.out.println("请输入学员年龄:");
        int ageStudent = scanner.nextInt();
        System.out.println("请输入学员性别:");
        String genderStudent = scanner.next();
        Student student = new Student(nameStudent, ageStudent, genderStudent);
        System.out.println(student);
        System.out.println(student.toString());
    }
}
