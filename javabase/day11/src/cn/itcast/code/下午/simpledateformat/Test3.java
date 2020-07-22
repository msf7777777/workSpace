package cn.itcast.code.下午.simpledateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test3 {
    public static void main(String[] args) throws ParseException {
      /*  SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //将当前时间转成好看的字符串
        String str = sdf.format(new Date());
        //将str转回date--->	 Date parse(String source)
        Date date = sdf.parse(str);//alt + enter 选择第一个将异常声明出去
        System.out.println(date);*/
        /*
            注意:1. parse方法虽然可以将字符串变成date,但是要求字符串的模式必须和SimpleDateFormat
            的模式一样,否则会引发java.text.ParseException
                2.parse方法会报编译时异常, 我们暂时解决方案, 将异常声明出去 --->alt + enter

         */
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = "2020年01月01日 18:08:08";
        Date date = sdf.parse(time);
        System.out.println(date);



    }
}
