<%--
  Created by IntelliJ IDEA.
  User: 11848
  Date: 2022/11/24
  Time: 0:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="${pageContext.request.contextPath}/company/updateCompany">
  <input type="hidden" name="companyId" value="${companyInfo.companyId}">
  <input type="text" name="companyName" placeholder="请输入厂家名称" value="${companyInfo.companyName}"><br>
  <input type="text" name="companyIntroduce" placeholder="请输入厂家简介" value="${companyInfo.companyIntroduce}"><br>
  <input type="submit" value="修改"><br>
</form>
</body>
</html>
