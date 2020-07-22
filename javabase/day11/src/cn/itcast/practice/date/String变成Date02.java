package cn.itcast.practice.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class String变成Date02 {
    String canadaTime = "2020-03-01 16:00:00";
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
    Date chinaDate = sdf.parse(canadaTime);
//    long chinaTime = chinaDate


    public String变成Date02() throws ParseException {
    }
}
