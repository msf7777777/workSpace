<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h1>Cookie</h1>
      <h3><a href="${pageContext.request.contextPath}/ServletCookie1">创建cookie, 发送cookie</a></h3>
      <h3><a href="${pageContext.request.contextPath}/ServletCookie2">获取cookie</a></h3>
      <h3><a href="${pageContext.request.contextPath}/ServletCookie3">创建cookie, 携带特殊字符, 发送cookie</a></h3>
      <h3><a href="${pageContext.request.contextPath}/ServletCookie4">获取cookie, 含有特殊字符, 解码</a></h3>
      <h3><a href="${pageContext.request.contextPath}/ServletCookie5">测试cookie工具类</a></h3>
      <h3><a href="${pageContext.request.contextPath}/ServletCookie6">案例: 显示上次访问的时间</a></h3>
      <h3><a href="${pageContext.request.contextPath}/aaa/bbb/ServletCookie7">设置路径</a></h3>
      <h3><a href="${pageContext.request.contextPath}/ServletCookie8">删除cookie</a></h3>
      <h3><a href="${pageContext.request.contextPath}/01.jsp">在jsp中获取cookie的信息</a></h3>
  <h1>Session</h1>
        <h3><a href="${pageContext.request.contextPath}/ServletSession1">基本api</a></h3>
        <h3><a href="${pageContext.request.contextPath}/ServletSession2">将session作为容器使用: 存数据</a></h3>
        <h3><a href="${pageContext.request.contextPath}/ServletSession3">将session作为容器使用: 取数据</a></h3>
        <h3><a href="${pageContext.request.contextPath}/ServletSession4">查看session的超时时间</a></h3>
        <h3><a href="${pageContext.request.contextPath}/ServletSession5">通过代码设置session的超时时间</a></h3>
  </body>
</html>
