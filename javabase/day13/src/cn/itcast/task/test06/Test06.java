package cn.itcast.task.test06;

import java.util.HashSet;
import java.util.Set;

/*
6 题目
	请按以下要求顺序编码：
	定义学生类Student，属性：姓名、性别、年龄
	定义测试类，及main()方法
	定义一个存储Student类型的HashSet集合
	创建以下三个Student对象
		张三,男,20
		李四,女,21
		张三,男,20
	将上述三个对象存储到Set集合中
	使用增强for遍历集合，获取每个Student对象，并打印属性值；
	请实现集合中不能存储姓名年龄相同的元素
 */
public class Test06 {
    public static void main(String[] args) {
        Set<Student> student = new HashSet<>();
        student.add(new Student("麻少飞", '男', 29));
        student.add(new Student("张嘉敏", '女', 23));
        student.add(new Student("麻少飞", '男', 29));
        System.out.println("使用增强for遍历集合，获取每个Student对象，并打印属性值");
        for (Student s : student) {
            System.out.println(s);
        }
        System.out.println("集合中不能存储姓名年龄相同的元素是");
        System.out.println("HashSet 无序 无索引 无重复的特性");
    }
}
