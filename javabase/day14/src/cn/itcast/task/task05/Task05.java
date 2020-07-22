package cn.itcast.task.task05;

import java.util.Scanner;

/*
1.5 题目五
	请按以下步骤要求编写代码：
	定义一个“年龄异常类”：AgeException，使其继承自RuntimeException，并添加无参、String参数的构造方法；
	定义一个“性别异常类”：SexException，使其继承自RuntimeException，并添加无参、String参数的构造方法；
	定义一个Student类，属性：姓名、性别、年龄。
	在性别的set方法中判断是否是男/女，如果不是则抛出：性别异常
	在年龄的set方法中判断年龄是否是15--50之间，如果不是则抛出：年龄异常
	编写测试类，创建一个Student对象，并在try{}中调用setXxx()方法为对象属性赋值，在catch()中打印年龄错误。
 */
public class Task05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入名字:");
        String name = scanner.next();
        System.out.println("请输入年龄:");
        int age = scanner.nextInt();
        System.out.println("请输入性别:");
        String gender = scanner.next();

        try {
            Student msf = new Student(name, age, gender);
            System.out.println(msf.toString());
        } catch (Exception e) {
            e.printStackTrace();
            if(age < 15 || age > 50){
                System.out.println("年龄错误!");
            }
        }

    }
}
