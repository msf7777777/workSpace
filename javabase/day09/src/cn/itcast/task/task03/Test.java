package cn.itcast.task.task03;
/*
    (5)测试类:
        a.利用多态的形式创建女朋友对象,为姓名,身高赋值
            调用做饭和洗衣服方法

        b.利用多态的形式创建男朋友对象,为姓名,身高赋值
            调用挣钱和逛街方法
 */
public class Test {
    public static void main(String[] args) {
        //1.创建对象
        Human bf = new BoyFriend("麻少飞",176);
        Human gf = new GirlFriend("张嘉敏", 168);
        Clothes clothes = new Clothes("YSL","橘子#13");

        //2.向下转型
        BoyFriend boyFriend = (BoyFriend) bf;
        GirlFriend girlFriend = (GirlFriend) gf;

        //3.调用方法
        boyFriend.makeMoney();
        boyFriend.shopping(girlFriend);

        girlFriend.cook();
        girlFriend.wash(clothes);
    }
}
