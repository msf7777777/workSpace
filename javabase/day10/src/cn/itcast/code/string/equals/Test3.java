package cn.itcast.string.equals;

import java.util.Scanner;

/*
1. 模拟用户登录, 只给3次机会, 登录成功则提示"欢迎您, ***".
2. 登录失败则判断是否还有登录机会, 有则提示剩余登录次数, 没有则提示"您的账号已被锁定".
3. 假设初始化账号和密码分别为: "传智播客", "黑马程序员".
 */
public class Test3 {

    public static void main(String[] args) {
        //用户需要输入账号和密码, 去查询账号和密码是否正确
        String account = "传智播客";
        String password = "黑马程序员";
        //提示用户录入账号和密码
        Scanner scanner = new Scanner(System.in);
        int count = 3;

        for (int i = 0; i < 3; i++) {
            System.out.println("请输入账号");
            String acc = scanner.next();// new String
            System.out.println("请输入密码");
            String pass = scanner.next();//new String
            count--;
            //判断账号和密码
            if(acc.equals(account) && pass.equals(password)){
                System.out.println("欢迎你"+ acc);
                break;
            }else{
                if(count == 0){
                    System.out.println("哥们你被绑了~~~~");
                }else{
                    System.out.println("输入错误,还剩下"+count+"次");
                }
            }
        }


    }
}
