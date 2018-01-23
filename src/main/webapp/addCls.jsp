<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/23
  Time: 13:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page isELIgnored="false" contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>班级管理</title>
</head>
<body>
    <h2>添加班级</h2>
    <div>
        <c:if test="${param.res==1}">
            <span style="color:green;">添加成功!</span>
        </c:if>
        <c:if test="${param.res==-1}">
            <span style="color:red;">添加失败!</span>
        </c:if>
    </div>
    <form action="${pageContext.request.contextPath}/studentClassAction/addCls" method="post">
        <input name="sc_name">
        <input type="submit" value="添加班级">
    </form>
</body>
</html>
