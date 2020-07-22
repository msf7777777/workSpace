package cn.itcast.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.nio.channels.FileChannel;
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

    @RequestMapping("show2")
    public String show2(Model model) {
        System.out.println("--------------- 访问了 HelloController.show2方法... ...");
        // 设置数据
        model.addAttribute("nowDate", new Date().toLocaleString() + "=============== HelloController.show2() .... ...");
        // 设置视图名称
        // mv.setViewName("result");
        return "result";
    }

    @RequestMapping("show3")
    public String show3(ModelMap model) {
        System.out.println("--------------- 访问了 HelloController.show3方法... ...");
        // 设置数据
        model.addAttribute("nowDate", new Date().toLocaleString() + "=============== HelloController.show3() .... ...");
        // 设置视图名称
        return "result";
    }

}
