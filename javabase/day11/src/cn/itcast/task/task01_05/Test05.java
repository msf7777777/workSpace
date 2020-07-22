package cn.itcast.task.task01_05;
/*
题目五
  请编程进行以下运算：
	请计算3的5次幂
	请计算3.2向上取整的结果
	请计算3.8向下取整的结果
	请计算5.6四舍五入取整的结果
 */
public class Test05 {
    public static void main(String[] args) {
        //1.请计算3的5次幂
        int a = 3;
        System.out.println("计算3的5次幂:");
        System.out.println(Math.pow(3, 5));
        //2.请计算3.2向上取整的结果
        double b = 3.2;
        System.out.println("计算3.2向上取整:");
        System.out.println(Math.ceil(b));
        //3.请计算3.8向下取整的结果
        double c = 3.8;
        System.out.println("计算3.8向下取整:");
        System.out.println(Math.floor(c));
        //4.请计算5.6四舍五入取整的结果
        double d =5.6;
        System.out.println("计算5.6四舍五入取整:");
        System.out.println(Math.round(d));

    }
}
