<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
<title>Dojo Survey</title>
</head>
<body>
    <div class="container">
        <h1>Submitted Info</h1>
        <p><strong>Name:</strong></p>
        <p><c:out value="${name}"/>></p>
        <p><strong>Location:</strong></p>
        <p><c:out value="${location}"/></p>
        <p><strong>Favorite Type of Tea:</strong></p>
        <p><c:out value="${drink}"/></p>
        <p><strong>Comments:</strong></p>
        <p><c:out value="${comments}"/></p>
    	<a href="/" class="btn btn-primary">Go back</a>
    </div>
</body>
</html>