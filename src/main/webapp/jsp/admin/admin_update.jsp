<%--
  Created by IntelliJ IDEA.
  User: 11848
  Date: 2022/11/18
  Time: 0:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<html>
<head>
    <title>修改Admin信息</title>
</head>
<body>
<form method="post" action="${pageContext.request.contextPath}/admin/updateAdmin">
    <input type="hidden" name="adminId" value="${adminInfo.adminId}">
    <input type="text" name="adminName" value="${adminInfo.adminName}" placeholder="请输入修改后的的姓名"><br>
    <input type="text" name="adminLoginName" value="${adminInfo.adminLoginName}" placeholder="请输入修改后的登录名称"><br>
    <input type="password" name="adminLoginPwd" value="${adminInfo.adminLoginPwd}" placeholder="请输入修改后的登录密码"><br>
    <input type="text" name="adminTel" value="${adminInfo.adminTel}" placeholder="请输入修改后的联系电话"><br>
    <input type="text" name="adminEmail" value="${adminInfo.adminEmail}" placeholder="请输入修改后的邮箱"><br>
    <select name="adminLevel" value="${adminInfo.adminLevel}">
        <c:forEach items="${adminTypeList}" var="al">
            <option value="${al.adminLevel}">${al.adminLevel}</option>
        </c:forEach>
    </select><br>
    <input type="text" name="adminState" value="${adminInfo.adminState}" placeholder="请输入修改后端状态"><br>
    <input type="submit" value="修改">
</form>
</body>
</html>
