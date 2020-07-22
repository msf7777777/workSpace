package cn.itcast.test;

import cn.itcast.pojo.User;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class JSONTest {

    // 1 创建核心对象
    ObjectMapper mapper = new ObjectMapper();

    @Test
    public void demo01() throws Exception {
        // 目标: 将java对象转成json字符串
        // 2 调用api实现
        User user = new User("张三", 13);
        String jsonStr = mapper.writeValueAsString(user);
        System.out.println(jsonStr);

        // 目标2: 将json字符串转成 java对象
        User user2 = mapper.readValue(jsonStr, User.class);
        System.out.println("user2 = " + user2);
    }

    @Test
    public void demo02() throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("最佳女明星", "迪丽热巴");
        map.put("最佳男明星", "古天乐");

        // 目标: 将java对象转成json字符串
        String jsonStr = mapper.writeValueAsString(map);
        System.out.println("jsonStr = " + jsonStr);

        // 目标2: 将json字符串转成 java对象
        HashMap hashMap2 = mapper.readValue(jsonStr, HashMap.class);
        System.out.println("hashMap2 = " + hashMap2);
    }

    @Test
    public void demo03() throws Exception {
        HashMap<String, User> map = new HashMap<>();
        map.put("最佳女明星", new User("迪丽热巴", 22));
        map.put("最佳男明星", new User("古天乐", 35));

        // 目标: 将java对象转成json字符串
        String jsonStr = mapper.writeValueAsString(map);
        System.out.println("jsonStr = " + jsonStr);

        // 目标2: 将json字符串转成 java对象
        /*
        HashMap hashMap2 = mapper.readValue(jsonStr, HashMap.class);
        System.out.println("hashMap2 === " + hashMap2);
        System.out.println("hashMap2.最佳女明星 === " + hashMap2.get("最佳女明星"));
        */

        HashMap<String, User> hashMap2 = mapper.readValue(jsonStr, new TypeReference<HashMap<String, User>>() {});
        User user2 = hashMap2.get("最佳女明星");
        System.out.println(user2);
    }

    @Test
    public void demo04() throws Exception {
        List<String> list = new ArrayList<>();
        list.add("迪丽热巴");
        list.add("古力娜扎");

        // 目标: 将java对象转成json字符串
        String jsonStr = mapper.writeValueAsString(list);
        System.out.println("jsonStr = " + jsonStr);

        // 目标2: 将json字符串转成 java对象
        List list1 = mapper.readValue(jsonStr, List.class);
        System.out.println("list1 = " + list1);
    }

    @Test
    public void demo05() throws Exception {
        List<User> list = new ArrayList<>();
        list.add(new User("迪丽热巴", 23));
        list.add(new User("古力娜扎", 20));

        // 目标: 将java对象转成json字符串
        String jsonStr = mapper.writeValueAsString(list);
        System.out.println("jsonStr = " + jsonStr);

        // 目标2: 将json字符串转成 java对象
        List<User> list2 = mapper.readValue(jsonStr, new TypeReference<List<User>>(){});
        System.out.println("list2 ==== " + list2);
    }


}
