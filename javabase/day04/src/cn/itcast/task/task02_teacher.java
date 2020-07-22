package cn.itcast.task;
/*
2. 已知数组int[] arr = {5, 15, 2000, 10000, 100, 4000};,
求数组所有元素中的最小值.
 */
public class task02_teacher {
    public static void main(String[] args) {
        int[] arr = {5, 15, 2000, 10000, 100, 4000};
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
