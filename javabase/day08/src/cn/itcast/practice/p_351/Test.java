package cn.itcast.practice.p_351;
//如果父接口中的默认方法有重名的，那么子接口需要重写一次
//定义测试类
public class Test {
    public static void main(String[] args) {
        ShiXian s = new ShiXian();
        s.method();
        int a = 10;
        if(a == JieKouA.A){
            System.out.println("a = A");
        }
        JieKouA.A();
        System.out.println(JieKouA.A);
    }
}
