<%--
  Created by IntelliJ IDEA.
  User: 11848
  Date: 2022/11/23
  Time: 19:58
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
    <td>厂家名称</td>
    <td>厂家介绍</td>
    <td>操作</td>
  </tr>
  <c:forEach items="${companyList}" var="cl">
    <tr>
      <td>${cl.companyName}</td>
      <td>${cl.companyIntroduce}</td>
      <td>
        <a href="${pageContext.request.contextPath}/company/showById?companyId=${cl.companyId}">修改</a>
        <a href="${pageContext.request.contextPath}/company/deleteCompany?companyId=${cl.companyId}">删除</a>
      </td>
    </tr>
  </c:forEach>
</table>
</body>
</html>
