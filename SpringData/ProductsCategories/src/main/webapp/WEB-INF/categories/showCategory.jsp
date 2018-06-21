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
<title>Category Page</title>
</head>
<body>
	<div class="container">
		<h2><c:out value="${category.name}"/></h2>
		<h4>Products in this category:</h4>
		<ul>
			<c:forEach items="${category.products}" var="c">
				<li>
					<c:out value="${c.name}" />
				</li>
			</c:forEach>
		</ul>
		<h4>Add Product:</h4>
		<form action="/categories/${category.id}" method="post" modelAttribute="category">
			<select name="productId">
				<option value="0" label="Select One" />
					<c:forEach items="${allProds}" var="p">
						<option value="${p.id}" label="${p.name}" />
					</c:forEach>
			</select>
		<input type="submit" value="Add category" />
		</form>
		<a href="/products/new">Create a Product</a>
		<span> | </span>
		<a href="/categories/new">Create a Category</a>
	</div>
</body>
</html>