package cn.itcast.task.task04;
/*
创建Dog（狗）类，要求：
            继承Animal（动物）类，实现speak方法，在方法内打印“X说：Y”，其中X为狗的名字，Y为当前方法的参数。
            完成满参构造。
            实现Sports接口，实现swimming方法，在方法内打印：XXX狗刨中！其中，X为狗的名字。
            创建成员方法：goPlay()，在方法内依次调用speak(String str)方法和swimming ()方法。其中speak方法的参数自行创建。
 */
public class Dog extends Animal implements Sports {
    //1.重写父类方法speak
    @Override
    public void speak(String str) {
        System.out.println(getName() + "说:Goodbye World!");
    }

    //2.重写接口方法swimming
    @Override
    public void swimming() {
        System.out.println(getName() + "狗刨中！");
    }

    //3.构造有参函数
    public Dog(String name, String type) {
        super(name, type);
    }

    //4.创建成员方法
    public void goPlay(){
        speak(getName() + "Goodbye World!");
        swimming();
    }
}
