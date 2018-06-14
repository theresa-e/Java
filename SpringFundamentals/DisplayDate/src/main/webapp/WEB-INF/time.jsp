<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Time</title>
<link rel="stylesheet" type="text/css" href="css/stylesTime.css">
<script type="text/javascript" src="js/scriptTime.js"></script>
</head>
<body>
	<h1>The current time is:</h1>
	<h3 class="time"><fmt:formatDate dateStyle="long" type="time" value="${date}"/></h3>
</body>
</html>