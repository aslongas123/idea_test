<%--
  Created by IntelliJ IDEA.
  User: $USER$
  Date: $DATE$
  Time: $TIME$
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>添加用户</title>
</head>
<body>
   <form action="/user/addUser" method="post">
       姓名:<input type="text" name="username"/><br/>
       年龄:<input type="text" name="userAge"/><br/>
       <<input type="submit" value="提交">
   </form>
</body>
</html>
