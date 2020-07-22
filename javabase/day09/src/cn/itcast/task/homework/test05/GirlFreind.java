package cn.itcast.task.homework.test05;
/*(3)女朋友类:
        a.属性:姓名,身高
        b.行为:做饭,洗衣服(洗某一件衣服,用上衣服类)*/
public class GirlFreind extends Person {

    public GirlFreind() {
    }

    public GirlFreind(String name, int height) {
        super(name, height);
    }

    public void cook(){
        System.out.println(getName()+"正在做饭");
    }
    //停工, 衣服类没写好
    public void wash(String brand ,String color){// "海澜之家" , "绿"

        System.out.println(getName()+"正在洗"+brand+"牌子的"+color+"颜色的衣服");
    }

    public void wash(Cloth cloth){//Cloth cloth = new Cloth(); // 地址值

        System.out.println(getName()+"正在洗"+cloth.getBrand()+"牌子的"+cloth.getColor()+"颜色的衣服");
    }


}
