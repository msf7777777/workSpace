package cn.itcast.code.下午.param.test03;

public class Test01 {
    /*
        接口作为参数和返回值的问题

     */
    public static void main(String[] args) {
        method(new AImpl());// 我们在对参数进行赋值的时候, 需要赋值一个地址,接口不能直接new,我们只能new其实现类
    }
    /*
        接口是引用数据类型, 我们在对参数进行赋值的时候, 需要赋值一个地址
     */
    public static void method(A a){
        a.function();
    }
    /*
        接口作为返回值类型, 我们需要返回一个地址,但是接口不能直接new , 只能new其实现类
     */
    public static A method(){
        return new AImpl();
    }

}
