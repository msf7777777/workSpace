package cn.itcast.stringbuilder;

import java.util.Scanner;

public class Test5 {
    /*
    String 和StringBuilder的互转
     */
    public static void main(String[] args) {
        //键盘录入一个字符串, 将其反转答应到控制台
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = scanner.next();
        //自己需要手动拼接,倒着遍历去拼接, 效率比较低下
        //1.先将String 变成StringBuilder ---> 通过有参构造
        StringBuilder sb = new StringBuilder(str);
        //2.可以使用sb的reverse方法去转换
        sb.reverse();
        //3.将sb变成回字符串 ---->通过toString();
        String result = sb.toString();
        System.out.println(result);


    }
}
