<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户输入用户名界面</title>
</head>
<body>
<form action="/JavaBean/judge.jsp" method="post" style="font-size: 20px;">
    <li>请输入用户名：<input type="text" name="username"/>只能由字母、数字或者下划线组成
    </li>
    <input type="submit" value="验证">
</form>
</body>
</html>