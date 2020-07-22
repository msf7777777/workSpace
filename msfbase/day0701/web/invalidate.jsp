<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    // 通知服务器销毁session容器
    session.invalidate();
    // 重定向跳转到 登录页面
    response.sendRedirect(request.getContextPath() + "/login.jsp");
%>
</body>
</html>
