package cn.itcast.exception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 自定义异常处理解析器
 */
public class MyHandlerExceptionResolver implements HandlerExceptionResolver {

    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        // 为了解决问题 将异常信息给程序员看的: 一般将错误信息 打印到控制台 或者 记录到日志文件中 或者 给负责人发短信等
        ex.printStackTrace();

        ModelAndView mv = new ModelAndView();
        // 设置视图名称
        mv.setViewName("error");
        // 添加错误提示信息(公关术语)
        mv.addObject("errorMsg", "网站正在维护中,请稍后! 如有急事, 请联系 XXX, 联系电话: 18600001111");

        return mv;
    }
}
