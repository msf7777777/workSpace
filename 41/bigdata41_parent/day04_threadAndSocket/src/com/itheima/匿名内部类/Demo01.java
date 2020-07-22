package com.itheima.匿名内部类;

public class Demo01 {
    public static void main(String[] args) {

        Person student1 = new Student(); //多态的体现
        student1.eat();

        // 假如说 这个student中这个eat方法, 在整个项目中只需要调用一次即可, 后续在也不使用了,
        // 如果我们采用当下这种操作.需要先为其建立一个实现类,然后重写其方法, 创建其对象, 调用此方法 (整体是比较繁琐的)

        // 这个时候, 其实可以使用 匿名内部类来解决即可
        new Person(){

            @Override
            public void eat() {
                System.out.println("学生要吃饭");
            }
        }.eat();

    }
}
