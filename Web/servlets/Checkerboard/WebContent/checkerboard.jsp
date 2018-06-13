<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" media="screen" href="resources/css/styles.css" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Checkerboard</title>
<style>

</style>
</head>

<body>
	<h1>Checkerboard</h1>

	<%int heightAsInt = Integer.valueOf(request.getParameter("height")); %>
	<%int widthAsInt = Integer.valueOf(request.getParameter("width")); %>
	
	<h1>Height: <%= heightAsInt %></h1>
	<h1>Width: <%= widthAsInt %></h1>
	<% for(int i = 0; i<heightAsInt; i++){%>
		<div class="row">
		<% if (i % 2 == 0){ %>
			<% for (int j = 0; j<widthAsInt; j++){ %>
		        <div class="even-square"></div>
				<div class="odd-square"></div>
			<%}%>
		<%} else {%>
			<% for (int k = 0; k<widthAsInt; k++){ %>
				<div class="odd-square"></div>
	        	<div class="even-square"></div>
			<%}%>
		<%}%>
		</div>
	<%}%>
</body>
</html>