package cn.itcast.code.final1.method;
/*
    总结:
        final修饰的方法不能再被子类重写
    使用场景:
        当我们的方法不希望子类来修改的时候, 可以使用final修饰
 */
public class Fu {

    //最终方法, 使用场景,当你的某个方法写的已经很完美了, 不希望别人去修改了!!!!!
    public final void methodFu(){

    }

    public  void methodFu1(){

    }
}
