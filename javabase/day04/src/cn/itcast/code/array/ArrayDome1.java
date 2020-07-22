package cn.itcast.code.array;
/*
    数组的创建格式
        动态初始化
            数据类型[] 数组名 = new 数据类型[长度];
            数据类型 数组名[] = new 数据类型[长度];
        静态初始化
*/
public class ArrayDome1 {
    public static void main(String[] args) {
        //创建一个可以装10个整数的数组
        int[] arr = new int[10];
        //创建一个可以装20个小数的数组
        double[] arr1 = new double[20];
        //创建一个可以存储100个字符串的数组
        String[] arr2 = new String[100];

        //创建一个数组,数组中包含1,2,3,4,5,
        int[] arr3 = new int[]{1,2,3,4,5};
        int[] arr4 = {1,2,3,4,5};
        //两种静态初始化的区别,简单个事必须一行写完,不能分开写
        int[] arr5;
        arr5 = new int[]{1,2,3,4,5};
        /*
        int[] arr6;
        arr6 = {1,2,3,4,5};
        */
    }
}
