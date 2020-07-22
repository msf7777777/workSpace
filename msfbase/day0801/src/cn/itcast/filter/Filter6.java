package cn.itcast.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter(value = "/*", initParams = {@WebInitParam(name="encoding", value = "gbk"), @WebInitParam(name="faren", value = "张三")})
public class Filter6 implements Filter {

    public void init(FilterConfig config) throws ServletException {
        String encoding = config.getInitParameter("encoding");
        String faren = config.getInitParameter("faren");

        //System.out.println("Filter6 初始化参数信息: encoding = " + encoding);
        //System.out.println("Filter6 初始化参数信息: faren = " + faren);
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        // 为了使用子类的方法, 向下转型
        HttpServletRequest request = (HttpServletRequest) req;
        StringBuffer url = request.getRequestURL();

        System.out.println("=============================执行Filter66666666666666的doFilter方法... ... 拦截路径: " + url);


        chain.doFilter(req, resp);
    }


    public void destroy() {
    }
}
