package cn.itcast.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @AllArgsConstructor 生成携带所有属性的构造方法, 满参构造
 * @NoArgsConstructor 生成不带任何属性的构造方法, 无参构造
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private String name;
    private int age;

}
