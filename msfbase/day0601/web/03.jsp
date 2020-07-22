<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>九大内置对象</h1>
    <h3>项目路径: <%=request.getContextPath()%></h3>

<h1>PageContext</h1>
    <h3>作用1: 通过PageContext获取其他隐式对象的应用</h3>
        request 方式一 : <%=pageContext.getRequest()%> <br/>
        request 方式二 : <%=request%>

    <h3>获取项目的路径</h3>
        项目路径1: <%=request.getContextPath()%> <br/>
        项目路径2: <%=((HttpServletRequest)pageContext.getRequest()).getContextPath()%>

    <h3>作用2: 通过PageContext可以操作域容器对象的增删改查</h3>
        <h4>存:</h4>
            <%
                pageContext.setAttribute("city", "北京1"); // 向当前页面保存数据
                pageContext.setAttribute("city", "北京2", PageContext.REQUEST_SCOPE); // 向当前request对象中保存数据
                // 代替 request.setAttribute("city", "北京2");

                pageContext.setAttribute("city", "北京3", PageContext.SESSION_SCOPE); // 向session容器中保存数据
                // 代替: session.setAttribute("city", "北京3");

                pageContext.setAttribute("city", "北京4", PageContext.APPLICATION_SCOPE); // 向当前项目对象对象(ServletContext)中保存数据
                // 代替: servletContextr.setAttribute("city", "北京4");
            %>
        <h4>删除</h4>
            <%
                // 删除所有域容器中的数据
                // pageContext.removeAttribute("city"); // 问题: 删除哪个容器中的数据? 删除所有域容器中的name=city的数据

                // 删除指定域容器中的数据
                pageContext.removeAttribute("city", PageContext.PAGE_SCOPE);
                pageContext.removeAttribute("city", PageContext.REQUEST_SCOPE);
                pageContext.removeAttribute("city", PageContext.SESSION_SCOPE);
                pageContext.removeAttribute("city", PageContext.APPLICATION_SCOPE);
            %>

        <h4>取1: 根据域容器和名称取获取</h4>
            当前页面数据 page: <%=pageContext.getAttribute("city")%><br/>
            request域容器: <%=pageContext.getAttribute("city", PageContext.REQUEST_SCOPE)%><br/>
            会话 session域容器: <%=pageContext.getAttribute("city", PageContext.SESSION_SCOPE)%><br/>
            当前项目容器 application: <%=pageContext.getAttribute("city", PageContext.APPLICATION_SCOPE)%><br/>

        <h4>取2: 智能获取, 从小到大 依次获取</h4>
            智能获取: <%=pageContext.findAttribute("city")%>
</body>
</html>
