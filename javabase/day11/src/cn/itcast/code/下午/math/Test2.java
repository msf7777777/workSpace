package cn.itcast.code.下午.math;

import java.util.Map;

public class Test2 {
    public static void main(String[] args) {
        //打印所有的水仙花数
        for (int i = 100; i < 1000; i++) {
            int ge = i %10;
            int shi = i/10 %10;
            int bai = i/100 %10;
            if(Math.pow(ge, 3)+ Math.pow(shi, 3)+ Math.pow(bai, 3) == i){
                System.out.println(i);
            }

        }
    }
}
