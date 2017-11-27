<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body >
<%
System.out.println("Registration jsp opened");
System.out.println("Ended time   "+System.nanoTime());
System.out.println("Time takento read and dispaly those values are = "+(System.nanoTime()-(long)request.getAttribute("startTime"))); 
%>
<h1 align="center">Welcome To Registration Here</h1>
<form>
CITY:     <select id="cites">
<c:forEach items="${cities}" var="city">
<option value=${city}>${city}</option>
</c:forEach>
</select><br><br>
STATE    :<select id="state">
<c:forEach items="${states}" var="state">
<option value=${state}>${state}</option>
</c:forEach>
</select><br><br>
COUNTRY  :<select id="country">
<c:forEach items="${country}" var="country">
<option value=${country}>${country}</option>
</c:forEach>
</select>
</form>
</body>
</html>