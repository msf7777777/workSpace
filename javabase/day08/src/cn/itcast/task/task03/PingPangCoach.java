package cn.itcast.task.task03;
/*
三. 已知有乒乓球运动员(PingPangPlayer)和篮球运动员(BasketballPlayer),
          乒乓球教练(PingPangCoach)和篮球教练(BasketballCoach).
   他们都有姓名和年龄, 都要吃饭, 但是吃的东西不同.
   乒乓球教练教如何发球, 篮球教练教如何运球和投篮.
   乒乓球运动员学习如何发球, 篮球运动员学习如何运球和投篮.
   为了出国交流, 跟乒乓球相关的人员都需要学习英语.
   请用所学, 模拟该知识.
 */
public class PingPangCoach extends Coach implements LearnEnglishForPingPang{
    //1.重写从父类继承来的抽象方法eat & teach
    @Override
    public void eat() {
        System.out.println(getAge() + "岁,名字叫" + getName() + "的乒乓球教练吃乒乓球运动员吃剩的乒乓球");
    }

    @Override
    public void teach() {
        System.out.println("乒乓球教练教如何发球");
    }

    //2.重写从接口继承来的抽象方法LearnEnglishForPingPang
    @Override
    public void learnEnglishForPingPang() {
        System.out.println("为了出国交流, 乒乓球教练" + getName() + "都需要学习英语.");
    }

    //3.构造无参&有参函数
    public PingPangCoach() {
    }
    public PingPangCoach(String name, int age) {
        super(name, age);
    }
}
