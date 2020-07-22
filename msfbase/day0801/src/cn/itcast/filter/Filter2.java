package cn.itcast.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class Filter2 implements Filter {



    public void init(FilterConfig config) throws ServletException {

    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        // 为了使用子类的方法, 向下转型
        HttpServletRequest request = (HttpServletRequest) req;
        StringBuffer url = request.getRequestURL();

        //System.out.println("=============================配置版本 执行Filter2222222222的doFilter方法... ... 拦截路径: " + url);

        // 放行: 允许访问目标资源
        chain.doFilter(req, resp);
    }

    public void destroy() {
    }

}
