<%@page import="java.util.Arrays"%>
<%@page import="java.lang.reflect.Array"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="helloWorld.jsp">
		<jsp:param name="name" value="황성욱"/>
		<jsp:param name="id" value="hsw0717"/>
	</jsp:include>
	
	<h1>다시 왔옹</h1>
</body>
</html>