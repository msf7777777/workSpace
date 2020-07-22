<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Collections" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>EL获得域容器中集合中的数据</h1>
    <%
        // 初始化集合数据
        List<String> list = new ArrayList<String>();
        Collections.addAll(list, "陈道明", "刘德华", "黎明", "郭富城");
        // 将集合保存到域容器中
        request.setAttribute("list1", list);
    %>
    list1 ==== ${list1} <br/>
    list1[0] === ${list1[0]} <br/>
    list1[1] === ${list1[1]} <br/>
    list1[2] === ${list1[2]} <br/>
    list1[3] === ${list1[3]} <br/>

    list1[300] === ${list1[300]} <br/>

    <%--<%=list.get(100)%> 报错: 下标越界--%>


</body>
</html>
