package cn.itcast.rondom;
//1.导入random

import javax.swing.*;
import java.util.Random;

public class RandomDemo1 {
    public static void main(String[] args) {
        //2.创建random对象
        Random random = new Random();
        //3.
        int number = random.nextInt(6) + 100;
    }
}