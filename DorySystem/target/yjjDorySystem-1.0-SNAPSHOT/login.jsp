<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="zh-CN">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="shortcut icon" href="./images/favicon.ico" type="image/x-icon">
<%--    <link rel="stylesheet" type="text/css" href="css/base.css">--%>
    <link rel="stylesheet" type="text/css" href="css/login.css">
    <title>宿舍管理系统</title>
</head>

<body>
<header>
    <img src="./images/logo (1).png" alt="">
</header>
<div class="box">
    <div class="form">
        <form action="accountlogin" method="post">
            <div class="title">快速注册，<br>宿舍管理系统</div>
            <i class="user"></i>
            <input type="text" placeholder="请输入一个账号" name="id"><br>
            <i class="name"></i>
            <input type="text" placeholder="请输入一个用户名" name="name">
            <i class="pwd"></i>
            <input type="password" placeholder="请输入一个密码" name="password">
            <button>注 册</button>
            <div class="service clearfix">
                <p>有账号？去<a href="index.jsp">登录</a></p>
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

</html>
