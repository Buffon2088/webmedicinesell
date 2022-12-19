<%--
  Created by IntelliJ IDEA.
  User: 11848
  Date: 2022/11/24
  Time: 0:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="${pageContext.request.contextPath}/drugType/addDrugType">
    <input type="text" name="drugTypeName" placeholder="请输入药瓶类型名称"><br>
    <input type="text" name="drugTypeState" placeholder="请输入药瓶状态"><br>
    <input type="submit" value="添加">
</form>
</body>
</html>
