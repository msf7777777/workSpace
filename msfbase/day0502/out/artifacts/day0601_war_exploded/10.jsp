<%@ page import="java.util.ArrayList" %>
<%@ page import="cn.itcast.pojo.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>EL进行简单运算</h1>
        ${10 + 5} <br/>
        ${10 * 5} <br/>
        &&运算: ${(3>5) && (6>2)} <br/>
        ||运算: ${(3>5) || (6>2)} <br/>
        !运算: ${!(3>5)}<br/>

        <h3>empty : 判断 字符串是否为空, 数组的元素是否为空, 集合中的元素是否为空</h3>
            <%
                request.setAttribute("str", null);
                request.setAttribute("arr", new int[3]);
                request.setAttribute("list1", new ArrayList<String>());
            %>
            str empty : ${empty str} <br/>
            arr empty : ${empty arr} <br/>
            list1 empty : ${empty list1} <br/>

        <h3>三元表达式</h3>
            <%
                User user = new User("zhangsan", "123", "张三");
                // 开发中, 如果用户登录成功了, 将用户信息保存到session容器中
                pageContext.setAttribute("loginUser", user, PageContext.SESSION_SCOPE);
            %>

            ${empty loginUser ? '匿名登录' : loginUser.nickname}
</body>
</html>
