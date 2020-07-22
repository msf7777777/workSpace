<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/MessageServlet" method="post">
    发帖 <textarea name="message" cols="40" rows="5"></textarea><br/>
    <input type="submit" value="提交"/>
</form>
</body>
</html>
