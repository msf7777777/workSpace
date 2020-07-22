<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>EL获得项目路径</h1>
request.getContextPath() === <%=request.getContextPath()%> <hr/>
((HttpServletRequest)pageContext.getRequest()).getContextPath() ====== <%=((HttpServletRequest)pageContext.getRequest()).getContextPath()%> <hr/>

pageContext.request.contextPath = ${pageContext.request.contextPath}
</body>
</html>
