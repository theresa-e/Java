<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Show Book</title>
</head>
<body>
	<h1>
		<c:out value="${book.title}"/>
	</h1>
	<p>Description: 
		<c:out value="${book.description}"/>
	</p>
	<p>Language: 
		<c:out value="${book.language}"/>
	</p>
	<p>Number of Pages: 
		<c:out value="${book.numberOfPages}"/>
	</p>
	<a href="/books/${book.id}/edit">Edit Book</a>
	<form action="/books/${book.id}" method="post">
    	<input type="hidden" name="_method" value="delete">
    	<input type="submit" value="Delete">
	</form>
</body>
</html>