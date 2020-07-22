package cn.itcast.code.final1.variable;

/*
    final修饰局部变量:
        1.基本类型: 其值有且只能被赋值一次, 其值不能发生改变
        2.引用类型: 其值有且只能被赋值一次, 其地址值不能发生改变, 其中内容可以改变
 */
public class Test1 {
    public static void main(String[] args) {
        // 定义一个局部变量
        //1.基本数据类型 ----> 其值不能发生改变, 有且只有被赋值一次
        final int number = 10;
        //number = 20;//典型错误, final修饰的变量叫做最终变量, 其值有且只能被赋值一次
        final int number1;
        number1 = 20;
        // number1 =30;//典型错误, 这是第二次赋值
        //2.引用数据类型 ----> 其地址值不能发生改变, 但是内容可以改变
        final Student student = new Student("梅军建", 18);
        student.setName("林青霞"); //? 地址并没有发生变化, 所有正确
        //student = new Student("梅军建",18); // 典型错误, 被final修饰的引用数据类型, 地址不能发生改变
        get(10, 20);
    }

    //3.final修饰参数列表变量, 参数列表的变量值不能再被修改
    public static int get(final  int a,final int b) {
      /*  a *= 2;
        b *= 3;*/
        return a + b;
    }
}
