<%--isELIgnored="false"  是否将EL表达式忽略--%>
<%@ page isELIgnored="false" contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>首页, 这是我的第一个maven版本的web项目!</h1>
        <h3><a href="${pageContext.request.contextPath}/HelloServlet">访问servlet</a></h3>
</body>
</html>
