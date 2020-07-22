package cn.itcast.staticmethod;

import java.util.Arrays;

public class Test3 {

    public static void main(String[] args) {
        int[] arr = {1,23,43432,5432,4435};
        //打印数组
        //ArrayUtil arrayUtil = new ArrayUtil();
        //arrayUtil.printArr(arr);
        ArrayUtil.printArr(arr);
        //求数组中的最大值
        int max = ArrayUtil.getMax(arr);
        System.out.println(max);
        //int max = arrayUtil.getMax(arr);
       // System.out.println(max);
        //Student.name = "梅军建";
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student();

        System.out.println(Arrays.toString(arr));
    }
}
