<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
        <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
        <html>

        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB"
                crossorigin="anonymous">
            <link rel="stylesheet" href="/css/styles.css">
            <title>Products</title>
        </head>

        <body>

            <div class="container">
                <h3>Add Product</h3>
                <form:form action="/products/new" method="post" modelAttribute="product">
                    <div class="form-group">
                        <form:label path="name" class="col-form-label">Name</form:label>
                        <form:input path="name" class="form-control" />
                        <form:errors path="name" />
                    </div>
                    <div class="form-group">
                        <form:label path="description" class="col-form-label">Description</form:label>
                        <form:input path="description" class="form-control" />
                        <form:errors path="description" />
                    </div>
                    <div class="form-group">
                        <form:label path="price" class="col-form-label">Price</form:label>
                        <form:input path="price" class="form-control" />
                        <form:errors path="price" />
                    </div>
                    <input type="submit" value="Add Product" />
                </form:form>
		<a href="/products/new">Create a Product</a>
		<span> | </span>
		<a href="/categories/new">Create a Category</a>
            </div>
        </body>

        </html>