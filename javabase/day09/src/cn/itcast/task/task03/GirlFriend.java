package cn.itcast.task.task03;
/*
(3)女朋友类:
        a.属性:姓名,身高
        b.行为:做饭,洗衣服(洗某一件衣服,用上衣服类)
 */
public class GirlFriend extends Human {
    //1.定义独有方法
    public void cook(){
        System.out.println(getName() + " 是女朋友,做饭给男朋友吃");
    }
    public void wash(Clothes clothes){
        System.out.println(getName() + " 是女朋友,给男朋友洗 " + clothes.getBrand() + " 牌子 " + clothes.getColor() +" 色号的衣服");
    }

    //2.构造无参&有参函数
    public GirlFriend() {
    }
    public GirlFriend(String name, int height) {
        super(name, height);
    }
}
