package cn.itcast.task;
/*
已知: 红茶妹妹有21元钱，她攒了几天钱之后自己的钱比原来的两倍还多三块。
茶妹妹有24元钱，她攒了几天钱之后自己的钱正好是原来的两倍。
断红茶妹妹和绿茶妹妹的钱是否一致, 并打印结果.

提示:
    1. 定义红茶妹妹原来的钱为整数变量
    2. 定义绿茶妹妹原来的钱为整数变量
    3. 使用赋值运算符和算术运算符计算其现有的钱
    4. 使用比较运算符对数值做出比较
*/
public class task01 {
    public static void main(String[] args) {
        int redMoney = 21;
        int greenMoney = 24;
        int redMoneyNow = redMoney * 2 + 3;
        int greenMoneyNow = greenMoney * 2;
        if(redMoneyNow == greenMoneyNow){
            System.out.println("红茶妹妹和绿茶妹妹的钱 【一致】");
        }else{
            System.out.println("红茶妹妹和绿茶妹妹的钱 【不一致】");
        }
    }
}
