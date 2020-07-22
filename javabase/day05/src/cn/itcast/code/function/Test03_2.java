package cn.itcast.code.function;

import java.util.Scanner;

public class Test03_2 {
    public static void main(String[] args) {
        f1(2, 3, "麻少飞 ");

        int reslt = f2(6, 7);
        System.out.println(reslt);

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的幸运数字减去1的数字:");
        int lucky = sc.nextInt();
        lucky = f3(lucky);
        System.out.println("你的幸运数字是:" + lucky);
    }

    public static void f1(int m, int n, String str) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(str);
            }
            System.out.println();
        }
    }

    public static int f2(int chang, int kuan){
        return chang * kuan;

    }

    public static int f3(int number){
        return number + 1;
    }
}
