package cn.itcast.task.task06;
/*
六.按照要求完成以下内容：
1. 定义游戏类别的抽象类(Game)，包含空参、满参构造和以下成员变量
        游戏类型type （String类型）
        游戏名称name (String类型)
        生成所有成员变量set/get方法
        抽象方法：? void play()
2. 定义手游类（MobileGame) 继承 Game，包含空参、满参构造
        定义私有方法:void efforts() 要求输出：“晚上不睡觉玩 XXX”
        定义私有方法：void damage() 要求输出：“导致白天上课困，毕业后找不到工作”
        实现抽象方法：
        void play()? 输出格式: “名称为XXX的YYY类游戏非常流行。”
        定义方法:void prepare(),依次调用efforts(),damage()? ? ? ?
        Ps:XXX为变量name的值，YYY为type的值
3. 测试类Test，提供main方法
        创建类型为“竞技”，名称为“王者荣耀”的手游类(MobileGame)对象 ，???实现要求：依次调用play方法和prepare方法。;
示例如下：
	名称为王者荣耀的竞技游戏非常流行
	晚上不睡觉玩王者荣耀
	导致白天上课困,毕业后找不到工作
 */
public class Test {
    public static void main(String[] args) {
        //1.创建对象
        MobileGame fuckingGame = new MobileGame("色情恐怖", "亡者容耀");

        //2.实现方法
        fuckingGame.play();
        MobileGame.efforts();
        MobileGame.damage();
        fuckingGame.prepare();
    }
}
