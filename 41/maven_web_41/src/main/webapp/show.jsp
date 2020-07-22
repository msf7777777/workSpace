<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <table border="1px" cellspacing="0" width="50%" align="center">
        <tr align="center">
            <th>编号</th>
            <th>姓名</th>
            <th>年龄</th>
        </tr>
        <c:forEach items="${list}" var="u" >
            <tr align="center">
                <td>${u.id}</td>
                <td>${u.name}</td>
                <td>${u.age}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
