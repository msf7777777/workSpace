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
import java.util.Random;

@Controller
@RequestMapping("default")
public class DefaultController {

    /**
     * 方法返回值String 代表视图名称, 参数为 Model类型 保存数据
     */
    @RequestMapping("gotoResultModel")
    public String gotoResultModel(Model model) {
        //Random r = null;
        //int num = r.nextInt(); // 会报什么异常?  空指针异常!

        // 设置数据
        model.addAttribute("nowDate", new Date().toLocaleString() + "========== DefaultController.gotoResultModel()");

        // 设置视图名称
        // 代替 mv.setViewName("result");
        return "result";
    }

    @RequestMapping("gotoResultModelMap")
    public String gotoResultModelMap(ModelMap modelMap) {
        //int[] arr = {111, 333};
        //System.out.println(arr[50]); // 会报异常? 下标越界异常

        // 设置数据
        modelMap.addAttribute("nowDate", new Date().toLocaleString() + "========== DefaultController.gotoResultModelMap()");

        return "result";
    }

    // 方法返回值String, 使用SpringMVC的 请求转发进行跳转页面
    @RequestMapping("gotoResultForward")
    public String gotoResultForward(ModelMap modelMap) throws ServletException, IOException {
        // 添加数据
        modelMap.addAttribute("nowDate2", "333333333333333");
        // 目标1: 代替request.getRequestDispatcher("/default/gotoResultModelMap.do").forward(request, response);
        return "forward:/default/gotoResultModelMap.do";
    }

    // 需求: 方法返回值void, 使用Request对象进行跳转页面
    @RequestMapping("gotoResultRequest")
    public void gotoResultRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("============== DefaultController.gotoResultRequest方法===========");
        //使用Request对象进行跳转页面
        request.setAttribute("nowDate2", "222222222");
        request.getRequestDispatcher("/default/gotoResultModelMap.do").forward(request, response);
    }

    // 方法返回值void, 使用Response对象进行跳转页面
    @RequestMapping("gotoResultResponse")
    public void gotoResultResponse(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("============== DefaultController.gotoResultResponse===========");
        // 重定向 无法让多个资源共享同一个request对象
        request.setAttribute("nowDate2", "222222222");
        //使用Response对象进行跳转页面, 重定向 完成页面跳转
        response.sendRedirect("http://localhost/default/gotoResultModelMap.do");
    }

    // 方法返回值String, 使用SpringMVC的 重定向进行跳转页面
    @RequestMapping("gotoResultRedirect")
    public String gotoResultRedirect() throws ServletException, IOException {
        System.out.println("============================== 1111111111  gotoResultRedirect()... ... 重定向(springmvc)");
        //使用Response对象进行跳转页面, 重定向 完成页面跳转
        // response.sendRedirect("http://localhost/default/gotoResultModelMap.do");
        return "redirect:http://localhost/default/gotoResultModelMap.do";
    }

    /**
     * 05测试——SpringMVC（Controller方法没有返回值，response响应字符串）
     */
    @RequestMapping("gotoResultResponseSendString")
    public void gotoResultResponseSendString(HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().print("hello, springmvc!");
    }



}
