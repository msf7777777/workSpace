package cn.itcast.code.set.hashmap;

import java.util.HashMap;
import java.util.Set;

public class Test03 {
    /*
        总结:步骤
            1.通过Map的keySet()方法得到所有键的Set集合
            2.遍历所有键的Set集合获取一个个键
            3.通过Map的get方法获取其对应的值
     */
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("林青霞", "梅军建");
        hashMap.put("虚竹", "西夏公主");
        hashMap.put("豆腐妹", "梅军建");
        hashMap.put("小隆女", "尹志平");
        hashMap.put("令狐冲", "东方菇凉");
        hashMap.put("贾宝玉", "林黛玉");

        //遍历Map集合 ----> Set<K>  keySet();
        Set<String> keys = hashMap.keySet();
        System.out.println(keys);
        // 得到所有的键, 可以遍历所有的键, 通过键找值
        for (String key : keys) {
            // 通过get方法得到键对应的值
            String value = hashMap.get(key);
            System.out.println(key+"::"+ value);
        }

        System.out.println(hashMap);
    }
}
