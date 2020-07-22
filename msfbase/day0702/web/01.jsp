<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>在jsp中获取cookie的信息</h1>
        ${cookie.username} <br/>
        ${cookie.username.name} <br/>
        ${cookie.username.value}
    <hr/>
        ${cookie.age} <br/>
        ${cookie.age.name} <br/>
        ${cookie.age.value}
    <hr/>
</body>
</html>
