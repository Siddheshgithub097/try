<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	
	String message = (String) request.getAttribute("message");
	
	      if(message!=null){
	%>
	<h1><%=message%></h1>
	<%} %>
	<form action="log" method="post">
	 Email:<input type="text" name="email">
	 Password:<input type="text" name="password">
	 <input type="submit" name="submit" value="LOGIN">
	</form>
</body>
</html>