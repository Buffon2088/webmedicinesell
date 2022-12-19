<%--
  Created by IntelliJ IDEA.
  User: 11848
  Date: 2022/11/24
  Time: 1:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="${pageContext.request.contextPath}/user/userLogin">
    <input type="text" name="userLoginName" placeholder="请输入登录用户名"><br>
    <input type="password" name="userLoginPwd" placeholder="请输入登录密码"><br>
    <input type="submit" value="登录">
</form>
</body>
</html>
