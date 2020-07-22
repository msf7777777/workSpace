package cn.itcast.staticmethod;

public class Demo {

    private int number;


    public  void method(String name){
        System.out.println("我喜欢和"+name+"一起玩" );
        System.out.println(number);//正确的, 这个method既然可以调用,一定走了构造函数, 走了构造函数,number一定初始化好了
       staticMethod(name);// 正确的,这个method既然可以调用,一定走了构造函数, 而且方法取中静态的方法
                        //staticMethod是可以找到的, 当然可以使用
    }

    public static void staticMethod(String name){
        System.out.println("我喜欢和"+name+"一起玩" );
        //System.out.println(number);//
        // 语法错误: 静态的方法可能直接被类名调用,根本没有走构造函数, number可能未初始化,
    }
}
