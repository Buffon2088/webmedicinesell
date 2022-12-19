<%--
  Created by IntelliJ IDEA.
  User: 11848
  Date: 2022/11/24
  Time: 0:21
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
        <td>药品类型名称</td>
        <td>药品类型状态</td>
        <td>操作</td>
    </tr>
    <c:forEach items="${drugTypeList}" var="tl">
        <tr>
            <td>${tl.drugTypeName}</td>
            <td>${tl.drugTypeState}</td>
            <td>
                <a href="${pageContext.request.contextPath}/drugType/showById?drugTypeId=${tl.drugTypeId}">修改</a>
                <a href="${pageContext.request.contextPath}/drugType/deleteDrugType?drugTypeId=${tl.drugTypeId}">删除</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
