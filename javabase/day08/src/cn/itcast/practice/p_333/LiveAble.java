package cn.itcast.practice.p_333;
//重写默认方法
//定义接口：
public interface LiveAble {
    public default void fly(){
        System.out.println("天上飞");
    }
    public static void fuck(){
        System.out.println("fuck");
    }
}
