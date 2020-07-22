package cn.itcast.controller;

import cn.itcast.pojo.User;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

@WebServlet("/RequestDemo02")
public class RequestDemo02 extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 需求: 获取参数信息 封装到 user对象中
        // 1 解决获取参数的乱码问题
        // 2 创建对象
        // 3 获取参数值, 调用对象的set方法 赋值

        // 1 解决获取参数的乱码问题
        request.setCharacterEncoding("utf-8");
        // 介绍一个第三方的工具: beanUtils
        // 作用: 将map中的数据 封装到 user对象
        User user = new User();
        Map<String, String[]> parameterMap = request.getParameterMap();
        try {
            BeanUtils.populate(user, parameterMap);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(user);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}