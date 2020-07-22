package cn.itcast.code.arrays;

import java.util.Arrays;

/*
    分析: Arrays里面的方法都是静态的, 不用创建对象, 直接拿着类名.调用就可以了
- public static void sort(int[] a)：按照数字顺序排列指定的数组
    基础班:
        数字排序: 数值的大小
        字符串排序: 按照底层的ASCII码值进来排序
        引用数据类型排序: 交给就业班
- public static String toString(int[] a)：返回指定数组的内容的字符串表示形式
 */
public class Test1 {

    public static void main(String[] args) {
        //- public static String toString(int[] a)：返回指定数组的内容的字符串表示形式
        int[] arr = {5, 6, 7, 1, 2, 3, 4};
        String string = Arrays.toString(arr);// 打印数组的内容
        System.out.println(string);
        //- public static void sort(int[] a)：按照数字顺序排列指定的数组
        Arrays.sort(arr);// 对数组进行排序
        System.out.println(Arrays.toString(arr));
        String[] arrStr = {"abc","aaa","321","123"};

        Arrays.sort(arrStr);
        System.out.println(Arrays.toString(arrStr));
        //"abc" "acb"



    }
}
