package cn.itcast.code.generator.selfgenerator;

import java.util.ArrayList;
import java.util.Collection;

public class Test4 {

    public static void main(String[] args) {
        Collection<Ye> con1= new ArrayList<>();
        Collection<Fu> con2= new ArrayList<>();
        Collection<Zi> con3= new ArrayList<>();
        method(con1);
        method(con2);
       //method(con3); 泛型被限定为 只能是fu以及其父类

       // method1(con1);// 泛型被限定为 只能是fu以及子类
        method1(con2);
        method1(con3);
    }
    /*
        定义方法, 限定泛型只能是Fu以及其父类才可以
     */
    public static void method(Collection<? super Fu > con){

    }


    /*
      定义方法, 限定泛型只能是Fu以及子类才可以
   */
    public static void method1(Collection<? extends Fu > con){

    }
}
