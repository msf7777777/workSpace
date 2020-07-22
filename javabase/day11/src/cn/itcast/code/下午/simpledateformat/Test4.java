package cn.itcast.code.下午.simpledateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test4 {

    public static void main(String[] args) throws ParseException {
        //以后我们的时间获取一般都是从服务器中获取, 这样更安全
        //但是如果说服务器的时间和本地时间有时差, 我们需要会修正
        //我们国内的时间比加拿大快了12个小时
        String canadaTime = "2020-03-01 16:00:00";
        //修正成国内时间 ---> string ---> Date我们可以操作毫秒值 + 12小时的毫秒值
        //1.String ---> Date : parse方法
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = format.parse(canadaTime);//为什么要变成date ???? 操作毫秒值更方便
        //需要在date的基础上 + 12小时的毫秒值
        long time = date.getTime() + 1000L * 60 * 60 * 12;
        date.setTime(time);//将重写计算的毫秒值设置回去
        //再将时间格式化成字符串
        String result = format.format(date);
        System.out.println(result);

    }
}
