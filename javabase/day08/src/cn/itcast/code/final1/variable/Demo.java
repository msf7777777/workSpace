package cn.itcast.code.final1.variable;
/*
总结:
    final是修饰成员变量
        1.可以在定义的时候对成员赋值(推荐)
        2.我们可以在构造函数中对其赋值(不推荐)
            因为每一个构造函数中都需要对这个final修饰的成员变量赋值
    注意:
        final修饰成员变量, 变量名要求每个字母都大写, 多个单词之间用_隔开
 */
public class Demo {
    // 被final修饰的成员变量, 一般用public修饰,不会提供setter和getter方法
    // 成员变量被final修饰, 可以通过两种情况来赋值
    //1.在定义的时候就赋值(推荐) 2. 在所有的构造中都给final修饰变量赋值(不推荐)
    /*
        注意: 如果final修饰成员变量, 建议变量名全部字母大写,多个字母用_隔开
     */
    // 自定义常量
    public final int NUMBER ; // =0

    public Demo(){
        NUMBER = 20;
    }

    public Demo(int number){
        NUMBER = 30;
    }



}
