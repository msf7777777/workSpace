package cn.itcast.task;

import java.util.Scanner;

/*
6 题目六
	键盘录入5个字符串存入数组中.
	将数组中,字符串长度<3 的字符串挑出来存入新数组中,最后将新数组中的元素打印到控制台
 */
public class Test06_new {
    public static void main(String[] args) {
        //1.定义一个长度为5的字符串数组
        String[] arr = new String[5];
        //2.定义计数器记录数组arr中字符串长度<3的元素的个数
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入数组第" + (i + 1) + "个元素:");
            arr[i] = scanner.next();
            if(arr[i].length() < 3){
                count++;
            }
        }
        
        //3.定义一个新的数组来接收原数组中字符串<3的元素
        String[] newArr = new String[count];
        //4.定义新的计数器在便利老数组时候后变换新数组的索引
        int countNew = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].length() < 3){
                newArr[countNew] = arr[i];
                countNew++;
            }
        }
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }
    }
}
