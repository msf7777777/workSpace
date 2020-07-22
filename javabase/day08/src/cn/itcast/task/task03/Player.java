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
public abstract class Player extends Human {
    //1.重写从父类继承来的抽象方法eat并继续抽象
    @Override
    public abstract void eat();

    //2.定义运动员独有方法study
    public abstract void study();

    //3.构造无参&有参函数
    public Player() {
    }
    public Player(String name, int age) {
        super(name, age);
    }
}
