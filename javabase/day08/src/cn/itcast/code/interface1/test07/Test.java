package cn.itcast.interface1.test07;

/*
    干爹中和干爹的方法冲突问题
        子类必须重写这个冲突的方法才可以
 */
public class Test {

    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.method();
    }
}
