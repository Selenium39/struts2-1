<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>index</title>
</head>
<body>
	<a href="hello.action">execute</a>
	<a href="add.action">add</a>
	<form action="${pageContext.request.contextPath}/form1.action"
		method="post">
		username:<input name="username" type="text" /><br /> password:<input type="password" name="password"/><br />
		<input type="submit" value="提交">
	</form>
	helloworld长度为<s:property value="'helloword'.length()"></s:property>
</body>
</html>