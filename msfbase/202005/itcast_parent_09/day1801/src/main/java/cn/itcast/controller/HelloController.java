package cn.itcast.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

@Controller
@RequestMapping("hello")
public class HelloController {

    @RequestMapping("show1")
    public ModelAndView show1() {
        ModelAndView mv = new ModelAndView();
        // 设置数据
        mv.addObject("nowDate", new Date().toLocaleString() + "========== HelloController.show1()");
        // 设置视图名称
        mv.setViewName("result");

        return mv;
    }

}
