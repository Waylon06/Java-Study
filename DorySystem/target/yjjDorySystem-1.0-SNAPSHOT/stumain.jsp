
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="account" class="DorySystem.model.Account" scope="session">
    <jsp:setProperty name="account" property="*"/>
</jsp:useBean>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>寝室管理系统</title>
    <link rel="stylesheet" href="./layui/css/layui.css">
</head>
<body>
<div class="layui-layout layui-layout-admin">
    <div class="layui-header">
        <div class="layui-logo layui-hide-xs layui-bg-black">寝室管理系统</div>
        <!-- 头部区域（可配合layui 已有的水平导航） -->
        <ul class="layui-nav layui-layout-left">
            <!-- 移动端显示 -->
            <li class="layui-nav-item layui-show-xs-inline-block layui-hide-sm" lay-header-event="menuLeft">
                <i class="layui-icon layui-icon-spread-left"></i>
            </li>

            <!-- <li class="layui-nav-item layui-hide-xs"><a href="">nav 1</a></li>
            <li class="layui-nav-item layui-hide-xs"><a href="">nav 2</a></li>
            <li class="layui-nav-item layui-hide-xs"><a href="">nav 3</a></li> -->
            <!-- <li class="layui-nav-item">
              <a href="javascript:;">nav groups</a>
              <dl class="layui-nav-child">
                <dd><a href="">menu 11</a></dd>
                <dd><a href="">menu 22</a></dd>
                <dd><a href="">menu 33</a></dd>
              </dl>
            </li> -->
        </ul>
        <ul class="layui-nav layui-layout-right">
            <li class="layui-nav-item layui-hide layui-show-md-inline-block">
                <a href="javascript:;">
                    <jsp:getProperty name="account" property="name"/>
                </a>
                <dl class="layui-nav-child">
<%--                    <dd><a href="">个人信息</a></dd>--%>
<%--                    <dd><a href="">设置</a></dd>--%>
                    <dd><a href="index.jsp">退出登录</a></dd>
                </dl>
            </li>

        </ul>
    </div>

    <div class="layui-side layui-bg-black">
        <div class="layui-side-scroll">
            <!-- 左侧导航区域（可配合layui已有的垂直导航） -->
            <ul class="layui-nav layui-nav-tree" lay-filter="test">
                <!-- <li class="layui-nav-item layui-nav-itemed">
                  <a class="" href="javascript:;">menu group 1</a>
                  <dl class="layui-nav-child">
                    <dd><a href="javascript:;">menu 1</a></dd>
                    <dd><a href="javascript:;">menu 2</a></dd>
                    <dd><a href="javascript:;">menu 3</a></dd>
                    <dd><a href="">the links</a></dd>
                  </dl>
                </li>
                <li class="layui-nav-item">
                  <a href="javascript:;">menu group 2</a>
                  <dl class="layui-nav-child">
                    <dd><a href="javascript:;">list 1</a></dd>
                    <dd><a href="javascript:;">list 2</a></dd>
                    <dd><a href="">超链接</a></dd>
                  </dl>
                </li> -->
<%--                <li class="layui-nav-item"><a href="./view/student-info.html" target="ifm">查询学生信息</a></li>--%>
<%--                <li class="layui-nav-item"><a href="./view/new-student.html" target="ifm">新增学生信息</a></li>--%>
                <li class="layui-nav-item"><a href="./view/student-state.html" target="ifm">录入学生入寝</a></li>
<%--                <li class="layui-nav-item"><a href="view/doryUpdata.html" target="ifm">寝室设置</a></li>--%>
<%--                <li class="layui-nav-item"><a href="./view/dorm-state.html" target="ifm">统计学生未归</a></li>--%>
<%--                <li class="layui-nav-item"><a href="./view/doryDelete.html" target="ifm">删除寝室信息</a></li>--%>
<%--                <li class="layui-nav-item"><a href="./view/student-assitant.html" target="ifm">添加学生助理</a></li>--%>
            </ul>
        </div>
    </div>

    <div class="layui-body">
        <!-- 内容主体区域 -->
        <iframe src="./view/student-info.html" frameborder="0" name="ifm" class="ifm" style="width:100%;height:100%;"></iframe>
        <!-- <div style="padding: 15px;">内容主体区域。记得修改 layui.css 和 js 的路径</div> -->
    </div>

    <div class="layui-footer">
        <!-- 底部固定区域 -->
    </div>
</div>
<script src="./layui/layui.js"></script>
<script>
    //JS
    layui.use(['element', 'layer', 'util'], function(){
        var element = layui.element
            ,layer = layui.layer
            ,util = layui.util
            ,$ = layui.$;

        //头部事件
        util.event('lay-header-event', {
            //左侧菜单事件
            menuLeft: function(othis){
                layer.msg('展开左侧菜单的操作', {icon: 0});
            }
            ,menuRight: function(){
                layer.open({
                    type: 1
                    ,content: '<div style="padding: 15px;">处理右侧面板的操作</div>'
                    ,area: ['260px', '100%']
                    ,offset: 'rt' //右上角
                    ,anim: 5
                    ,shadeClose: true
                });
            }
        });

    });
</script>

</body>
</html>