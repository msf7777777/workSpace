package cn.itcast.task.homework;

import java.util.Scanner;

/*
8 题目八
	键盘录入5个字符串存入数组中.
	将数组中包含数字的元素打印到控制台上
 */
public class Test08 {

    public static void main(String[] args) {
        //创建键盘录入对象
        Scanner scanner = new Scanner(System.in);
        //创建字符串数组
        String[] strArray = new String[5];
        //循环输入5个字符串
        for (int i = 0; i < strArray.length; i++) {
            System.out.println("请输数组入第" + (i + 1) + "个字符串");
            //接收字符串
            strArray[i] = scanner.next();
        }
        //遍历数组得到每一个字符串
        for (int i = 0; i < strArray.length; i++) {
            String s = strArray[i];
            //判断s中是否有数字
            int count = 0;//定义计数器统计数字字符出现的次数
            //遍历字符串,拿到每一个字符
            for (int j = 0; j <s.length() ; j++) {
                char c = s.charAt(j);
                if(c >= '0' && c <= '9'){
                    count++;
                    break;
                }
            }
            //判断count是否>0
            if(count > 0){
                //证明s里面有数字,就输出s
                System.out.println(s);
            }
        }

    }
}
