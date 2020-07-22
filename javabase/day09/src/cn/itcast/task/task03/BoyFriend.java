package cn.itcast.task.task03;
/*
(2)男朋友类:
        a.属性:姓名,身高
        b.行为:挣钱(输出语句模拟),逛街(和女朋友一块逛街,用上女朋友类)
 */
public class BoyFriend extends Human {
    //1.定义独有方法
    public void makeMoney(){
        System.out.println(getName() + " 是男朋友,挣钱给女朋友花");
    }
    public void shopping(GirlFriend girlFriend){
        System.out.println(getName() + " 是男朋友经常和女朋友 " + girlFriend.getName() + " 逛街");
    }

    //2.构造无参&有参函数
    public BoyFriend() {
    }
    public BoyFriend(String name, int height) {
        super(name, height);
    }

}
