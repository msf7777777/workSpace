<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>jstl : 判断 c:if</h1>
    <c:if test="${3 > 5}">
        3 大于 5
    </c:if>
    <c:if test="${3 <= 5}">
        3 小于 或 等于 5
    </c:if>
    <hr/>

    <c:if test="${13 <= 5}" var="result" scope="page"> </c:if>
    result = ${result}

    注意: 只有c:if 没有c:else
</body>
</html>
