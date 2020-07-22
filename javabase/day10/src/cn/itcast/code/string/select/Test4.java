package cn.itcast.string.select;

import java.util.Scanner;

/*
    字符串反转
 */
public class Test4 {

    public static void main(String[] args) {
        //键盘录入一个字符串, 将这个字符串反转
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = scanner.next();// abc ---> cba
        String newStr = "";
        //遍历老的字符串
        /*for (int i = str.length() - 1; i >= 0 ; i--) {
            newStr += str.charAt(i);
        }*/
        for (int i = 0; i < str.length() ; i++) {
            newStr =  str.charAt(i)+ newStr;
        }
        System.out.println(newStr);
    }
}
