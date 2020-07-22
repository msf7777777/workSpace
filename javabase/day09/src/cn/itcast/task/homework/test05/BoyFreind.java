package cn.itcast.task.homework.test05;
/*(2)男朋友类:
        a.属性:姓名,身高
        b.行为:挣钱(输出语句模拟),逛街(和女朋友一块逛街,用上女朋友类)*/
public class BoyFreind extends Person {

    public BoyFreind() {
    }

    public BoyFreind(String name, int height) {
        super(name, height);
    }

    public void makeMoney(){
        System.out.println(getName()+"正在努力赚钱");
    }
    // 停工, 女朋友类没写完
    public void shopping(String girlName,int height){
        System.out.println(getName()+"拉着"+height+"的"+girlName+"的女朋友逛街");

    }
    public void shopping(GirlFreind girlFreind){
        System.out.println(getName()+"拉着"+girlFreind.getHeight()+"的"+girlFreind.getName()+"的女朋友逛街");

    }

    public void shopping(){
        GirlFreind girlFreind = new GirlFreind("林青霞",170);//不推荐
        System.out.println(getName()+"拉着"+girlFreind.getHeight()+"的"+girlFreind.getName()+"的女朋友逛街");

    }


}
