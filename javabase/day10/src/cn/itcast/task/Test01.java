package cn.itcast.task;
/*
1 题目一
	请用户从控制台输入一个“Email地址”，
	程序接收后判断此Email地址中是否包含@符号和.符号，
	如果全部包含，打印：合法，否则打印：不合法的Email地址。
 */


import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个邮箱号:");
        String email = sc.next();
        if(email.contains(".") && email.contains("@")){
            System.out.println("确认是邮箱账号");
        }else{
            System.out.println("非邮箱账号");
        }

    }
}
