<%--
  Created by IntelliJ IDEA.
  User: 11848
  Date: 2022/11/17
  Time: 19:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<html>
<head>
    <title>管理员登录</title>
</head>
<body>
<form method="post" action="${pageContext.request.contextPath}/admin/adminLogin">
    <input type="text" name="adminLoginName" placeholder="请输入登录名称!"><br>
    <input type="password" name="adminLoginPwd" placeholder="请输入登录密码!"><br>
    <input type="submit" value="登录">
</form>
</body>
</html>
