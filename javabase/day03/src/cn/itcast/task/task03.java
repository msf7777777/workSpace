package cn.itcast.task;
/*
3. 分析以下需求，并用代码实现
    1.商场推出幸运抽奖活动，抽奖规则如下：
        (1)键盘录入四位数字(1000-9999的数字),作为顾客的会员卡号
        (2)该会员卡号(键盘录入的四位数字)各位数字之和大于20，则为幸运客户
    2.打印格式如下：
        请输入4位会员卡号：
        3569
        会员卡号3569各位之和为：23
        会员卡号3569是幸运客户

        请输入4位会员卡号：
        1234
        会员卡号3569各位之和：10
        会员卡号3569不是幸运客户
*/
import java.util.Scanner;
public class task03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1.录入会员卡号四位数卡号
        System.out.println("请输入会员的四位数卡号：");
        int id = sc.nextInt();
        //2.会员卡号的各位数字
        int ge = id % 10;
        int shi = id / 10 % 10;
        int bai = id / 100 % 10;
        int qian = id / 1000 % 10;
        //3.计算会员卡号四位数之和
        int sum = ge + shi + bai + qian;
        //4.判断会员是否心愿客户
        if(id < 1000 || id > 9999){
            System.out.println("fuck off");
        }else{
            if(sum > 20){
                System.out.println("会员卡号：" + id + "是幸运客户");
            }else{
                System.out.println("会员卡号：" + id + "不是幸运客户");
            }
        }
    }
}
