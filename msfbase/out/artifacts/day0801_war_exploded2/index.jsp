<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <H1>过滤器</H1>
      <h3><a href="${pageContext.request.contextPath}/hello.jsp">访问hello.jsp页面</a></h3>
      <h3><a href="${pageContext.request.contextPath}/HelloServlet">访问HelloServlet</a></h3>
      <h3><a href="${pageContext.request.contextPath}/admin/userList.jsp">跳转到用户列表页面</a></h3>
      <h3><a href="${pageContext.request.contextPath}/admin/userAdd.jsp">跳转到用户添加页面</a></h3>
      <h3><a href="${pageContext.request.contextPath}/admin/userDel.jsp">跳转到用户删除页面</a></h3>
      <h3><a href="${pageContext.request.contextPath}/LoginServlet">模拟用户登录</a></h3>
      <h3><a href="${pageContext.request.contextPath}/LogoutServlet">模拟用户注销</a></h3>
  </body>
</html>
