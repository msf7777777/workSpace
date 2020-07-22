package cn.itcast.code.set.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test04 {

    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("林青霞", "梅军建");
        hashMap.put("虚竹", "西夏公主");
        hashMap.put("豆腐妹", "梅军建");
        hashMap.put("小隆女", "尹志平");
        hashMap.put("令狐冲", "东方菇凉");
        hashMap.put("贾宝玉", "林黛玉");

        //遍历map集合---->采用entrySet的方式来去做
        Set<Map.Entry<String, String>> entries = hashMap.entrySet();
        //遍历所有的entry
        for (Map.Entry<String, String> entry : entries) {//entry = new Node<K,V>();
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key +"::"+ value);
        }
    }
}
