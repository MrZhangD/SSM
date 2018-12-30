<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<%@ page isELIgnored="false" %>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>用户登录</title>
</head>
<body>
	<div style="text-align: center;">
		<h2>请登录</h2>
		<form action="check.do" method="post">
		<p>用户：<input type="text" placeholder="username" name="username"></p>
		<p>密码：<input type="password" name="pwd"></p>
		<input type="submit" value="登录">
		</form>
		<p>又添加了一段文字</p>
		<p>${fail}</p>
	</div>
</body>
</html>
