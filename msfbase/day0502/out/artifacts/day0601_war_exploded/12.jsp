<%@ page import="cn.itcast.pojo.User" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
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
<h1>普通for循环: 1~10的奇数</h1>
<c:forEach begin="1" end="10" step="2" var="i" varStatus="vs">
    ${vs.count} === ${i} ==== ${vs.first} ==== ${vs.last}<br/>
</c:forEach>

<h1>增强for循环</h1>
<%
    // 1 创建集合
    List<User> userList = new ArrayList<User>();
    // 2 将用户数据 保存到 集合中
    userList.add(new User("zhangsan", "123456", "张三"));
    userList.add(new User("lisi", "123456", "李四"));
    userList.add(new User("wangwu", "123456", "王五"));
    // 3 将集合保存域容器中
    request.setAttribute("userList1", userList);
%>

<table border="1" width="50%" cellpadding="10px" cellspacing="0">
    <tr>
        <th>序号</th>
        <th>用户名</th>
        <th>密码</th>
        <th>昵称</th>
        <th>操作</th>
    </tr>
    <c:forEach items="${userList1}" var="user" varStatus="vs">
        <tr>
            <td>${vs.count}</td>
            <td>${user.username}</td>
            <td>${user.password}</td>
            <td>${user.nickname}</td>
            <td><a href="javascript:void(0)">删除</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
