package cn.itcast.task.homework;

/*
6 题目六
	键盘录入5个字符串存入数组中.
	将数组中,字符串长度<3 的字符串挑出来存入新数组中,最后将新数组中的元素打印到控制台
 */

import java.util.Scanner;

public class Test06 {

    public static void main(String[] args) {
        //1.定义一个长度为5的字符串数组
        String[] arr = new String[5];
        //定义变量统计长度<3的个数
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第"+(i+1)+"个字符串");
            String str = scanner.next();
            arr[i] = str;
            //判断这个字符串长度是否小于3
            if(str.length() < 3){
                count++;
            }
        }
        //判断count是否为0 , 如果为0证明没有一个长度<3的元素
        if(count == 0){
            System.out.println("此数组中没有长度<3的元素");
        }else{
            //2.创建一个新的数组,来去装长度<3的元素 ----> 长度不确定, 元素也不确定
            String[] newArr = new String[count];
            //3.遍历老数组将, 满足条件的放到新数组中
            int newIndex = 0;//定义新数组的索引, 方便操作新数组用的
            for (int i = 0; i < arr.length; i++) {
                String s = arr[i];
                //判断s是否长度小于3
                if(s.length() < 3){
                    newArr[newIndex] = s ;
                    //将新数组索引往后移动一位
                    newIndex++;
                }
            }

        }


    }
}
