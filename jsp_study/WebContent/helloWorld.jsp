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
 <%
 	int i=0;
 while(true){
	 i++;
	 out.println("2 *" + i + "=" + (2*i) + "<br /> ");
 
 %>
 =================<br />
 <%
 	if(i>=9) break;
 }
 %>
 
 <%!
 	int i= 10;
 	String str = "ABCDE";
 	
  String name,id,pw;
  String[] hobbys;
 %>
 <%
 	name = request.getParameter("name");
    id= request.getParameter("id");
    pw = request.getParameter("pw");
    hobbys = request.getParameterValues("hobby");
 %>
	이름: <%= name %><br />
	아이디: <%= id %><br />
	비밀번호: <%= pw %><br />
	취미 :<%= Arrays.toString(hobbys) %><br />

 <%!
 	public int sum(int a, int b){
	 return a+b;
 }
 %>
 <%
 	out.println("i = " + i + "<br/>");
 	out.println("str = " + str + "<br/>");
 	out.println("sum = " + sum(1,5) + "<br/>");
 %>
 
 <%
 	Cookie[] cookie = request.getCookies();
 	for(i=0;i<cookie.length;i++){
		 String str = cookie[i].getName();
	 	if(str.equals("cookieN")){
	 		out.println("cookies[" + i + "] name:" + cookie[i].getName() +"<br/>");
	 		out.println("cookies[" + i + "] value:" + cookie[i].getValue() +"<br/>");
	 	}
 }
 %>
</body>
</html>