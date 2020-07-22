package cn.itcast.task.test05;

import java.util.Objects;

/*
5 题目
	请编写main()方法，按以下要求顺序,定义一个Set集合，并存储以下数据：
	刘备，关羽，张飞，刘备，张飞
	打印集合大小
	使用迭代器遍历集合，并打印每个元素
	使用增强for遍历集合，并打印每个元素
 */
public class People {
    private String name;

    public People() {
    }

    public People(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        People people = (People) o;
        return Objects.equals(name, people.name);
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(name);
//    }

    @Override
    public String toString() {
        return "fuck2{" +
                "name='" + name + '\'' +
                '}';
    }
}
