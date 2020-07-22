package cn.itcast.task.task04;
/*
    创建测试类，在测试类的main方法中完成：
            通过满参构造创建一个姓名为“旺财”Dog类对象。
            调用这个对象的goPlay()方法。
	程序运行后的打印示例:
		旺财说:我去玩了!
		旺财狗刨中!
 */
public class Test {
    public static void main(String[] args) {
        //1.创建对象
        Dog dog = new Dog("辣鸡儿", "鸡型犬");
        dog.goPlay();
    }
}
