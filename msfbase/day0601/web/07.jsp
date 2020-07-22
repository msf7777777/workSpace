<%@ page import="cn.itcast.pojo.User" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>EL获得域容器中集合中的java对象的数据</h1>
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
userList1 : ${userList1} <br/>
<hr/>
userList1[1].username = ${userList1[1].username}<br/>
userList1[1].password = ${userList1[1].password}<br/>
userList1[1].nickname = ${userList1[1].nickname}<br/>


</body>
</html>
