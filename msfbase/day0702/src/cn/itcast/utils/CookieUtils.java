package cn.itcast.utils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

public class CookieUtils {
    /**
     * 根据cookie的名称获取cookie对应的值, 如果没有找到返回null
     */
    public static String getCookieValue(HttpServletRequest request, String cookieName) {
        Cookie[] cookieArr = request.getCookies();
        if(cookieArr!=null) {
            for (Cookie cookie : cookieArr) {
                if(cookie.getName().equals(cookieName)) {
                    return cookie.getValue();
                }
            }
        }
        return null;
    }
}
