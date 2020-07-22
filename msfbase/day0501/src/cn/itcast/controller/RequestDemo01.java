package cn.itcast.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

@WebServlet("/RequestDemo01")
public class RequestDemo01 extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 解决获取参数的乱码问题(方向:浏览器给服务器的数据)
        request.setCharacterEncoding("utf-8");

        // 通过api获取请求方式
        String method = request.getMethod();

        // 方式一: 根据表单项的name属性值 获取用户填写或用户选择的值
        /*
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String[] hobbies = request.getParameterValues("hobby");

        System.out.println(method + " username = " + username);
        System.out.println(method + " password = " + password);
        System.out.println(method + " hobbies = " + Arrays.toString(hobbies));
        */
        // 方式二: 服务器将获取表单项的值封装到map中
        // map中的key 由 表单项name属性值组成, value由用户填写或用户选择的值组成
        Map<String, String[]> map = request.getParameterMap();
        Set<String> nameSet = map.keySet();
        for (String name : nameSet) {
            String[] valArr = map.get(name);

            System.out.println(name + " ======= " + Arrays.toString(valArr));
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 需求: 获取参数值
        doPost(request, response);
    }
}