<%--
  Created by IntelliJ IDEA.
  User: Waylon
  Date: 2022/6/8
  Time: 14:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    Object woshishuaige = session.getAttribute("woshishuaige");
//    out.print(woshishuaige);
%>
<%--${woshishuaige}--%>
<ul>
    <c:forEach items="${woshishuaige}" var="p">
        <li>${p}</li>
    </c:forEach>
</ul>

</body>
</html>
