package cn.itcast.task;
/*
4. 定义int类型的数组, 存储数据: 11, 33, 22, 55, 44,
对数组元素进行反转, 并打印反转后的结果.
 */
public class task04 {
    public static void main(String[] args) {
        int[] arr = {11, 33, 22, 55, 44};
        int temp;
        int left = 0;
        int right = arr.length - 1;
        for (int i = 0; i < arr.length / 2; i++) {
            if(left <= right){
                temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
