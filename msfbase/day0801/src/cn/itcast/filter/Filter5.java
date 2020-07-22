package cn.itcast.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

// 方式一
// @WebFilter(urlPatterns={"/hello.jsp", "/HelloServlet"})

// 方式二
//@WebFilter(urlPatterns={"/hello.jsp"})

// 方式三
//@WebFilter(urlPatterns="/hello.jsp")

// 方式四
// @WebFilter(value="/hello.jsp")

// 方式五
@WebFilter("/hello.jsp")
public class Filter5 implements javax.servlet.Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        // 为了使用子类的方法, 向下转型
        HttpServletRequest request = (HttpServletRequest) req;
        StringBuffer url = request.getRequestURL();

        System.out.println("=============================执行Filter5555555 的doFilter方法... ... 拦截路径: " + url);


        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
