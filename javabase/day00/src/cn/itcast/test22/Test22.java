package cn.itcast.test22;

import java.util.ArrayList;
import java.util.Iterator;

/*
22、1. 定义一个电脑类Computer，包含属性：

    brand(品牌): String类型

    price(价格): double类型

      size (尺寸): String类型

    2. 创建一个ArrayList集合对象list，集合内元素类型为Computer，
    实例化3个Computer对象，
    3个对象的属性分别为：”Apple”,11980, “13寸”;
                        ”Dell” ,5200,”15.5寸”;
                        ”Acer” 4999，”15寸”;
    将3个对象添加到list集合中，并使用for循环遍历集合，将集合中price属性大于5000.0的元素的所有属性在控制台打印出来。

打印示例：
 */
public class Test22 {
    public static void main(String[] args) {

        ArrayList<Computer> list = new ArrayList();
        Computer apple = new Computer("Apple", 11980, "13寸");
        Computer dell = new Computer("Dell", 5200, "15.5寸");
        Computer Acer = new Computer("Acer", 4999, "15寸");
        list.add(apple);
        list.add(dell);
        list.add(Acer);
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getPrice() > 5000){
                System.out.println(list);
            }
        }

    }
}
