package cn.itcast.interface1.test06;
/*
    干爹中和亲爹方法冲突问题
        优先使用亲爹的方法
 */
public class Test {

    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.method();
    }
}
