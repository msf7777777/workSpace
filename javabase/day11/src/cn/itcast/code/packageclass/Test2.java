package cn.itcast.code.packageclass;
/*
        JDK1.5之前, 包装类和基本数据类型有严格的区分
        装箱:  将基本的数据类型变成引用数据类型
        拆箱:  将引用变成基本数据类型
        JDK1.5出现了新特性,自动拆装箱
            总结:
                我们可以将基本数据类型看成引用数据类型来使用就ok了!!!!!!!

 */
public class Test2 {

    public static void main(String[] args) {
        Integer i = new Integer(10);//将int的10变成Integer的10 ---->装箱
        // 开发过程中有可能有 Integer ---->int的需求, 因为要使用运算符,引用数据类型不可以使用运算符
        int i1 = i.intValue();// 拆箱
        System.out.println(i1 * 2);

    }
}
