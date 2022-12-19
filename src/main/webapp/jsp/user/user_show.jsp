<%--
  Created by IntelliJ IDEA.
  User: 11848
  Date: 2022/11/24
  Time: 2:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tr>
        <td>用户姓名</td>
        <td>用户登录名称</td>
        <td>用户账户余额</td>
        <td>用户邮箱</td>
        <td>用户联系方式</td>
        <td>用户状态</td>
        <td>操作</td>
    </tr>
    <c:forEach items="${userList}" var="ul">
        <tr>
            <td>${ul.userName}</td>
            <td>${ul.userLoginName}</td>
            <td>${ul.userBalance}</td>
            <td>${ul.userEmail}</td>
            <td>${ul.userTel}</td>
            <td>${ul.userState}</td>
            <td>
                <a href="${pageContext.request.contextPath}/user/showById?userId=${ul.userId}">修改</a>
                <a href="${pageContext.request.contextPath}/user/deleteUser?userId=${ul.userId}">删除</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
