package cn.itcast.practice.p_332;
//继承默认方法
// 定义接口：
public interface LiveAble {
    public default void fly(){
        System.out.println("天上飞");
    }
}
