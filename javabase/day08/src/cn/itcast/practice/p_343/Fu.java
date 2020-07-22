package cn.itcast.practice.p_343;
/*
当一个类，既继承一个父类，又实现若干个接口时，
    父类中的成员方法与接口中的默认方法重名，
    子类就近选择执行父类的成员方法。
 */
//定义父类：
public class Fu {
    public void methodA(){
        System.out.println("输出Fu");
    }
}
