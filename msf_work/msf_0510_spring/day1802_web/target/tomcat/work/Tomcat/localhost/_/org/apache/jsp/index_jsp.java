/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-05-16 14:21:00 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>1801_麻少飞_首页</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <h1>day1802_麻少飞_项目首页</h1>\r\n");
      out.write("        <h3><a href=\"/hello/show1.do\">麻少飞の项目首页测试</a></h3>\r\n");
      out.write("\r\n");
      out.write("    <fieldset>\r\n");
      out.write("        <h4>【功能1】: 默认支持ServletAPI</h4>\r\n");
      out.write("        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/params/gotoParams.do?id=123&name=lisi\">测试</a>\r\n");
      out.write("    </fieldset>\r\n");
      out.write("\r\n");
      out.write("    <fieldset>\r\n");
      out.write("        <h4>【功能2】: 绑定简单的数据类型</h4>\r\n");
      out.write("        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/params/gotoParamsBase.do?isVIP=1&name=ZhangJiaMin\">测试</a>\r\n");
      out.write("    </fieldset>\r\n");
      out.write("\r\n");
      out.write("    <fieldset>\r\n");
      out.write("        <h4>【功能3】: @RequsestParam注解的使用</h4>\r\n");
      out.write("        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/params/gotoParamsRequestParam.do?id=19960122\">测试</a>\r\n");
      out.write("    </fieldset>\r\n");
      out.write("\r\n");
      out.write("    <fieldset>\r\n");
      out.write("        <h4>【功能4】: 绑定pojo对象</h4>\r\n");
      out.write("        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/params/gotoParamsPojo.do?id=19901113&name=麻少飞\">测试</a>\r\n");
      out.write("    </fieldset>\r\n");
      out.write("\r\n");
      out.write("    <fieldset>\r\n");
      out.write("        <h4>【功能5】: 绑定pojo对象的包装对象</h4>\r\n");
      out.write("        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/params/gotoParamsQueryVo.do?user.id=19960122&user.name=ZhangJiaMin\">测试</a>\r\n");
      out.write("    </fieldset>\r\n");
      out.write("\r\n");
      out.write("    <fieldset>\r\n");
      out.write("        <h4>【功能6】: 绑定List集合包装pojo对象</h4>\r\n");
      out.write("        <form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/params/gotoParamsList.do\" method=\"post\">\r\n");
      out.write("            <table>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th>id</th>\r\n");
      out.write("                    <th>name</th>\r\n");
      out.write("                    <th>sex</th>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td><input type=\"text\" name=\"userList[0].id\" placeholder=\"请输入ID\"></td>\r\n");
      out.write("                    <td><input type=\"text\" name=\"userList[0].name\" placeholder=\"请输入用户名\"></td>\r\n");
      out.write("                    <td><input type=\"text\" name=\"userList[0].sex\" placeholder=\"请输入性别\"></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td><input type=\"text\" name=\"userList[1].id\" placeholder=\"请输入ID\"></td>\r\n");
      out.write("                    <td><input type=\"text\" name=\"userList[1].name\" placeholder=\"请输入用户名\"></td>\r\n");
      out.write("                    <td><input type=\"text\" name=\"userList[1].sex\" placeholder=\"请输入性别\"></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <input type=\"submit\" value=\"提交\">\r\n");
      out.write("        </form>\r\n");
      out.write("    </fieldset>\r\n");
      out.write("\r\n");
      out.write("    <fieldset>\r\n");
      out.write("        <h4>【功能7】: 绑定Map集合包装pojo对象</h4>\r\n");
      out.write("        <form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/params/gotoParamsMap.do\" method=\"get\">\r\n");
      out.write("            <table>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th>id</th>\r\n");
      out.write("                    <th>name</th>\r\n");
      out.write("                    <th>sex</th>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td><input type=\"text\" name=\"userMap['userMsf'].id\" placeholder=\"请输入ID\"></td>\r\n");
      out.write("                    <td><input type=\"text\" name=\"userMap['userMsf'].name\" placeholder=\"请输入用户名\"></td>\r\n");
      out.write("                    <td><input type=\"text\" name=\"userMap['userMsf'].sex\" placeholder=\"请输入性别\"></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td><input type=\"text\" name=\"userMap['userZjm'].id\" placeholder=\"请输入ID\"></td>\r\n");
      out.write("                    <td><input type=\"text\" name=\"userMap['userZjm'].name\" placeholder=\"请输入用户名\"></td>\r\n");
      out.write("                    <td><input type=\"text\" name=\"userMap['userZjm'].sex\" placeholder=\"请输入性别\"></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <input type=\"submit\" value=\"提交\">\r\n");
      out.write("        </form>\r\n");
      out.write("    </fieldset>\r\n");
      out.write("\r\n");
      out.write("    <fieldset>\r\n");
      out.write("        <p>【功能8】: 获取请求参数，字符串转成日期对象</p>\r\n");
      out.write("        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/params/sendParamsDate.do?date=1996-01-22\">字符串转成日期对象</a><br>\r\n");
      out.write("    </fieldset>\r\n");
      out.write("\r\n");
      out.write("    <fieldset>\r\n");
      out.write("        <h4>【功能9】: 获取请求头参数，@RequestHeader注解</h4>\r\n");
      out.write("        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/params/sendParamsHeader.do\">获取请求头参数</a><br>\r\n");
      out.write("        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/params/sendParamsCookie.do\">获取Cookie参数</a><br>\r\n");
      out.write("    </fieldset>\r\n");
      out.write("\r\n");
      out.write("    <fieldset>\r\n");
      out.write("        <h4>【功能10】: 获取指定的Cookie的value值，@CookieValue注解</h4>\r\n");
      out.write("        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/params/sendParamsCookieValue.do\">获取指定的Cookie的value值</a><br>\r\n");
      out.write("    </fieldset>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
