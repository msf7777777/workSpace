package cn.itcast.task;
/*
4. 键盘录入小明左右手牌的点数, 并接收, 编写代码实现交换小明手中的牌, 并打印结果.
    尽可能多的用多种思路实现.
    格式如下:
        请输入小明左手中的纸牌：
        10
        请输入小明右手中的纸牌：
        8

        互换前小明手中的纸牌：
        左手中的纸牌：10
        右手中的纸牌：8

        互换后小明手中的纸牌：
        左手中的纸牌：8
        右手中的纸牌：10
*/
import java.util.Scanner;
public class task04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1.录入小明手中的纸牌的点数
        System.out.println("请输入小明左手中的纸牌：");
        int left = sc.nextInt();
        System.out.println("请输入小明右手中的纸牌：");
        int right = sc.nextInt();
        //2.1.互换后小明手中的纸牌
        int huan = right;
        right = left;
        left = huan;
        if(left > 13 || left < 1){
            System.out.println("fuck off");
        }else if(right > 13 || right < 1){
            System.out.println("fuck off");
        }else{
            System.out.println("换牌后，小明左手中纸牌的点数是：" + left + ";手中纸牌的点数是：" + right);
        }

    }
}
