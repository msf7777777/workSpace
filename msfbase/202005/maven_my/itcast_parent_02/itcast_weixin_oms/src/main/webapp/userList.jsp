<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" contentType="text/html;charset=UTF-8" language="java" %>
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
<h1>用户列表页面</h1>
    <table border="1" width="50%" cellpadding="10px" cellspacing="0">
        <tr>
            <th>序号</th>
            <th>姓名</th>
            <th>金额</th>
            <th>操作</th>
        </tr>
        <c:forEach items="${userList}" var="user" varStatus="vs">
            <tr>
                <td>${vs.count}</td>
                <td>${user.name}</td>
                <td>${user.money}</td>
                <td><a href="javascript:void(0)">删除</a></td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
