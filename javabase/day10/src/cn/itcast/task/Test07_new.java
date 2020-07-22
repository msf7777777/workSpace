package cn.itcast.task;

import java.util.Scanner;

/*
7 题目七
	键盘录入5个字符串存入数组中.
	将数组中的元素都变成大写并反转,然后拼接成一个字符串输出到控制台上
 */
public class Test07_new {
    public static void main(String[] args) {
        //1.定义一个长度为5的字符串数组
        String[] arr = new String[5];
        //2.遍历数组,手动输入数组的元素
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个字符串");
            arr[i] = scanner.next();
        }
        //3.将数组中的元素都变成大写并反转
        for (int i = 0; i < arr.length; i++) {
            //3.1.将数组元素变成大写(用.toUpperCase()方法)
            String arrUpperCase = arr[i].toUpperCase();
            //3.2.将数组元素反转(用StringBuilder的.reverse方法)
            StringBuilder arrFanZhuan = new StringBuilder(arrUpperCase);
            arrFanZhuan.reverse();
            //3.3.用toString方法再将反转后的元素变为字符串
            String arrNew = arrFanZhuan.toString();
            arr[i] = arrNew;
            //以下代码省去上面所有步骤:
            //strArray[i] = new StringBuilder(strArray[i].toUpperCase()).reverse().toString();
        }
        //4.遍历数组,并用.append()方法打印拼接后的数组元素字符串
        StringBuilder pinJie = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            pinJie.append(arr[i]);
        }
        System.out.println(pinJie);
    }
}
