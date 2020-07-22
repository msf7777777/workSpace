package cn.itcast.code.list;

import java.util.ArrayList;
import java.util.List;

public class Test2 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(10);
        list.add(15);
        //将<10的数全部删除
        for (int i = 0; i < list.size(); i++) {
            Integer number = list.get(i);
            if(number < 10){
                list.remove(i);
                //一旦删除一个以后, 我们应该让索引在回退一下,这样不会出现漏删的情况
                i--;
            }
        }
        System.out.println(list);

    }
}
