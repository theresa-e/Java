<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
		<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
		<html>

		<head>
			<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
			<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB"
			    crossorigin="anonymous">
			<link rel="stylesheet" href="/css/styles.css">
			<title>Dojo Profile</title>
		</head>

		<body>
			<div class="container text-center">
				<h1>Welcome to
					<c:out value="${dojo.name}" />!</h1>
				<h3>Ninjas:</h3>
				<table class="table">
					<thead>
						<tr>
							<th>First Name</th>
							<th>Last Name</th>
							<th>Age</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${dojo.ninjas}" var="n">
							<tr>
								<td>
									<c:out value="${n.firstName}" />
								</td>
								<td>
									<c:out value="${n.lastName}" />
								</td>
								<td>
									<c:out value="${n.age}" />
								</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
				<p>
					<a href="/dojos/new">Create Dojo</a>
				</p>
				<p>
					<a href="/ninjas/new">Create Ninja</a>
				</p>
			</div>
		</body>

		</html>