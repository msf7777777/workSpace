package cn.itcast.intercepter;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 自定义拦截器3
 */
public class MyInterceptor03 implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("====================================== 3.1 自定义拦截器3的前置增强(preHandle) ... ...");
//        Object loginUser = request.getSession().getAttribute("loginUser");
//        if(loginUser!=null) {
//            return true;
//        }else {
//            return false;
//        }
        // true 放行, false 有问题,不放行
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("====================================== 3.2 自定义拦截器3的后置增强(postHandle) ... ... modelAndView = " + modelAndView);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("====================================== 3.3 自定义拦截器3的最终增强(afterCompletion) ... ... ");

    }
}
