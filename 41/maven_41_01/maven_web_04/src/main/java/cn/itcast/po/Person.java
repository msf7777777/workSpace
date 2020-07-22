package cn.itcast.po;

import lombok.*;

//@Setter
//@Getter
//@ToString
@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class Person {
    private String name;
    private int age;
    private String sex;

    //自己写的toString会覆盖掉lombok生成的代码
//    @Override
//    public String toString() {
//        return "Person{" +
//                "名字='" + name + '\'' +
//                ", 年龄=" + age +
//                ", 性别='" + sex + '\'' +
//                '}';
//    }
}