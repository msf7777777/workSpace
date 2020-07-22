package cn.itcast.task;

import java.util.Scanner;

/*
3. 键盘录入3个整数, 并将它们都存入到数组中,
 然后获取所有元素之和, 并打印结果.
 */
public class task03 {
    public static void main(String[] args) {
        int[] arr = new int[3];
        Scanner sc = new Scanner(System.in);
        int score;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个整数：");
            score = sc.nextInt();
            arr[i] = score;
        }
        System.out.println("打印数组中的每个数:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
