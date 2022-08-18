<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="username" class="com.waylon.Username" scope="page">
    <jsp:setProperty name="username" property="*"/>
</jsp:useBean>
<html>
<head><title>验证反馈界面</title></head>
<body>
    <ul style="font-size: 20px;">
        <li>输入的用户名为：
            <jsp:getProperty property="username" name="username"/>
        </li>
        <li>&nbsp;&nbsp;&nbsp;是否有效：${username.isval}</li>
    </ul>
</body>
</html>