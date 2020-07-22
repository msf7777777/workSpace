package cn.itcast.task.homework.test05;
/*
    五：分析以下需求,并用代码实现
    (1)人类:
        a.属性:姓名,身高
    (2)男朋友类:
        a.属性:姓名,身高
        b.行为:挣钱(输出语句模拟),逛街(和女朋友一块逛街,用上女朋友类)
    (3)女朋友类:
        a.属性:姓名,身高
        b.行为:做饭,洗衣服(洗某一件衣服,用上衣服类)
    (4)衣服类:
        a.属性:品牌,颜色
    (5)测试类:
        a.利用多态的形式创建女朋友对象,为姓名,身高赋值
            调用做饭和洗衣服方法
        b.利用多态的形式创建男朋友对象,为姓名,身高赋值
            调用挣钱和逛街方法

 */
public class Test1 {

    public static void main(String[] args) {
        GirlFreind girlFreind = new GirlFreind("林青霞",172);
        BoyFreind boyFreind = new BoyFreind("梅军建",180);
        Cloth cloth = new Cloth("海澜之家","红");
        boyFreind.makeMoney();
        boyFreind.shopping(girlFreind);

        girlFreind.cook();
        girlFreind.wash(cloth);

    }
}
