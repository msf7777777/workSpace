package cn.itcast.code.下午.param.test01;
/*
    引用数据类型作为参数, 返回值类型, 成员变量

 */
public class Test01 {
    public static void main(String[] args) {
        //1.研究类作为参数和返回值
        method(new Demo());
        /*
            总结: 类名作为参数, 我们调用方法需要给参数赋值,
            引用数据类型, 我们需要赋值一个该引用数据类型的地址(对象)
         */
    }

    public static void method(Demo demo){
        System.out.println(demo);
    }

    public static Demo method(){
        return new Demo();// 当类作为返回值类型的时候 ,我们需要返回该类型的地址值
    }
    /*public static int method(){
        return 10;
    }*/
}
