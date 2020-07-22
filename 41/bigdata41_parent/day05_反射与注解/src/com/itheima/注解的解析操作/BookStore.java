package com.itheima.注解的解析操作;
// 在类和成员方法上使用Book注解
@Book(value = "<<斗破苍穹>>",price = 200,authors = {"萧薰儿","萧炎","药老"})
public class BookStore {

    @Book(value = "西游记",price = 588  ,authors = {"孙悟空","唐僧","猪八戒"})
    public void read(String name) {

        System.out.println("张三习惯读"+name);
    }
}
