package cn.itcast.task;
/*
1. 定义手机类Phone, 属性和行为如下, 并在测试类PhoneTest中, 创建手机类的对象, 然后访问类中的成员.
	属性:
		品牌: brand
		价格: price
		颜色: color
	行为:
		打电话: call(String name)			//该方法接收一个"姓名"参数, 输出格式为:  给张三打电话...
		发短信: sendMessage(String name)	//该方法接收一个"姓名"参数, 输出格式为:  给张三发短信...
 */
public class Phone {
    //构造函数
    public Phone() {
    }
    //属性
    private String brand;
    private int price;
    private String color;
    //行为1:打电话
    public void call(String name){
        System.out.println("给" + name + "打电话");
    }
    //行为2:打电话
    public void sendMessage(String name){
        System.out.println("给" + name + "发讯息");
    }
    //有参函数
    public Phone(String brand, int price, String color) {
        this.brand = brand;
        this.price = price;
        this.color = color;
    }
    //提供Getter and Setter方法
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }


}
