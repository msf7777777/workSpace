package cn.itcast.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloController implements Controller {

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView mv = new ModelAndView();
        // 设置视图名称
        // 问题: 如何让 hello 找到 /WEB-INF/views/hello.jsp
        // 解决: 对路径进行拆分 /WEB-INF/views/hello.jsp
        // 拆分的结果: 前缀= /WEB-INF/views/, 视图名称=hello  ,后缀=.jsp
        mv.setViewName("hello"); // 对应一个jsp文件

        // 设置内容: 类似于 request.setAttribute(key, val);
        mv.addObject("msg", "这是我的第一个springmvc程序");
        return mv;
    }
}
