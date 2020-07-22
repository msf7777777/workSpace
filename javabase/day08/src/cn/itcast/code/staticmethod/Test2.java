package cn.itcast.staticmethod;
/*

 */
public class Test2 {
    int number ;
    public static void main(String[] args) {
        //System.out.println(number);//典型错误,因为此时没有调用构造, number并未初始化好
       // getSum(10, 20);//语法错误, 为什么让他语法错误!!!!!!
        //如果成员方法就是不加静态修饰, 要如何想使用
        Test2 test2 = new Test2();
        test2.getSum(2, 2);//语法正确, 因为走了构造, 即便getSum使用了
            //成员变量, 也是ok没问题, 是初始化好的
    }

    public  void getSum(int a,int b){
        // 这是属于成员方法, 这个方法中有可能使用成员变量,
        // 一旦使用了成员变量就需要构造函数的初始化

    }
}
