package cn.itcast.code.下午.math;

import java.util.Map;

/*
    public static int abs(int a)获取参数a的绝对值：
		----> 绝对值, 正数的绝对值是其本身, 负数的绝对值是其相反数
	public static double ceil(double a)向上取整
		---->取离自己最近的上面的整数
	public static double floor(double a)向下取整
		---->取离自己最近的下面的整数
	public static double pow(double a, double b)
		---->获取a的b次幂
	public static long round(double a)
		----> 四舍五入取整
 */
public class Test1 {

    public static void main(String[] args) {
        int a = -10;
        // public static int abs(int a)获取参数a的绝对值：
        int abs = Math.abs(a);
        System.out.println(abs);
        //public static double ceil(double a)向上取整
        double d1 = -2.1;
        double d2 = -2.9;
        /*System.out.println(Math.ceil(d1));
        System.out.println(Math.ceil(d2));*/
        //public static double floor(double a)向下取整
        System.out.println(Math.floor(d1));
        System.out.println(Math.floor(d2));
        //public static double pow(double a, double b)
        System.out.println(Math.pow(2, 3));
        //public static long round(double a)
        System.out.println(Math.round(3.4));//3
        System.out.println(Math.round(3.5));//4
        System.out.println(Math.round(-3.6));
        System.out.println(Math.round(-3.7));

    }
}
