package cn.itcast.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

@Controller
@RequestMapping("hello")
public class HelloController {

    //【测试】
    @RequestMapping("show1")
    public ModelAndView show1() {
        ModelAndView mv = new ModelAndView();
        //设置数据
        mv.addObject("nowDate", "【时间】" + new Date().toLocaleString()
                + "【时间】HelloController.show1()");
        //设置视图名称
        mv.setViewName("result");
        return mv;
    }

    //【测试2】
    @RequestMapping("show2")
    public String show2(Model model) {
        System.out.println("访问了 HelloController.show2方法 ");
        model.addAttribute("nowDate", "【时间】" + new Date().toLocaleString()
                + "【时间】HelloController.show2()");
        //设置数据
        return "result";
    }

    //【测试3】
    @RequestMapping("show3")
    public String show3(ModelMap model) {
        System.out.println("访问了 HelloController.show2方法 ");
        model.addAttribute("nowDate", "【时间】" + new Date().toLocaleString()
                + "【时间】HelloController.show3()");
        //设置数据
        return "result";
    }
}
