<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <!--- 这是html注释
        html注释不能修饰java代码
        项目路径: <%=request.getContextPath()%>
    -->

    <%
        // 这是java注释: java注释 只能修饰java代码
    %>

    <%--这是jsp注释: jsp不仅可以java代码, 也可以修饰html标签
        项目路径: <%=request.getContextPath()%>
        <h1>aaaaaaaaaaaaaaaaaaa</h1>
    --%>
</body>
</html>
