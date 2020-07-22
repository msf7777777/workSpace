package cn.itcast.task;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/*
1.请按以下要求顺序编码：
 定义一个：键Integer，值String类型的HashMap集合
 存储以下数据：
	1，"张三"
	2，"李四"
	1，"王五"
 (1)打印集合大小；
 (2)使用“键找值”的方式遍历集合，打印键和值；
 (3)使用“键值对”的方式遍历集合，打印键和值；
 (4)获取键为1的值，并打印
 (5)获取键为10的值，并打印
 (6)判断集合中是否有键：10
 (7)删除键为1的键值对，删除完毕打印集合
 */
public class Test01 {
    public static void main(String[] args) {
        //定义一个：键Integer，值String类型的HashMap集合
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "麻少飞");
        hm.put(2, "张嘉敏");
        hm.put(1, "韩卓君");
        //1.打印集合大小
        System.out.println("打印集合大小");
        System.out.println(hm);

        //2.使用“键找值”的方式遍历集合，打印键和值
        Set<Integer> key = hm.keySet();
        System.out.println("“键找值”遍历");
        for (Integer keyIt : key) {
            String name = hm.get(keyIt);
            System.out.println(keyIt + " : " + name);
        }

        //3.使用“键对值”的方式遍历集合，打印键和值
        Set<Map.Entry<Integer, String>> entries = hm.entrySet();
        System.out.println("“键对值”遍历");
        for (Map.Entry<Integer, String> entry : entries) {
            Integer key1 = entry.getKey();
            String name = entry.getValue();
            System.out.println(key1 + ":" + name);

        }
        //4.获取键为1的值，并打印
        String key1Name = hm.get(1);
        System.out.println("获取键为1的值，并打印");
        System.out.println(key1Name);
        //5.获取键为10的值，并打印
        String key10Name = hm.get(10);
        System.out.println("获取键为10的值，并打印");
        System.out.println(key10Name);
        //6.判断集合中是否有键：10
        boolean bl = hm.containsKey(10);
        System.out.println("判断集合中是否有键：10");
        System.out.println(bl);
        //7.删除键为1的键值对，删除完毕打印集合
        String nameKey1 = hm.remove(1);
        System.out.println("删除键为1的键值对，删除完毕打印集合");
        System.out.println(hm);
    }
}
