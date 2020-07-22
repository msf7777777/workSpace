package cn.itcast.staticmethod;
/*
    静态的方法:
        可以通过类名去调用, 属于整个类的方法
    成员方法:
        必须通过对象才可以调用
    静态使用注意事项:
        结论: 静态的只能访问静态的, 非静态的可以访问静态
        原因是因为非静态的东西一定要走构造函数才有意义, 而静态的东西直接通过类名访问,不要走构造的
 */
public class Test1 {
    public static void main(String[] args) {
        //1.没有static需要创建对象,必须通过构造来初始化成员方法
        Demo demo = new Demo();
        demo.method("林青霞");
       // Demo.method("梅军建"); //语法错误 因为method中有可能使用成员变量, 需要构造初始化
        Demo.staticMethod("王祖贤");

    }
}
