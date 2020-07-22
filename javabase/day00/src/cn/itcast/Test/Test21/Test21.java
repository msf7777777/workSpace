package cn.itcast.Test.Test21;

import java.util.Scanner;

/*
21、提示用户键盘录入一个包含数字和字母的字符串（不做是否包含数字和字母的判断），
    遍历字符串分别筛选出数字和字母（如有符号不包含在字母里），
    按照数字在前字母在后的规则组成一个新的字符串，把组成的新字符串打印在控制台。

例如：

 */
public class Test21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("录入一个包含数字和字母的字符串");
        String str = scanner.next();
        StringBuilder num = new StringBuilder();
        StringBuilder num2 = new StringBuilder();
        int count = 0;
        int count2 = 0;

        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] >= '0' && arr[i] <= '9'){
                num.append(arr[i]);
                count++;
            }else if(arr[i] >= 'A' && arr[i] <= 'z'){
                num2.append(arr[i]);
                count2++;
            }
        }


    }
}
