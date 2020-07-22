package cn.itcast.code.array;

public class ArrayDome6 {
    public static void main(String[] args) {
        //1. 定义一个int类型的数组, 存储元素11, 22, 33.
        int[] arr1 = {11, 22, 33};
        //2. 打印数组对象.
        System.out.println("arr1: " + arr1);
        //3. 打印数组中的各个元素值.
        System.out.println("arr1[0]: " + arr1[0]);
        System.out.println("arr1[1]: " + arr1[1]);
        System.out.println("arr1[2]: " + arr1[2]);
        //4. 定义第二个数组, 把第一个数组的地址值赋值给第二个数组.
        int[] arr2 = arr1;
        //5. 通过第二个数组, 修改第二个元素值为200.
        arr2[1] = 200;
        //6. 打印数组对象.
        System.out.println("arr2: " + arr2);
        //7. 打印数组中的各个元素值.
        System.out.println("arr2[0]: " + arr2[0]);
        System.out.println("arr2[1]: " + arr2[1]);
        System.out.println("arr2[2]: " + arr2[2]);

        System.out.println("arr2[1]: " + arr2[1]);
        System.out.println("arr1[1]: " + arr1[1]);
    }
}
