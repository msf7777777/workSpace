package cn.itcast.code.classdefine;

public class Test03 {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        Phone phone2 = new Phone();
        phone1.brand = "小米9"; phone2.brand = "华为mate8";
        phone1.color = "白色"; phone2.color = "黑色";
        phone1.price = 1999; phone2.price = 3500;
        System.out.println(phone1.brand + "," + phone1.color + "," + phone1.price);
        System.out.println(phone2.brand + "," + phone2.color + "," + phone2.price);
        phone1.call(" 张嘉敏 ");
        phone2.sendMassage(" 麻少飞 ");
    }
}