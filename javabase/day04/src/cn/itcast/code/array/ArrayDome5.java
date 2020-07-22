package cn.itcast.code.array;

    public class ArrayDome5 {
        public static void main(String[] args) {
            //1. 定义一个长度为3的int类型的数组.
            int[] arr1 = new int[3];
            //2. 修改数组中的第一个元素为: 11
            arr1[0] = 11;
            //3. 打印数组中的第一, 第二个元素.
            System.out.println(arr1[0]);//11
            System.out.println(arr1[1]);//0
            //4. 打印数组对象.
            System.out.println(arr1);
            //5. 定义一个int类型的数组, 存储元素1, 2.
            int[] arr2 = {1, 2};
            //6. 修改数组的第二个元素值为: 22.
            arr2[1] = 22;
            //7. 打印数组的第二个元素.
            System.out.println(arr2[1]);//22
            //8. 打印数组对象.
            System.out.println(arr2);
        }
}
