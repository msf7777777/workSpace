package cn.itcast.code.final1.variable;

public class Test2 {

    public static void main(String[] args) {
        Demo demo = new Demo();
        System.out.println(demo.NUMBER);
        //demo.number = 10;//典型错误, 因为number被final修饰了不能再次赋值
        Demo demo1 = new Demo(10);
    }
}
