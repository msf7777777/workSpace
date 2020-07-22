package cn.itcast.task;
/*
2. 已知数组int[] arr = {5, 15, 2000, 10000, 100, 4000};,
求数组所有元素中的最小值.
 */
public class task02 {
    public static void main(String[] args) {
        int[] arr = {5, 15, 2000, 10000, 100, 4000};
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if(num < min){
                min = num;
            }
        }
        System.out.println(min);
    }
}
