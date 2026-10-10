<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Names</title>
</head>
<body>
<%!
	String showName(String name, int id){
		return id+" "+name;
	}
%>
<%
	String name = "Aya";
	int id = 21;
	
	out.print(showName(name,id));
	
%>
</body>
</html>