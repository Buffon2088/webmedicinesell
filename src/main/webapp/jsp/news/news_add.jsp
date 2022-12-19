<%--
  Created by IntelliJ IDEA.
  User: 11848
  Date: 2022/11/23
  Time: 19:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="${pageContext.request.contextPath}/news/addNews">
    <input type="text" name="newsContext" placeholder="请输入公告标题"><br>
    <input type="text" name="newsIntroduce" placeholder="请输入公告内容"><br>
    <input type="date" name="newsTime" placeholder="请选择"><br>
    <input type="submit" value="添加">
</form>
</body>
</html>
