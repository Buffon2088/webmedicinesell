<%--
  Created by IntelliJ IDEA.
  User: 11848
  Date: 2022/11/24
  Time: 1:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="${pageContext.request.contextPath}/user/addUser">
    <input type="text" name="userName" placeholder="请输入用户姓名"><br>
    <input type="text" name="userLoginName" placeholder="请输入用户登录名称"><br>
    <input type="password" name="userLoginPwd" placeholder="请输入用户登录密码"><br>
    <input type="text" name="userEmail" placeholder="请输入用户邮箱"><br>
    <input type="text" name="userTel" placeholder="请输入用户联系方式"><br>
    <input type="text" name="userState" placeholder="请输入用户状态"><br>
    <input type="submit" value="注册">
</form>
</body>
</html>
