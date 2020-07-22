package cn.itcast.task.task07_PingPangAndBasketball;
/*
7.已知有乒乓球运动员(PingPangPlayer)和篮球运动员(BasketballPlayer),
      乒乓球教练(PingPangCoach)和篮球教练(BasketballCoach).
          他们都有姓名和年龄, 都要吃饭, 但是吃的东西不同.
          乒乓球教练教如何发球, 篮球教练教如何运球和投篮.
          乒乓球运动员学习如何发球, 篮球运动员学习如何运球和投篮.
          请用所学, 模拟该知识.
 */
public class PingPangPlayer extends Player {
    //1.继承父类抽象方法并定义
    @Override//超类Human,父类Player
    public void eat() {
        System.out.println("我是乒乓球运动员" + getName() + ",我每天吃乒乓球.");
    }

    @Override//父类Player
    public void train() {
        System.out.println(getAge() + "岁的我学习如何发球.");
    }

    //2.构造无参&有参函数
    public PingPangPlayer() {
    }
    public PingPangPlayer(String name, int age) {

        super(name, age);
    }
}
