package cn.itcast.interface1.test08;
/*
    接口中的静态方法调用格式:  接口名.方法名(实际参数)
    注意实现:
        接口中的静态方法不能使用实现类去调用
 */
public class Test1 {

    public static void main(String[] args) {
        A.method();
       // Impl impl = new Impl();
        //impl.method(); //典型错误, 不可以使用实现类来调用接口的静态方法
        B.method();
    }
}
