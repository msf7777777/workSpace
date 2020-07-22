package cn.itcast.static1;
/*
    知识点:
        被静态static修饰的东西:
            随着类的加载而加载, 存储在方法区中, 被所有的对象所共享的东西,不在属于对象,
            而是属于整个类
     总结:
         静态修饰成员变量
         特点: 被所有的对象所共享, 建议使用类名.调用
     使用场景:
        当你的属性要被所有的对象共享的时候才会使用static来修饰成员变量
 */
public class ChinesePerson {

    private String name;
    private int age;
    // 我们发现nationality是属于所有ChinesePerson对象的东西,我们可以用static来修饰
    public static String nationality;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public ChinesePerson(String name, int age) {
        this.name = name;
        this.age = age;

    }
    public ChinesePerson(String name, int age,String nationality) {
        this.name = name;
        this.age = age;
        this.nationality = nationality;

    }

    public ChinesePerson() {
    }
}
