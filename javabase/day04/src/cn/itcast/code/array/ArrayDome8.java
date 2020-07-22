package cn.itcast.code.array;

public class ArrayDome8 {
    public static void main(String[] args) {
        //1. 定义int类型的数组, 存储元素11, 22.
        int[] arr = {11, 22};///0x001
        //2. 将null(空常量)赋值给数组.
        arr = null;//代表什么都没有
        arr = new int[10];
        //3. 尝试打印数组的第一个元素.
        System.out.println("arr[0]: " + arr[0]);
    }
}
