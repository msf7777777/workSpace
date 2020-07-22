package cn.itcast.code.packageclass;

public class Test1 {
        /*
            Integer(int value)
              构造一个新分配的 Integer 对象，它表示指定的 int 值。
            Integer(String s)
            学习包装类的目的?????????????
                1.他更强大, 有方法
                2.以后我们学习集合, 集合只能存储引用数据类型, 不能存储基本数据类型
                3.引用数据类型的初始化值为null, 可以赋值为null
         */
    public static void main(String[] args) {
        //创建Integer对象, 包装类都是引用数据类型,里面有方法的
        Integer integer = new Integer(10);//代表还是10
        System.out.println(Integer.MAX_VALUE);
        //基本数据类型没有功能的
        int i = 10;
        Integer integer1 = null;




    }
}
