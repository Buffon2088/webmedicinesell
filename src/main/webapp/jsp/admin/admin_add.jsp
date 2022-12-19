<%--
  Created by IntelliJ IDEA.
  User: 11848
  Date: 2022/11/17
  Time: 19:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<html>
<head>
    <title>添加admin信息</title>
</head>
<body>
<form method="post" action="${pageContext.request.contextPath}/admin/addAdmin">
    <input type="text" name="adminName" placeholder="请输入姓名"><br>
    <input type="text" name="adminLoginName" placeholder="请输入登录名称"><br>
    <input type="password" name="adminLoginPwd" placeholder="请输入登录密码"><br>
    <input type="text" name="adminTel" placeholder="请输入联系电话"><br>
    <input type="text" name="adminEmail" placeholder="请输入邮箱"><br>
    <select name="adminLevel">
        <c:forEach items="${adminTypeList}" var="al">
            <option value="${al.adminLevel}">${al.adminLevel}</option>
        </c:forEach>
    </select><br>
    <input type="text" name="adminState" placeholder="请输入状态"><br>
    <input type="submit" value="添加">
</form>
</body>
</html>
