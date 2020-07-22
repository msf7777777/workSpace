package cn.itcast.code.classdefine;

public class Test04 {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        Phone phone2 = phone1;
        phone2.color = "黑色";
        phone2.brand = "锤子";
        phone2.price = 4000;
        System.out.println(phone1.brand + "," + phone1.color + "," + phone1.price);
    }
}