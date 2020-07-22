package cn.itcast.code.generator.selfgenerator;
/*
    定义实现类时可以不确定接口中的泛型, 我们必须继续将泛型声明出去
    让别人创建实现类对象时候确定
 */
public class AImpl1<E> implements A<E> {
    @Override
    public void method(E e) {

    }
}
