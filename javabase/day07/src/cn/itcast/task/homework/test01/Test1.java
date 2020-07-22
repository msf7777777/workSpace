package cn.itcast.task.homework.test01;
/*

1. 定义手机类Phone, 属性和行为如下, 并在测试类PhoneTest中, 创建手机类的对象, 然后访问类中的成员.
	属性:
		品牌: brand
		价格: price
		颜色: color
	行为:
		打电话: call(String name)			//该方法接收一个"姓名"参数, 输出格式为:  给张三打电话...
		发短信: sendMessage(String name)
 */
public class Test1 {
    public static void main(String[] args) {
      /*  //  brand---> 8个brand的变量
       String[] arr = {"小米","小米","小米","小米","小米","小米","小米","小米"};

        // price --->  8个price的变量
        int[] price = {};
        // color--->  8个color的变量
        String[] color = {};*/

        Phone[] arr = {
                new Phone("xiaomi",1999,"红色"),
                new Phone("xiaomi",1999,"红色"),
                new Phone("xiaomi",1999,"红色"),
                new Phone("xiaomi",1999,"红色"),
                new Phone("xiaomi",1999,"红色"),
                new Phone("xiaomi",1999,"红色"),
                new Phone("xiaomi",1999,"红色"),
                new Phone("xiaomi",1999,"红色"),
            };

    }
}
