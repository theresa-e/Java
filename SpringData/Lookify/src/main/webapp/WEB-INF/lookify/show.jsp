<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB"
   crossorigin="anonymous">
   <link rel="stylesheet" href="/css/styles.css">
<title>Show</title>
</head>
<body>
	<div class="container">
	<div class="header">
		<a href="/songs">Dashboard</a>
        <form action="/search" method="post">
	        <label for="">Search based on artist name: </label>
	        <input type="text" name="artistSearch">
	        <input type="submit" value = "Search">
        </form>
	</div>
		<p>
			<strong>Title: </strong> <c:out value="${song.title}"/>
		</p>
		<p>
			<strong>Artist: </strong> <c:out value="${song.artist}"/>
		</p>
		<p>
			<strong>Rating: </strong> <c:out value="${song.rating}"/>
		</p>
	</div>
</body>
</html>