<%--
  Created by IntelliJ IDEA.
  User: 11848
  Date: 2022/11/24
  Time: 2:01
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
    <input type="hidden" name="userId" value="${userInfo.userId}">
    <input type="text" name="userName" placeholder="请输入用户姓名" value="${userInfo.userName}"><br>
    <input type="text" name="userLoginName" placeholder="请输入用户登录名称" value="${userInfo.userLoginName}"><br>
    <input type="password" name="userLoginPwd" placeholder="请输入用户登录密码" value="${userInfo.userLoginPwd}"><br>
    <input type="text" name="userEmail" placeholder="请输入用户邮箱" value="${userInfo.userEmail}"><br>
    <input type="text" name="userTel" placeholder="请输入用户联系方式" value="${userInfo.userTel}"><br>
    <input type="text" name="userState" placeholder="请输入用户状态" value="${userInfo.userState}"><br>
    <input type="submit" value="注册">
</form>
</body>
</html>
