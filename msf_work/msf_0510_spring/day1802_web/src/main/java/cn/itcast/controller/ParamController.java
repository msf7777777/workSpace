package cn.itcast.controller;

import cn.itcast.pojo.QueryVo;
import cn.itcast.pojo.QueryVoList;
import cn.itcast.pojo.QueryVoMap;
import cn.itcast.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Date;

@Controller
@RequestMapping("params")
public class ParamController {

    //【index.jsp 功能1】
    @RequestMapping("gotoParams")
    public ModelAndView gotoParams(ModelAndView mv, HttpServletRequest request, HttpServletResponse response, HttpSession session) {
        //获取参数
        String id = request.getParameter("id");
        String name = request.getParameter("name");

        // 简化方式方式: 方法里(mv对象 mv名称, ... ...)
        //ModelAndView mv = new ModelAndView();

        //设置数据
        mv.addObject("nowDate", "【时间】" + new Date().toLocaleString()
                + "【时间】ParamController.gotoParams()【id】"
                + id + "【name】" + name);
        //设置视图名称
        mv.setViewName("result");
        return mv;
    }

    //【index.jsp 功能2】
    @RequestMapping("gotoParamsBase")
    public ModelAndView gotoParamsBase(ModelAndView mv, Boolean isVIP, String name) {
        // 设置数据
        mv.addObject("nowDate", "【时间】" + new Date().toLocaleString()
                + "【isVIP】" + isVIP + "【name】" + name);
        // 设置视图名称
        mv.setViewName("result");
        return mv;
    }

    //【index.jsp 功能3】
    @RequestMapping("gotoParamsRequestParam")
    public ModelAndView gotoParamsRequestParam(ModelAndView mv, @RequestParam("id") Integer productId) {
        // 设置数据
        mv.addObject("nowDate", "【时间】" + new Date().toLocaleString()
                + "【id】" + productId);
        // 设置视图名称
        mv.setViewName("result");
        return mv;
    }

    //【index.jsp 功能4】
    @RequestMapping("gotoParamsPojo")
    public ModelAndView gotoParamsPojo(ModelAndView mv, User user) {
        // 设置数据
        mv.addObject("nowDate", "【时间】" + new Date().toLocaleString()
                + "【User】" + user);
        // 设置视图名称
        mv.setViewName("result");
        return mv;
    }

    //【index.jsp 功能5】
    @RequestMapping("gotoParamsQueryVo")
    public ModelAndView gotoParamsQueryVo(ModelAndView mv, QueryVo queryVo) {
        // 设置数据
        mv.addObject("nowDate", "【时间】" + new Date().toLocaleString()
                + "【QueryVo】" + queryVo);
        // 设置视图名称
        mv.setViewName("result");
        return mv;
    }

    //【index.jsp 功能6】
    @RequestMapping("gotoParamsList")
    public ModelAndView gotoParamsList(ModelAndView mv, QueryVoList queryVoList) {
//    public ModelAndView gotoParamsList(ModelAndView mv, QueryVo queryVo) {//
        // 设置数据
        mv.addObject("nowDate", "【时间】" + new Date().toLocaleString()
                + "【QueryVoList】" + queryVoList);
//                + "【QueryVo】" + queryVo);//
        // 设置视图名称
        mv.setViewName("result");
        return mv;
    }

    //【index.jsp 功能7】
    @RequestMapping("gotoParamsMap")
    public ModelAndView gotoParamsMap(ModelAndView mv, QueryVoMap queryVoMap) {
        // 设置数据
        mv.addObject("nowDate", "【时间】" + new Date().toLocaleString()
                + "【QueryVoMap】" + queryVoMap);
        // 设置视图名称
        mv.setViewName("result");
        return mv;
    }

    //【index.jsp 功能8】
    @RequestMapping("sendParamsDate")
    public ModelAndView sendParamsDate(ModelAndView mv, Date date) {
        // 设置数据
        mv.addObject("nowDate", "【时间】" + new Date().toLocaleString()
                + "【Date】" + date);
        // 设置视图名称
        mv.setViewName("result");
        return mv;
    }

    //【index.jsp 功能9】
    @RequestMapping("sendParamsHeader")
    public ModelAndView sendParamsHeader(ModelAndView mv, @RequestHeader("User-Agent") String header) {
        // 设置数据
        mv.addObject("nowDate", "【时间】" + new Date().toLocaleString()
                + "【User-Agent】" + header);
        // 设置视图名称
        mv.setViewName("result");
        return mv;
    }
    @RequestMapping("sendParamsCookie")
    public ModelAndView sendParamsCookie(ModelAndView mv, @RequestHeader("cookie") String cookie) {
        // 设置数据
        mv.addObject("nowDate", "【时间】" + new Date().toLocaleString()
                + "【cookie】" + cookie);
        // 设置视图名称
        mv.setViewName("result");
        return mv;
    }

    //【index.jsp 功能10】
    @RequestMapping("sendParamsCookieValue")
    public ModelAndView sendParamsCookie(@CookieValue("JSESSIONID") String cookieValue, ModelAndView mv){
        // 设置数据
        mv.addObject("nowDate", "【时间】" + new Date().toLocaleString()
                + "【JSESSIONID】" + cookieValue);
        // 设置视图名称
        mv.setViewName("result");
        return mv;
    }
}
