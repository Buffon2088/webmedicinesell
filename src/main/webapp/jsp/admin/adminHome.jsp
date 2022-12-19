<%--
  Created by IntelliJ IDEA.
  User: 11848
  Date: 2022/11/30
  Time: 20:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="${pageContext.request.contextPath}/drugType/findAllDrugType">药品类型</a><br>
<a href="${pageContext.request.contextPath}/company/findAllCompany">生产厂家</a><br>
<a href="${pageContext.request.contextPath}/news/findAllNews">系统公告</a><br>
<a href="${pageContext.request.contextPath}/user/findAllUser">用户信息管理</a><br>
<a href="${pageContext.request.contextPath}">订单信息管理</a><br>
<a href="${pageContext.request.contextPath}">留言信息管理</a><br>
</body>
</html>
