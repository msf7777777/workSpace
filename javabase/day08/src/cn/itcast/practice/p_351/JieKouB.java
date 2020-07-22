package cn.itcast.practice.p_351;
//如果父接口中的默认方法有重名的，那么子接口需要重写一次
//定义 父 接口JieKouB
public interface JieKouB {
    public default void method(){
        System.out.println("输出JieKouB");
    }
}
