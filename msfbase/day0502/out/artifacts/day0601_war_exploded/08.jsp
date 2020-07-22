<%@ page import="cn.itcast.pojo.User" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
 <h1>EL获得域容器中map集合中的java对象的数据</h1>
<%
    // 1 创建map集合
    Map<String, User> map = new HashMap<String, User>();
    // 2 添加数据
    map.put("user1", new User("zhangsan", "123", "张三"));
    map.put("user2", new User("lisi", "123", "李四"));
    map.put("user3", new User("wangwu", "123", "王五"));
    map.put("aaa.bbb.ccc", new User("zhaoliu", "123", "赵六"));

    // 3 将map集合放到域容器中
    request.setAttribute("map1", map);
%>
map1 : ${map1} <hr/>
map1.user3 : ${map1.user3} <hr/>
 <h3>方式一</h3>
map1.user3.username : ${map1.user3.username} <hr/>
map1.user3.password : ${map1.user3.password} <hr/>
map1.user3.nickname : ${map1.user3.nickname} <hr/>

<%--map1.aaa.bbb.ccc.nickname : ${map1.aaa.bbb.ccc.nickname} <hr/>--%>

<h3>方式二</h3>
 map1['user3'].username : ${ map1['user3'].username} <hr/>
 map1['user3'].password : ${ map1['user3'].password} <hr/>
 map1['user3'].nickname : ${ map1['user3'].nickname} <hr/>

 map1['aaa.bbb.ccc'].nickname : ${map1['aaa.bbb.ccc'].nickname} <hr/>
</body>
</html>
