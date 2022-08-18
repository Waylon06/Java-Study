<%--
  Created by IntelliJ IDEA.
  User: Lihua
  Date: 2022/6/3
  Time: 12:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="zh-CN">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="shortcut icon" href="./images/favicon.ico" type="image/x-icon">
<%--    <link rel="stylesheet" type="text/css" href="css/base.css">--%>
    <link rel="stylesheet" type="text/css" href="css/index.css">
    <title>宿舍管理系统</title>
</head>

<body>
<header>
    <img src="./images/logo (1).png" alt="">
</header>
<div class="box">
    <div class="form">
        <form action="accountverify" method="post">
            <div class="title">欢迎使用，<br>宿舍管理系统</div>
            <i class="user"></i>
            <input type="text" placeholder="请输入账号" name="id"><br>
            <i class="pwd"></i>
            <input type="password" placeholder="请输入密码" name="password">
            <button>登 录</button>
            <div class="service clearfix">
                <p>没有账号？去<a href="login.jsp">注册</a></p>
                <a href="login.jsp" class="forget">忘记密码?</a>
            </div>
        </form>
    </div>
</div>
<footer>
    <img src="./images/logo_77.png" alt="">
    <div class="contact">
        <p>联系我们</p>
        <img src="./images/db_qq.jpg" alt="">
        <p class="qq">www.100000000@qq.com</p>
    </div>
</footer>
</body>
<script>
    let xhr = new XMLHttpRequest();
    const url = 'http://localhost:8080/';
    xhr.open('get', url + 'accountverify');
    xhr.send();
    xhr.onreadystatechange = function () {
        if (xhr.readyState === 4) {
            if (xhr.status >= 200 && xhr.status < 300) {
                let s = JSON.parse(xhr.responseText);
                console.log(s);
            }
        }
    }
</script>
</html>
