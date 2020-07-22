package cn.itcast.task.task01_05;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
题目三
	请在控制台以“xxxx年xx月xx日 xx时xx分xx秒”的格式打印当前系统时间。
 */
public class Test03 {
    public static void main(String[] args) {
        Date dateNow = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        String dateStr = dateFormat.format(dateNow);
        System.out.println(dateStr);
    }
}
