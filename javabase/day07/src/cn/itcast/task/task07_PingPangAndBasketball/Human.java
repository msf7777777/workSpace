package cn.itcast.task.task07_PingPangAndBasketball;
/*
7.已知有乒乓球运动员(PingPangPlayer)和篮球运动员(BasketballPlayer),
      乒乓球教练(PingPangCoach)和篮球教练(BasketballCoach).
          他们都有姓名和年龄, 都要吃饭, 但是吃的东西不同.
          乒乓球教练教如何发球, 篮球教练教如何运球和投篮.
          乒乓球运动员学习如何发球, 篮球运动员学习如何运球和投篮.
          请用所学, 模拟该知识.
 */
public abstract class Human {
    //1.定义共同属性(姓名、年龄)
    private String name;
    private int age;

    //2.定义抽象方法(吃饭)
    public abstract void eat();

    //3.构造无参&有参函数
    public Human() {
    }
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //4.给属性提供Getter and Setter方法
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
}
