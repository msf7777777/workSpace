package cn.itcast.filter;


import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/*
回顾配置版的servlet
    1 创建类, 实现servlet接口
    2 重写servlet接口中的方法
    3 在web.xml注册servlet
    4 在web.xml映射浏览器访问的路径

配置版的过滤器Filter
    1 创建类, 实现Filter接口
    2 重写Filter接口中的方法
    3 在web.xml注册过滤器
    4 在web.xml映射过滤器拦截的路径
 */
public class Filter1 implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        // 为了使用子类的方法, 向下转型
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        StringBuffer url = request.getRequestURL();

        //System.out.println("========== 配置版本 执行Filter1111的doFilter方法... ... 拦截路径: " + url);

        // 放行: 允许客户端 访问 服务端的资源
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {

    }
}
