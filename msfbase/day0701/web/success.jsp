<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <c:if test="${empty loginUser}">
        <h1>用户必须登录才可以访问成功页面!
            <%
                response.setHeader("refresh", "5;url=" + request.getContextPath() +"/login.jsp");
            %>

        </h1>
    </c:if>

    <c:if test="${not empty loginUser}">
        <h1>
            欢迎 ${loginUser.nickname} 访问本网站!
            <a href="${pageContext.request.contextPath}/invalidate.jsp">注销</a>
        </h1>

    </c:if>
</body>
</html>
