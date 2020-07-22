package cn.itcast.practice.p_351;
//如果父接口中的默认方法有重名的，那么子接口需要重写一次
//定义 子 接口JieKouZi
public interface JieKouZi extends JieKouA, JieKouB {
    //子接口 JieKouZi 重写一次接口 JieKouA & JieKouB 重名的方法
    @Override
    default void method() {
        System.out.println("输出重写JieKouA & JieKouB 重名的方法");
    }
}
