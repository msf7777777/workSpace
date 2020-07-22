package cn.itcast.task;

import java.util.Scanner;

/*
4 题目四
	程序从控制台接收一个java文件的文件名，
	例如：test.java，TEST.java，tEst.JAVA，请编程实现以下功能：
	获取，并打印文件名的第一个字符；
	获取，并打印文件的后缀名(包括.符号)，例如：.java
	无论原文件名什么样，最终将其转换为：Test01.java的形式，打印转换后的文件名。
 */
public class Test04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个文件名字");
        String fileName = sc.next();
        if(fileName.endsWith(".java")){
            //获取，并打印文件名的第一个字符
            System.out.println("文件名第一个字符是:");
            System.out.println(fileName.charAt(0));

            //截取文件名后缀名
            String suffixFileName = fileName.substring((fileName.length() - 5), fileName.length());
            System.out.println("文件名后缀名是:");
            System.out.println(suffixFileName);

            //转换文件名为 Test01.java
            StringBuilder newFileName = new StringBuilder();
            newFileName.append("Test01");
            newFileName.append(suffixFileName);
            System.out.println("转换后的文件名为");
            System.out.println(newFileName);

        }

    }
}
