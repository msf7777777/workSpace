package cn.itcast.task;

import java.util.Scanner;

/*
7 题目七
	键盘录入5个字符串存入数组中.
	将数组中的元素都变成大写并反转,然后拼接成一个字符串输出到控制台上
 */
public class Test07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr1 = new String[5];
        for (int i = 1; i <= arr1.length; i++) {
            System.out.println("请输入第" + i + "个字符串");
            arr1[i - 1] = sc.next();
        }
        String[] arrNew = new String[5];
        String newStr = "";
        for (int i = 0; i < arr1.length; i++) {
//            for (int j = 0; j < arr1[i].length(); j++) {
//                if(arr1[i].charAt(i) >= 97 && arr1[i].charAt(i) <= 122){
//
//                }
//            }
            arrNew[i] = arr1[i].toUpperCase();
        }
        String str;
        for (int i = 0; i <= arrNew.length/2; i++) {
            str = arrNew[i];
            arrNew[i] = arrNew[arrNew.length - 1 - i];
            arrNew[arrNew.length - 1 - i] = str;
        }

        for (int i = 0; i < arrNew.length; i++) {
            System.out.println(arrNew[i]);
        }
        String s = "[";
        for (int i = 0; i < arrNew.length; i++) {
            if(i == arrNew.length - 1){
                s += arrNew[i] +"]";
            }else{
                s += arrNew[i] +",";
            }

        }
        System.out.println(s);
    }
}
