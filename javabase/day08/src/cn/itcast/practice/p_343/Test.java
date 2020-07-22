package cn.itcast.practice.p_343;
/*
当一个类，既继承一个父类，又实现若干个接口时，
    父类中的成员方法与接口中的默认方法重名，
    子类就近选择执行父类的成员方法。
 */
//定义测试类：
public class Test {
    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.methodA();//优先输出 父类方法methodA
        //优先父类输出(父类中的成员方法与接口中的默认方法重名)
    }
}
