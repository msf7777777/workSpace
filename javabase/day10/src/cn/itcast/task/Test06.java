package cn.itcast.task;

import java.util.Scanner;

/*
6 题目六
	键盘录入5个字符串存入数组中.
	将数组中,字符串长度<3 的字符串挑出来存入新数组中,
	最后将新数组中的元素打印到控制台
 */
public class Test06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + ( i+ 1) + "个字符串");
            arr[i] = sc.next();
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].length() < 3){
                count++;
            }
        }
        System.out.println(count);
        int count2 = 0;
        String[] newArr = new String[count];
        for (int j = 0; j < arr.length; j++) {
            if(arr[j].length() < 3){
                newArr[count2] = arr[j] ;
                count2++;
            }
        }
        for (int i = 0; i < count; i++) {
            System.out.println(newArr[i]);
        }
    }
}
