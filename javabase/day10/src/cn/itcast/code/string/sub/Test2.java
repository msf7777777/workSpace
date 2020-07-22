package cn.itcast.string.sub;

import java.util.Arrays;

public class Test2 {

    public static void main(String[] args) {
        // String[] split(String regex) --->
        // 将字符串按照某种规则进行切割成若干份, 将若干份的字符串装到字符串数组返回
        String s = "张三,18,男";
        String[] arr = s.split(",");
        System.out.println(arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        /*
         注意

         1. 切完后, 切割点不保存
        2. 这个方法是一个正则方法, 在使用.的时候一定要小心, 因为.在正则中代表所有字符
            如果非要用.去切割, 加\\转义
         */
        String s1 = "1.2.3.4";
        String[] arr1 = s1.split("\\.");
        System.out.println(arr1.length);


    }
}
