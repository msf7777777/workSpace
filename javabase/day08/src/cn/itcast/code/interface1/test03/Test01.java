package cn.itcast.interface1.test03;
/*
    现在有狗, 猫, 青蛙,山羊 他们都有姓名和年龄属性, 而且都需要吃饭,吃的东西不尽相同
    狗和青蛙要求必须会游泳, 狗会狗刨, 青蛙会蛙泳
 */
public class Test01 {
    public static void main(String[] args) {
        Frog frog = new Frog();
        frog.eat();
        frog.swim();
        Cat cat = new Cat();
        cat.eat();
    }
}
