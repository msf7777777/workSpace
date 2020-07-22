package cn.itcast.code.object;

public class Test2 {
    /*
        == 如果是基本数据类型,比较的是数值
        == 如果是引用数据类型, 则比较地址值
        总结:
            Object的equals方法默认使用是 ==比较的
            如果想要比较内容就需要子类重写这个方法
        alt + insert + equals & hashcode
        使用场景:
            当我们比较内容而不是比较地址的时候需要重写equals
     */
    public static void main(String[] args) {
        Student student1 = new Student("林青霞",18);
        Student student2 = new Student("林青霞",18);
        System.out.println(student1 == student2);
        //开发过程中, 很多情况, 属性只要是一样的, 就希望是一样的???
        boolean equals = student1.equals(student2);
        System.out.println(equals);
    }
}
