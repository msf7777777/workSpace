<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        td {
            text-align: center;
        }
    </style>
</head>
<body>
<h1>用户列表页</h1>
<table border="1" width="50%" cellpadding="10px" cellspacing="0">
    <tr>
        <th>编号</th>
        <th>用户名</th>
        <th>密码</th>
        <th>昵称</th>
        <th>操作</th>
    </tr>
    <c:forEach items="${userList}" var="user">
        <tr>
            <td>${user.id}</td>
            <td>${user.username}</td>
            <td>${user.password}</td>
            <td>${user.nickname}</td>
            <td><a href="javascript:void(0)">删除</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
