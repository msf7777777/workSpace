package cn.itcast.task.task01;

//一.简答

public class QAndA {
    public static void main(String[] args) {
        System.out.println("1.1 请用一句话描述出用代码怎样实现“多态”？");
        System.out.println("创建子类Cat继承父类Animal的eat方法并重写\n"
                         + "Animal animaCat = new Cat();\n"
                         + "animaCat.eat();");

        System.out.println("1.2 请写出多态的好处和弊端；");
        System.out.println("好处:更好的实现子类继承父类的抽象方法");
        System.out.println("坏处:子类独有的没有继承父类的方法,需要向下转型才能使用或输出");

        System.out.println("1.3 请写出多态的向下转型的意义。");
        System.out.println("调用子类独有父类却没有的方法时需要向下转型,否则父类没有子类的方法,则报错");

        System.out.println("3.1 请问有几种形式的内部类?");
        System.out.println("成员内部类:类中方法外的");
        System.out.println("匿名内部类:快速创建父类对象实现方法");

        System.out.println("3.2 请问内部类会被编译成class文件吗？");
        System.out.println("会,会生成地址");

        System.out.println("3.3-3.6");
        System.out.println("老师,太乱了,  后面的题看文件夹吧!");
        System.out.println("例如: 3.3题 就是 QAndA_3_3 文件夹");

        System.out.println("5.1 请按从大到小的顺序写出四种访问权限修饰符。");
        System.out.println("public,protected,(空),private");

        System.out.println("5.2 请问修饰“类”可以使用什么权限修饰符？");
        System.out.println("外部类 : public,(空)");
        System.out.println("内部类 : public,protected,(空),private");

        System.out.println("5.3 请问修饰“成员属性”可以使用什么权限修饰符？");
        System.out.println("public,protected,(空),private");

        System.out.println("5.4 请问构造方法可以使用什么权限修饰符？");
        System.out.println("public,protected,(空),private");
    }
}
