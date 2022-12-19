<%--
  Created by IntelliJ IDEA.
  User: 11848
  Date: 2022/11/23
  Time: 19:09
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
        <td>公告标题</td>
        <td>公告时间</td>
        <td>操作</td>
    </tr>
    <c:forEach items="${newsInfoList}" var="nl">
        <tr>
            <td>${nl.newsContext}</td>
            <td>${nl.newsTime}</td>
            <td>
                <a href="${pageContext.request.contextPath}/news/findNewsById?newsId=${nl.newsId}">修改</a>
                <a href="${pageContext.request.contextPath}/news/deleteNews?newsId=${nl.newsId}">删除</a>
                <a>查看详情</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
