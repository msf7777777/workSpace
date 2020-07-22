package cn.itcast.code.duotai.test01;
/*
    总结:
        格式:
            父类引用(父接口) 变量名 = new 子类|实现类();
        前提:
            必须有继承或者实现关系
        技巧:
            类似我们之前所学习的隐式类型转换, 大数据类型可以接受小数据类型
 */
public class Test1 {

    public static void main(String[] args) {
        //创建动物对象
        Animal animal = new Animal();
        Cat cat = new Cat();
        //多态的写法 ----> 父类引用指向子类对象 , 前提必须是有继承或者实现关系
        Animal animal1 = new Cat();
        //因为这个表达式中既有父类也有子类, 如果说不冲突还好, 如果冲突了
        // 成员变量 ---> 如果冲突, 直接使用属性的话, 使用的是父类的属性
        System.out.println(animal1.num);

        //成员方法 ---> 多态中如果子父类中出现了相同的方法, 执行子类的
        animal1.method();



    }
}
