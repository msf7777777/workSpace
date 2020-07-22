package cn.itcast.code.generator.selfgenerator;

import java.util.ArrayList;
import java.util.Collection;

public class Test3 {

    public static void main(String[] args) {
        Collection<Integer> con1 = new ArrayList<>();
        Collection<String> con2 = new ArrayList<>();
        method(con1);
        method(con2);

    }
    //既能接受 String类型, 还能接受Integer类型的集合
    //1. 使用泛型通配符? 代表的是没有限定
    //2. 不规定泛型, 根据参数的变化而变化
    public static void method(Collection con){

    }
}
