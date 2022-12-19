<%--
  Created by IntelliJ IDEA.
  User: 11848
  Date: 2022/11/18
  Time: 0:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<html>
<head>
    <title>admin信息列表</title>
</head>
<body>
<table>
    <a href="${pageContext.request.contextPath}/admin/showAdd">添加</a>
  <tr>
      <td>姓名</td>
      <td>用户名</td>
      <td>邮箱</td>
      <td>电话</td>
      <td>等级</td>
      <td>操作</td>
  </tr>
    <c:forEach items="${adminList}" var="ad">
       <tr>
           <td>${ad.adminName}</td>
           <td>${ad.adminLoginName}</td>
           <td>${ad.adminEmail}</td>
           <td>${ad.adminTel}</td>
           <td>${ad.adminLevel}</td>
           <td>
               <a href="${pageContext.request.contextPath}/admin/showById?adminId=${ad.adminId}">修改</a>
               <a href="${pageContext.request.contextPath}/admin/deleteAdmin?adminId=${ad.adminId}">删除</a>
           </td>
       </tr>
    </c:forEach>
</table>
</body>
</html>
