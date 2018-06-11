<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="java.util.*" import="java.text.SimpleDateFormat" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>欢迎使用</title>
</head>
<body>
	<h2>当前时间：<%Date date = new Date();
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	String now = sdf.format(date);
	out.println(now); %></h2>
	<span><a href="${pageContext.request.contextPath}/user/showRegister.do">注册</a>
	<a href="${pageContext.request.contextPath}/user/showLogin.do">登录</a></span>
</body>
</html>