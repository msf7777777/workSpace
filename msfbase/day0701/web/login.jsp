<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>登录页面</h1>
<form method="post" action="${pageContext.request.contextPath}/LoginServlet">
    <table>
        <tr>
            <td></td>
            <td style="color:red">${errMsg}</td>
        </tr>
        <tr>
            <td>用户名</td>
            <td><input type="text" name="username" value="${cookie.username.value}"/></td>
        </tr>
        <tr>
            <td>密码</td>
            <td><input type="password" name="password"/></td>
        </tr>
        <tr>
            <td>验证码</td>
            <td>
                <input type="text" name="code_form"/>
                <img src="${pageContext.request.contextPath}/checkcodeServlet" id="codeImg" onclick="changeCode()"/>
                <script>
                    function changeCode(){
                        document.getElementById("codeImg").src = "${pageContext.request.contextPath}/checkcodeServlet?r=" + Math.random();
                    }
                </script>
            </td>
        </tr>
        <tr>
            <td></td>
            <td>
                <input type="checkbox" name="isRemeberName" value="1"
                       ${not empty cookie.username ? "checked" : ""}
                /> 记住用户名
            </td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="登录"/></td>
        </tr>
    </table>
</form>
</body>
</html>
