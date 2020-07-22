package cn.itcast.code;

public class VariableDemo{
    public static void main(String[] args){
        //定义八种基本数据类型变量 -----> 定义八种容器
        //1.定义byte类型的容器
        byte b = 120;// byte的范围是 -128 ~ 127 ,我们在赋值的时候不要超过这个范围

        System.out.println(b);
        //2.定义short类型的容器
        short s =30000;
        System.out.println(s);
        //3.定义int类型的容器
        int i = 10;
        System.out.println(i);
        //4.定义long类型的容器
        long number = 3000000000L;
        System.out.println(number);
        //5.定义float类型的容器
        float f = 10.22F;
        System.out.println(f);
        //6.定义double类型的容器
        double d = 10.2234;
        System.out.println(d);
        //7.定义char类型的容器
        char c = 'a';
        System.out.println(c);
        //8.定义boolean类型的容器
        boolean bb = true;
        System.out.println(bb);
        {
            int aa = 10;
            System.out.println(aa);
        }
        //System.out.println(aa); 找不到因为aa只在其所属的大括号中有效
		/*
		int aaa = 10;
		int bbb = 20;
		int ccc = 30;
		*/
        int aaa = 10, bbb = 20, ccc = 30; // 一行可以定义多个变量, 但是非常的不推荐
        System.out.println(aaa);
        System.out.println(bbb);
        System.out.println(ccc);
        {
            int number1 = 2;
            System.out.println(number1);
        }
        {
            int number1 = 2;
            System.out.println(number1);
        }
    }
}

/*
	1.整数默认是int类型的,小数默认是double类型,定义float的时候注意加F, 定义Long类型的话注意加L
	2.变量参数运算是其值在参与运算
	3.变量未赋值，不能使用.(因为变量参与运算是其值参与运算,没有值怎么参与运算)
	4.变量只在它所属的范围内有效.(变量在其所属的大括号中有效, 出了大括号就会消失);
	5.一行上可以定义多个变量，但是不建议
	6.java中存在常量优化机制
	7.同一个作用范围不能出现同名的变量
*/
