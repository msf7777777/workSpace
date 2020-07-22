package cn.itcast.controller;

import cn.itcast.pojo.User;
import cn.itcast.service.UserService;
import cn.itcast.service.impl.UserServiceImpl;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 解决浏览器的中文乱码: 服务器 -> 浏览器
        response.setContentType("text/html;charset=utf-8");
        // 解决 获取参数的中文乱码: 浏览器 -> 服务器
        request.setCharacterEncoding("utf-8");

        // 0校验验证码
        // 01 获取表单中验证码, 用户自己填写的
        String code_form = request.getParameter("code_form");
        // 02 获取session中的验证码(后台)
        String code_session = (String) request.getSession().getAttribute("code_session");
        // 03 判断
        // 非法 不一致
        if(code_form==null || !code_session.equalsIgnoreCase(code_form)) {
            // 3.2.1 将错误信息保存到request容器中
            request.setAttribute("errMsg", "验证码错误!");
            // 3.2.2 使用请求转发跳转到登录页面 且 显示错误
            request.getRequestDispatcher("/login.jsp").forward(request, response);

            return; // 注意: 必须加return, 如果不加后面的代码还会执行
        }

        // 1 获取参数 封装到user对象中
        User user = new User();
        try {
            BeanUtils.populate(user, request.getParameterMap());
        } catch (Exception e) {
            e.printStackTrace();
        }
        // 2 调用业务层 根据用户名和密码查询用户信息
        UserService userService = new UserServiceImpl();
        User loginUser = userService.login(user); // loginUser 是业务层返回给servlet的数据.   user 是servlet给业务层的参数
        // 3 判断
        if(loginUser!=null) {
            // 3.1 如果用户存在, 表示登录成功
            // 3.1.3 记住用户名功能, 判断用户是否勾选了记住用户名
            String isRemeberName = request.getParameter("isRemeberName");
            if(isRemeberName!="" && isRemeberName!=null && isRemeberName.equals("1")) {
                // 勾选了, 创建cookie, 发送cookie给浏览器
                Cookie cookie = new Cookie("username", loginUser.getUsername());
                cookie.setPath(request.getContextPath() + "/login.jsp"); // 目的: 只有访问当前项目的登录页面才会携带这个cookie
                cookie.setMaxAge(60 * 60 * 24 * 30);
                response.addCookie(cookie);
            } else {
                // 没有勾选, 删除保存用户名的cookie
                Cookie cookie = new Cookie("username", "");
                cookie.setPath(request.getContextPath() + "/login.jsp"); // 目的: 只有访问当前项目的登录页面才会携带这个cookie
                cookie.setMaxAge(0); // 立刻删除
                response.addCookie(cookie);
            }
            // 3.1.1 将用户信息保存到session容器中, 作为判断用户是否登录的依据
            request.getSession().setAttribute("loginUser", loginUser);

            // 3.1.2 使用重定向跳转到欢迎页面(成功页面)
            response.sendRedirect(request.getContextPath() + "/success.jsp");
        }else {
            // 3.2 如果用户不存在, 表示登录失败
            // 3.2.1 将错误信息保存到request容器中
            request.setAttribute("errMsg", "用户名或密码错误!");
            // 3.2.2 使用请求转发跳转到登录页面 且 显示错误
            request.getRequestDispatcher("/login.jsp").forward(request, response);
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}