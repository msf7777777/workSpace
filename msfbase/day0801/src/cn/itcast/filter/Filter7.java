package cn.itcast.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class Filter7 implements Filter {

    private String company;

    private FilterConfig config;

    public void init(FilterConfig config) throws ServletException {
        String company = config.getInitParameter("company");
        String faren = config.getInitParameter("faren");

        this.company = company;

        //System.out.println("过滤器777777 获取初始化参数: company = " + company);
        //System.out.println("过滤器777777 获取初始化参数: faren = " + faren);

        this.config = config;
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        //System.out.println("执行过滤器77777777 使用公司名称: " + company);

        // 为了使用子类的方法, 向下转型
        HttpServletRequest request = (HttpServletRequest) req;
        StringBuffer url = request.getRequestURL();

        System.out.println("========== 配置版本 执行Filter777777777777777777的doFilter方法... ... 拦截路径: " + url);


        chain.doFilter(req, resp);
    }

    public void destroy() {
    }

}
