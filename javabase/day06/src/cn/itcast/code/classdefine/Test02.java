package cn.itcast.code.classdefine;

public class Test02 {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        phone1.brand = "小米9";
        phone1.color = "白色";
        phone1.price = 1999;
        System.out.println(phone1.brand);
        System.out.println(phone1.color);
        System.out.println(phone1.price);
        phone1.call(" 张嘉敏 ");
        phone1.sendMassage(" 麻少飞 ");
    }
}