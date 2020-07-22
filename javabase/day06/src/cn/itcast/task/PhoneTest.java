package cn.itcast.task;
/*
1. 定义手机类Phone, 属性和行为如下, 并在测试类PhoneTest中, 创建手机类的对象, 然后访问类中的成员.
	属性:
		品牌: brand
		价格: price
		颜色: color
	行为:
		打电话: call(String name)		//该方法接收一个"姓名"参数, 输出格式为:  给张三打电话...
		发短信: sendMessage(String name)	//该方法接收一个"姓名"参数, 输出格式为:  给张三发短信...
 */
public class PhoneTest {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.setBrand("红红红米");
        phone.setPrice(19);
        phone.setColor("奥利给色");
        System.out.println(phone.getColor() + phone.getBrand() + "手机现在只要" + phone.getPrice() + "分钱");
        phone.call("雷军");
        phone.sendMessage("不接电话的雷军");
    }
}
