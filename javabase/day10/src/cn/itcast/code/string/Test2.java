package cn.itcast.code.string;

import java.util.Scanner;

public class Test2 {
    /*
        构造的字符串和常量字符串的区别
        == 比较的是地址
        字符串常量有常量优化机制, 如果是多个字符串常量在拼接, 他会将拼接完成结果
        去常量池中去找, 如果找到就不会创建对象
        总结:
            字符串有什么时候 == 比较是相同的, 有时候==比较是不相同的
           如果我们要比较字符串的内容是否相同的话, 我们建议不要使用==
            建议使用字符串的equals来去比较内容!!!!!!!!!

     */
    public static void main(String[] args) {
        String s1 = new String("abc");
        String s4 = new String("abc");
        String s2 = "abc";

        String s3 = "abc";
        Scanner scanner = new Scanner(System.in);

        String s6 = scanner.next();
        String s5 = "ab" + "c";
        String s7 = s6 + "c";
        System.out.println(s1 == s2);// false
        System.out.println(s2 == s3);// true
        System.out.println(s4 == s1);// false
        System.out.println(s3 == s5);// ?true
        System.out.println(s7 == s5);// ?false. 因为有变量参与运算没有常量优化机制


    }
}
