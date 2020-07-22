<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>在jsp中嵌入java代码</h1>
<%
    // 1 脚本片段: 最终会被翻译成java中一段代码
    // 需求: 不仅输出1~10, 隔行变色
    for(int i=1; i<=10; i++) {
        if(i%2==0) {
%>
        <%--<%=i%> 2 脚本表达式, 对外输出内容--%>
        <font color="red"><%=i%></font>
<%
            //out.println("<font color='red'>" + i + "</font>");
        }else {
            //out.println("<font color='green'>" + i + "</font>");
%>
        <font color="green"><%=i%></font>
<%
        }
    }
%>

<%!
    // 3 脚本声明: 声明当前类的成员变量 或 成员方法等
    private int a = 3;
    private int b = 6;

    public int getSum(int x, int y) {
        return x + y;
    }
%>

<%=a%> + <%=b%> = <%=getSum(a, b)%>
</body>
</html>











