package cn.itcast.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.Timestamp;

@WebServlet("/ServletSession1")
public class ServletSession1 extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 解决浏览器的中文乱码: 服务器 -> 浏览器
        response.setContentType("text/html;charset=utf-8");
        // 解决 获取参数的中文乱码: 浏览器 -> 服务器
        request.setCharacterEncoding("utf-8");

        // 需求: 常用sessionapi
        // 1 获取session: session由服务器创建的
        HttpSession session = request.getSession();
        // 2 session的唯一标志
        String id = session.getId();
        // 3 session的创建的创建时间
        Timestamp createTime = new Timestamp(session.getCreationTime());
        // 4 session的最后一次被访问的时间
        Timestamp lastAccessedTime = new Timestamp(session.getLastAccessedTime());
        // 5 当前session是否是新的
        boolean flag = session.isNew();

        response.getWriter().print("session对象: " + session + "<br/>");
        response.getWriter().print("session的唯一标志: " + id + "<br/>");
        response.getWriter().print("session的创建的创建时间: " + createTime + "<br/>");
        response.getWriter().print("session的最后一次被访问的时间: " + lastAccessedTime + "<br/>");
        response.getWriter().print("当前session是否是新的: " + flag + "<br/>");


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}