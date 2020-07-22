package cn.itcast.practice.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class String变成Date01 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        //将当前的时间转换为好看的字符串
        String str = sdf.format(new Date());
        Date date = sdf.parse(str);
        System.out.println(date);
    }
}
