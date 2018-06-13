<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Button Clicker</title>
</head>
<body>

<h1>Button Clicker</h1>
<h2>Counter: <c:out value="${count}"/></h2>
<form action="clickButton" method="get">
<input type="submit" value="Count + 1">
</form>
</body>
</html>