<%@ page isELIgnored="false" contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>1804_麻少飞_首页</title>
</head>
<body>
    <h1>day1802_麻少飞_项目首页</h1>
        <h2><a href="/hello/show1.do">【测试1】麻少飞の项目首页【测试1】</a></h2>

    <fieldset>
        <h2>【测试2】方法返回值String, 参数为 Model类型</h2>
        <h2><a href="${pageContext.request.contextPath}/default/gotoResultModel.do">【测试2】</a></h2>
    </fieldset>

    <fieldset>
        <h2>【测试3】方法返回值String, 参数为 ModelMap类型</h2>
        <h2><a href="${pageContext.request.contextPath}/default/gotoResultModelMap.do">【测试3】</a></h2>
    </fieldset>

    <fieldset>
        <h2>【测试4】方法返回值void, 使用Request对象进行跳转页面</h2>
        <h2><a href="${pageContext.request.contextPath}/default/gotoResultRequest.do">【测试4】</a></h2>
    </fieldset>

    <fieldset>
        <h2>【测试5】方法返回值void, 使用Response对象进行跳转页面</h2>
        <h2><a href="${pageContext.request.contextPath}/default/gotoResultResponse.do">【测试5】</a></h2>
    </fieldset>

    <fieldset>
        <h2>【测试6】SpringMVC（Controller方法没有返回值，response响应字符串）</h2>
        <h2> <a href="${pageContext.request.contextPath}/default/gotoResultResponseSendString.do">【测试6】</a></h2>
    </fieldset>

    <fieldset>
        <h2>【测试7】方法返回值String, 使用SpringMVC的 请求转发进行跳转页面</h2>
        <h2> <a href="${pageContext.request.contextPath}/default/gotoResultForward.do">【测试7_1】</a></h2>
    </fieldset>
    <fieldset>
        <h2>【测试7】方法返回值String, 使用SpringMVC的 重定向进行跳转页面</h2>
        <h2><a href="${pageContext.request.contextPath}/default/gotoResultRedirect.do">【测试7_2】</a></h2>
    </fieldset>
</body>
</html>
