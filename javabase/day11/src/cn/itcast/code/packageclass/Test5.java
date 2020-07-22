package cn.itcast.code.packageclass;

import java.util.Scanner;

/*
    包装类唯一的价值, 是可以实现字符串转成基本数据类型
      static  parseInt(String s)
       static   parseDouble(String s)
       static   parseByte(String s)
       static   parseBoolean(String s)
      static    parseFloat(String s)
        static  parseLong(String s)
        static  parseShort(String s)
     注意事项:
        1.一定要是其对应的类型才可以转, 否则会报
            NumberFormatException
        2.如果boolean类型的话, 只有"true"才会转成true,其他字符串都是false
        3.Character里面没有parse方法
 */
public class Test5 {

    public static void main(String[] args) {
        // 键盘录入一行字符串, 字符串中必须是数字, 多个数字之间用,隔开, 求这个几个数字的和
        //录入:  123,345,65,67,78,98734,234,123,123,123,123,123
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数字的字符串");
        String s = scanner.next();
        //可以使用","来去切割, 将其切割若干个数字
        String[] arr = s.split(",");
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            //sum += arr[i];//  sum = sum + arr[i];
            //我们应该讲arr[i]变成数字才可以继续运算 ----> Integer.ParseInt(arr[i])
            int number = Integer.parseInt(arr[i]);
            sum += number;
        }
        System.out.println(sum);

    }
}
