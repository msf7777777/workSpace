<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>day1704项目首页</h1>
        <h3><a href="/hello/show1.do">一个方法映射一次请求</a></h3>
        <h3><a href="/hello/aaa/show2.do">Ant风格映射1 </a></h3>
        <h3><a href="/hello/aaa/bbb/show2.do">Ant风格映射2</a></h3>
        <h3><a href="/hello/aaa/bbb/ccc/show2.do">Ant风格映射3</a></h3>

        <h3><a href="/hello/show3/111.do">占位符映射1</a></h3>
        <h3><a href="/hello/show3/666.do">占位符映射2</a></h3>

        <h3><a href="/hello/show4.do">请求方式限定1: get</a></h3>
        <h3>
            <form action="/hello/show4.do" method="post">
                <input type="text" name="username"/><input type="submit" value="post提交"/>
            </form>
        </h3>

        <h3>
            <div>通过表单传递参数</div>
            <form method="post" action="/hello/show5.do">
                用户名<input type="text" name="username"/><br/>
                <input type="submit" value="提交"/>
            </form>
        </h3>

    <h3>
        <div>通过表单传递参数2</div>
        <form method="post" action="/hello/show6.do">
            用户名<input type="text" name="username"/><br/>
            年龄<input type="text" name="age"/><br/>
            <input type="submit" value="提交"/>
        </form>
    </h3>
</body>
</html>
