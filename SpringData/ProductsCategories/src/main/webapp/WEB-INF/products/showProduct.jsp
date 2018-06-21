<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
		<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
			<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
			<html>

			<head>
				<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
				<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB"
				    crossorigin="anonymous">
				<link rel="stylesheet" href="/css/styles.css">
				<title>Product Page</title>
			</head>

			<body>
				<div class="container">
					<h2>
						<c:out value="${product.name}" />
					</h2>
					<h4>Details:</h4>
					<p>Price: $
						<c:out value="${product.price}" />
					</p>
					<p>Description:
						<c:out value="${product.description}" />
					</p>
					<h4>Categories that this product belongs to:</h4>
					<c:forEach items="${product.categories}" var="c">
						<p>
							<c:out value="${c.name}" />
						</p>
					</c:forEach>
					<p>Add a category:</p>
					<form action="/products/${product.id}" method="post" modelAttribute="product">
						<select name="categoryId">
							<option value="0" label="Select One" />
							<c:forEach items="${allCategs}" var="c">
								<option value="${c.id}" label="${c.name}" />
							</c:forEach>
						</select>
						<input type="submit" value="Add category" />
					</form>
				</div>
			</body>

			</html>