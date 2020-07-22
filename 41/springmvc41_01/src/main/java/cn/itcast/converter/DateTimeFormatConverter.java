package cn.itcast.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 编写自定义日期类型转换器实现步骤:

 1.编写自定义转换器实现Converter重写方法,进行转换
 2.springmvc.xml中配置转换工厂,将我们的转换器设置到converters集合中
 3.将转换工厂对象挂载到处理器适配器上(挂载到注解驱动)
 */

/**
 * Converter<S, T>
 *     S : 代表源数据类型
 *     T : 代表目标数据类型
 */
public class DateTimeFormatConverter  implements Converter<String,Date>{

    //转换方法
    //String source 将会传递过来的日期的字符串
    public Date convert(String source) {
        // 定义日期格式
        SimpleDateFormat sdf  = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            Date date = sdf.parse(source);
            return date;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}
