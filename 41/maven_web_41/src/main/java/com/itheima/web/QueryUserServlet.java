package com.itheima.web;

import com.itheima.pojo.User;
import com.itheima.service.UserService;
import com.itheima.service.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class QueryUserServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /**
         * 1.设置编码
         * 2.创建UserService对象
         * 3.调用UserService的方法 ==> List<User>
         * 4.把List<User>放到request域中
         * 5.转发到show.jsp
         */

        try {
            //1.设置编码
            req.setCharacterEncoding("UTF-8");
            resp.setContentType("text/html;charset=utf-8");
            //2.创建UserService对象
            UserService service = new UserServiceImpl();
            //3.调用UserService的方法 ==> List<User>
            List<User> list = service.queryUsers();
            //4.把List<User>放到request域中
            req.setAttribute("list",list);
            //5.转发到show.jsp
            req.getRequestDispatcher("show.jsp").forward(req,resp);
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }
}
