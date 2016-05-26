<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
	EL GEDY

<jsp:useBean id="DatabaseHandler" scope="request" class="main.DatabaseHandler" /> 
<p>
	<jsp:setProperty property="mongoIP" name="DatabaseHandler" value="localhost"/>
	<jsp:setProperty property="mongoPort" name="DatabaseHandler" value="27017"/>
	<jsp:getProperty property="res" name="DatabaseHandler"/>
</p>

	
</body>
</html>