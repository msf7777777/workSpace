package cn.itcast.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class Filter4 implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        // 为了使用子类的方法, 向下转型
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;

        // 需求: 用户必须登录后, 才可以访问 admin目录中的内容
        // 如何判断用户是否登录? 观察session容器中 是否含有当前用户信息, 如果有表示已登录, 如果没有就代表没有登录
        // 获取session对象的引用
        HttpSession session = request.getSession();
        // 从session中获取用户信息
        Object loginUser = session.getAttribute("loginUser");
        // 判断
        if(loginUser!=null) {
            // 已经登录, 直接放行
            chain.doFilter(req, resp);
        }else {
            // 没有登录
            response.setContentType("text/html;charset=utf-8");
            response.getWriter().print("当前资源必须登录才可以访问!");
            // response.setHeader("refresh", "5;url=/day0801/login.jsp");
            // 5秒后跳转到登录页面
            response.setHeader("refresh", "5;url=" + request.getContextPath() + "/login.jsp");
        }
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
