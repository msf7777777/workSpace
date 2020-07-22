package cn.itcast.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Controller 跟 @Service的功能类似, 专门用在web层, 作用:区分三层
 */
@Controller
public class TestController {

    // 需求: 想让一个方法 处理一个 请求
    @RequestMapping("show1")
    public ModelAndView show1() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("hello"); // 找到 hello 对应的jsp页面
        mv.addObject("msg", "这是我第一个mvc注解程序, 一个方法 处理 一个请求!");
        return mv;
    }
}
