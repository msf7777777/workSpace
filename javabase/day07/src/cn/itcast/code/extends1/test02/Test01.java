package cn.itcast.code.extends1.test02;
/*

1. 学生类
   属性:姓名,年龄
   行为:吃饭,睡觉
2. 老师类
   属性:姓名,年龄，薪水
   行为:吃饭,睡觉，教书
3. 班主任
   属性:姓名,年龄，薪水
   行为:吃饭,睡觉，管理

   共性（Person）
      属性 :姓名,年龄
      行为 ：吃饭,睡觉

 */

import java.util.logging.Level;
/*
    总结:
        继承的格式:
            public class 子类名 extends 父类名{
            }
         继承后的特点:
            子类: 可以使用自己的, 还可以使用父类非私有的东西
            父类: 父类只能用自己的,不能使用子类
         注意事项:
            1.子类只能直接继承一个父类, 因为如果一旦有两个父类的话, 出现相同的内容,jvm会蒙圈
            2.java中虽然不支持多继承,但是支持多层继承
        优点:
            1.提高了代码的复用性
                父类中定义的内容,子类可以不用定义
            2.提高了代码的维护性
                只要在父类中做了功能修改添加, 所有的子类都会受到影响
            3. 多态的前提
        缺点:
            让类和类的关系比较紧密, 耦合度增强了, 让类和类的独立性变弱了
            开发过程: 建议大家代码 高内聚,低耦合

 */
public class Test01 {

    public static void main(String[] args) {
        Student student = new Student();
        student.eat();
        Teacher teacher = new Teacher();
        teacher.teach(); // teach自己的
        teacher.eat(); // eat是从Person中继承下来的
        teacher.setName("梅军建"); //setName从Person中继承下来的
        Leader leader = new Leader();
        leader.manage();// Leader的自己的方法
        leader.eat();// 从person中继承下来的
        leader.sleep();//从person中继承下来的
    }
}
