package cn.itcast.interface1.test10;
//接口和接口之间是继承关系,可以多继承
/*
    当多个父接口中的默认方法冲突了, 子接口要重写冲突的方法
 */
public interface C extends A,B {
    @Override
    default void defaultMethod() {

    }
}
