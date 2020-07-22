package cn.itcast.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

@Controller
@RequestMapping("default")
public class DefaultController {

    //【测试2】
    // 需求：方法返回值String 代表视图名称, 参数为 Model类型 保存数据
    @RequestMapping("gotoResultModel")
    public String gotoResultModel(Model model) {
        //封装数据
        model.addAttribute("nowDate", "【时间】"
                + new Date().toLocaleString() + "【时间】DefaultController.gotoResultModel()【测试2】");
        //指定页面
        return "result";
    }

    //【测试3】
    // 需求：方法返回值String, 使用SpringMVC的 请求转发进行跳转页面
    @RequestMapping("gotoResultModelMap")
    public String gotoResultModelMap(ModelMap modelMap) {
        //封装数据
        modelMap.addAttribute("nowDate", "【时间】"
                + new Date().toLocaleString() + "【时间】DefaultController.gotoResultModelMap()【测试3】");
        //指定页面
        return "result";
    }

    //【测试4】
    // 需求：方法返回值void, 使用Request对象进行跳转页面
    @RequestMapping("gotoResultRequest")
    public void gotoResultRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("DefaultController.gotoResultRequest()");
        //使用Request对象进行跳转页面
        request.setAttribute("nowDate2", "7777777【测试4】");
        request.getRequestDispatcher("/default/gotoResultModelMap.do").forward(request, response);
    }

    //【测试5】
    // 需求：返回值为void类型, 使用Response跳转页面 (注意: 无法将SpringMVC 提供的Model, ModelMap封装的数据 重定向到目标页面)
    @RequestMapping("gotoResultResponse")
    public void gotoResultResponse(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("DefaultController.gotoResultResponse()");
        // 重定向 无法让多个资源共享同一个request对象
        request.setAttribute("nowDate2", "7777777【测试5】");
        //使用Response跳转页面,重定向 完成页面跳转
        response.sendRedirect("http://localhost:8004/default/gotoResultModelMap.do");
    }

    //【测试6】
    //SpringMVC（Controller方法没有返回值，response响应字符串）
    @RequestMapping("gotoResultResponseSendString")
    public void gotoResultResponseString(HttpServletResponse response) throws  IOException {
        response.getWriter().print("Hello springmvc!");
    }

    //【测试7_1】
    @RequestMapping("gotoResultForward")
    public String gotoResultForward(ModelMap modelMap){
        // 添加数据
        modelMap.addAttribute("nowDate2", "【时间】"
                + new Date().toLocaleString() + "【时间】DefaultController.gotoResultForward()【测试7_1】");
        // 目标1: 代替request.getRequestDispatcher("/default/gotoResultModelMap.do").forward(request, response);
        return "forward:/default/gotoResultModelMap.do";
    }

    //【测试7_2】
    @RequestMapping("gotoResultRedirect")
    public String gotoResultRedirect(ModelMap modelMap){
        //通过SpringMVC框架把封装数据到Request域中( 跳转页面的方式必须采用的是SpringMVC框架提交的方式, 才能把数据 传递过去 )
        modelMap.addAttribute("nowDate2", "【时间】"
                + new Date().toLocaleString() + "【时间】DefaultController.gotoResultRedirect()【测试7_2】");
        //指定页面
        //请求转发
        return "redirect:/default/gotoResultModelMap.do";
    }

}
