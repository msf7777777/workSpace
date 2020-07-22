package cn.itcast.code.set.hashmap;

import java.util.HashMap;

/*
 - `public V put(K key, V value)`:  把指定的键与指定的值添加到Map集合中。
- `public V remove(Object key)`: 把指定的键 所对应的键值对元素 在Map集合中删除，返回被删除元素的值。
- `public V get(Object key)` 根据指定的键，在Map集合中获取对应的值。


- `public Set<K> keySet()`: 获取Map集合中所有的键，存储到Set集合中。
- `public Set<Map.Entry<K,V>> entrySet()`: 获取到Map集合中所有的键值对对象的集合(Set集合)。
- `public boolean containKey(Object key)`:判断该集合中是否有此键。
 */
public class Test01 {

    public static void main(String[] args) {
        //1.创建map集合对象
        HashMap<String,String> hashMap = new HashMap<>();

        //2.向集合中添加数据
        // - `public V put(K key, V value)`:  把指定的键与指定的值添加到Map集合中。
        /*
                注意:
                    1.将键值对存入集合, 如果键存在,则替换原来的值
                    2.将键值对存入集合,返回键原先键所对应的值,如果这个键是第一次存储返回null
         */
        String put = hashMap.put("林青霞", "梅军建");
        System.out.println(put);
        hashMap.put("王祖贤", "梅军建");
        hashMap.put("豆腐妹", "梅军建");
        String put1 = hashMap.put(new String("豆腐妹"), "豆腐渣");


        System.out.println(put1);
        System.out.println("---------------");

        //- `public V remove(Object key)`: 把指定的键 所对应的键值对元素 在Map集合中删除，返回被删除元素的值。
        String name = hashMap.remove("王祖贤");
        System.out.println(name);
        System.out.println(hashMap);
        //- `public V get(Object key)` 根据指定的键，在Map集合中获取对应的值。
        String boyFreinds = hashMap.get("林青霞");
        System.out.println(boyFreinds);


    }
}
