package cn.itcast.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("hello")
public class HelloController {

    // 需求: 想让一个方法映射一次请求
    @RequestMapping("show1")
    public ModelAndView show1() {
        ModelAndView mv = new ModelAndView();
        // 设置视图名称
        mv.setViewName("hello");
        // 设置数据
        mv.addObject("msg", "这是我的第一个springmvc注解程序!");
        return mv;
    }

    /**
     *         <h3><a href="/hello/aaa/show2.do">Ant风格映射1 </a></h3>
     *         <h3><a href="/hello/aaa/bbb/show2.do">Ant风格映射2</a></h3>
     *         <h3><a href="/hello/aaa/bbb/ccc/show2.do">Ant风格映射3</a></h3>
     *
     *         /aaa/show2
     *         /aaa/bbb/show2
     *         /aaa/bbb/ccc/show2
     */
    @RequestMapping("/**/show2")
    public ModelAndView show2(HttpServletRequest request) {
        ModelAndView mv = new ModelAndView();
        // 设置视图名称
        mv.setViewName("hello");
        // 设置数据
        mv.addObject("msg", "ant风格映射! 请求路径: " + request.getRequestURI());
        return mv;
    }

    @RequestMapping("/show3/{id}")
    public ModelAndView show3(@PathVariable("id") int product_id) {
        ModelAndView mv = new ModelAndView();
        // 设置视图名称
        mv.setViewName("hello");
        // 设置数据
        mv.addObject("msg", "占位符映射: 商品编号 = " + product_id);
        return mv;
    }

    // 请求方式限定
    /**
     * method= RequestMethod.POST 当前方法只接受post方式的请求
     * method= RequestMethod.get 当前方法只接受get方式的请求
     *  method = {RequestMethod.GET, RequestMethod.POST} 当前方法 只接受get方式和post方式
     */
    @RequestMapping(value="/show4", method = {RequestMethod.GET, RequestMethod.POST})
    public ModelAndView show4(HttpServletRequest request) {
        ModelAndView mv = new ModelAndView();
        // 设置视图名称
        mv.setViewName("hello");
        // 设置数据
        mv.addObject("msg", "请求路径: " + request.getRequestURI() + ",<br/> 请求方式 ==== " + request.getMethod());
        return mv;
    }

    // 获取表单参数
    @RequestMapping(value="/show5")
    public ModelAndView show5(HttpServletRequest request) {
        ModelAndView mv = new ModelAndView();
        // 设置视图名称
        mv.setViewName("hello");
        // 设置数据
        // 获取参数1
        String username = request.getParameter("username");

        mv.addObject("msg", "获取参数: username =  " + username);
        return mv;
    }

    // 获取表单参数2
    @RequestMapping(value="/show6", params = {"age", "username"})
    public ModelAndView show6(@RequestParam("username") String uname, @RequestParam("age")int nianling) {
        ModelAndView mv = new ModelAndView();
        // 设置视图名称
        mv.setViewName("hello");
        // 设置数据
        // 获取参数2
        mv.addObject("msg", "获取参数2: username =  " + uname + ", 年龄: " + nianling);
        return mv;
    }

}
