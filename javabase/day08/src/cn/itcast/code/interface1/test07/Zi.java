package cn.itcast.interface1.test07;
/*
    当我们实现多个接口中默认方法冲突了, 子类必须重写该默认方法
 */
public class Zi  implements A,B {
    @Override
    public void method() {
        System.out.println("走干爹A的");
    }
}
