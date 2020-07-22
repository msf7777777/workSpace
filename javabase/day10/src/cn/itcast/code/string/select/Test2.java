package cn.itcast.string.select;

import java.util.Scanner;

public class Test2 {

    public static void main(String[] args) {
        //键盘录入一个字符串, 统计小写字母有多少个????
        //1.创建Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String line = scanner.next();
        //2.取出字符串中的每一个字符, 判断字符是否是小写字母
        //3.定义计数器
        int count = 0;
        for (int i = 0; i < line.length(); i++) {
            //通过charAt得到每一个字符
            char c = line.charAt(i);
            // 判断字符是否是小写字母
            if(c >= 'a' &&  c <= 'z'){
                count++;
            }
        }
        System.out.println(line+"里面有:"+ count+"个小写字母");




    }
}
