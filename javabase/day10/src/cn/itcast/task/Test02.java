package cn.itcast.task;

import java.util.Scanner;

/*
2 题目二
	请用户从控制台输入一个java文件的名字，例如：Test01.java，请编程实现以下功能：
	判断此文件名是否以“.java”结尾，并打印结果
	获取此文件中.符号的索引位置，并打印结果
 */
public class Test02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个文件的名字");
        String file = sc.next();
        //判断此文件名是否以“.java”结尾，并打印结果
        if(file.endsWith(".java")){
            System.out.println("这是一个java文件");
            for (int i = 0; i < file.length(); i++) {
                System.out.print(file.charAt(i));
            }
            System.out.println("");
        }else{
            System.out.println("非java文件");
        }
        //获取此文件中.符号的索引位置，并打印结果
        System.out.println("文件中 . 符号的索引位置是:" + (file.length() - 5));
    }
}
