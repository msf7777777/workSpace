package cn.itcast.code.classdefine;

public class Phone {
    String brand;
    int price;
    String color;
    public void call(String name){
        System.out.println("给" + name + "打电话");
    }
    public void sendMassage(String name){
        System.out.println("给" + name + "发短信");
    }
}