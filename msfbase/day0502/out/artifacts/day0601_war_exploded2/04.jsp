<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <h3>通过EL表达式从容器中获取数据</h3>
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


    <h1>java</h1>
        <h4>取1: 根据域容器和名称取获取</h4>
            <%=pageContext.getAttribute("city")==null? "" : pageContext.getAttribute("city")%> <br/> <%--结果: null--%>
            <%=pageContext.getAttribute("city", PageContext.REQUEST_SCOPE)%><br/>
            <%=pageContext.getAttribute("city", PageContext.SESSION_SCOPE)%><br/>
            <%=pageContext.getAttribute("city", PageContext.APPLICATION_SCOPE)%><br/>

    <h1>EL</h1>
        <h4>取1: 根据域容器和名称取获取</h4>
            ${pageScope.city}<br/>
            ${requestScope.city}<br/>
            ${sessionScope.city}<br/>
            ${applicationScope.city}<br/>

    <h1>java代码</h1>
        <h4>java 取2: 智能获取, 从小到大 依次获取</h4>
            智能获取: <%=pageContext.findAttribute("city")%>

    <h1>EL表达式</h1>
        <h4>取2: 智能获取, 从小到大 依次获取(page, request, session, servletContext)</h4>
        智能获取: ${city}
</body>
</html>
