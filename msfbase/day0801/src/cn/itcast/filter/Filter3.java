package cn.itcast.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * 过滤器的生命周期:
 *      1 服务器启动后, 立刻执行过滤器的构造方法和初始化方法
 *      2 只要你访问过滤器拦截的资源,就会执行过滤器的  doFilter方法
 *      3 当tomcat服务器关闭时, 才会执行销毁的方法... ...
 */
public class Filter3 implements Filter {

    public Filter3() {
        //System.out.println("********** 1 执行Filter3的构造方法 ... ...");
    }

    public void init(FilterConfig config) throws ServletException {
        //System.out.println("********** 2 执行Filter3的初始化方法(init) ... ...");
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        //System.out.println("********** 3 执行Filter3的执行过滤方法(doFilter) ... ...");
        // 为了使用子类的方法, 向下转型
        HttpServletRequest request = (HttpServletRequest) req;
        StringBuffer url = request.getRequestURL();

        // 获取请求头信息, User-Agent 目的获取 客户端的类型
        //String userAgentHeader = request.getHeader("User-Agent");
        //System.out.println("=============================执行Filter3的doFilter方法... ... 拦截路径: " + url + " 客户端类型:" + userAgentHeader);
        chain.doFilter(req, resp);
    }

    public void destroy() {
        //System.out.println("********** 4 执行Filter3的销毁方法(destroy) ... ...");
    }

}
