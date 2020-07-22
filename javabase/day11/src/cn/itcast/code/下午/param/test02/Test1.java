package cn.itcast.code.下午.param.test02;
/*
    抽象类作为参数和返回值
 */
public class Test1 {

    public static void main(String[] args) {
        // 抽象类也是引用数据类型我们赋值的时候一定也是赋值一个地址值, 抽象类不能直接new, 只能new其子类
        //Animal animal = new Animal();// 抽象类不能直接创建对象
        method(new Cat());

    }

    public static void method(Animal animal){
        animal.eat();
    }
    /*
        抽象类作为返回值类型, 我们需要返回该抽象类的地址,但是抽象类不能直接new
        我们需要返回其子类对象
     */
    public static Animal method(){
        return new Cat();
    }
}
