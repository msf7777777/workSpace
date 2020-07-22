<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>day1804项目首页</h1>
<fieldset>
    <h4>方法返回值String, 参数为 Model类型</h4>
    <a href="${pageContext.request.contextPath}/default/gotoResultModel.do">测试</a>
</fieldset>
<fieldset>
    <h4>方法返回值String, 参数为 ModelMap类型</h4>
    <a href="${pageContext.request.contextPath}/default/gotoResultModelMap.do">测试</a>
</fieldset>
<fieldset>
    <h4>方法返回值void, 使用Request对象进行跳转页面</h4>
    <a href="${pageContext.request.contextPath}/default/gotoResultRequest.do">测试</a>
</fieldset>
<fieldset>
    <h4>方法返回值void, 使用Response对象进行跳转页面</h4>
    <a href="${pageContext.request.contextPath}/default/gotoResultResponse.do">测试</a>
</fieldset>
<fieldset>
    <p>05测试——SpringMVC（Controller方法没有返回值，response响应字符串）</p>
    <a href="${pageContext.request.contextPath}/default/gotoResultResponseSendString.do">点击测试</a>
</fieldset>

<fieldset>
    <h4>方法返回值String, 使用SpringMVC的 请求转发进行跳转页面</h4>
    <a href="${pageContext.request.contextPath}/default/gotoResultForward.do">测试</a>
</fieldset>

<fieldset>
    <h4>方法返回值String, 使用SpringMVC的 重定向进行跳转页面</h4>
    <a href="${pageContext.request.contextPath}/default/gotoResultRedirect.do">测试</a>
</fieldset>

<fieldset>
    <h4>Ajax 的Json数据</h4>
    <p><input type="button" onclick="clickMe()" value="发送Ajax数据"></p>
    <h4>服务器返回数据</h4>
    <h3 id="msg">111</h3>
</fieldset>
</body>
</html>
<script src="js/jquery-1.12.4.min.js"></script>
<script>
function clickMe() {
    // 发送ajax请求
    $.ajax({
        type: "POST",
        url: "/ajax/testAjax.do",
        data: {"id":"111", "name":"张三", "sex":"女"},
        success: function(data){
            console.log(data);
            var userJsonArr = data;
            var str = "<ul>";
            for (var i = 0; i < userJsonArr.length; i++) {
                var userJson = userJsonArr[i];
                str += "<li>" + userJson.name + "</li>";
            }
            str += "</ul>";

            $("#msg").html(str);
        }
    });
}
</script>
