<%@ page import="cn.itcast.pojo.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>EL获得javaBean对象的值</h1>
    <%
        // 将java对象保存到容器中
        User user = new User("zhangsan", "123456", "张三");
        // 向request容器中保存数据
        // 方式一
        //pageContext.setAttribute("user1", user, PageContext.REQUEST_SCOPE);
        // 方式二
        request.setAttribute("user2", user);
    %>

    <h3>java</h3>
        用户名: <%=((User)request.getAttribute("user2")).getUsername()%> <br/>
        密码: <%=((User)request.getAttribute("user2")).getPassword()%> <br/>
        昵称: <%=((User)request.getAttribute("user2")).getNickname()%> <br/>

    <h3>EL</h3>
        user2 : ${user2} <br/>
        user2.username : ${user2.username} <br/>
        user2.password : ${user2.password} <br/>
        user2.nickname : ${user2.nickname} <br/>
</body>
</html>
