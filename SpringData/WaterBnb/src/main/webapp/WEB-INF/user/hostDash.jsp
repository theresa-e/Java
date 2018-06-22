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
                <title>WaterBnB</title>
            </head>
            <style>
                .header {
                    display: flex;
                    flex-direction: row-reverse;
                }
            </style>

            <body>
                <div class="container ">
<div class="header">
    <a href="/logout">Logout</a>
</div>
                    <h3 class="text-center">Welcome
                        <c:out value="${user.firstName}" /> </h3>

                    <h4>
                        <c:out value="${user.firstName}" />'s Listings:</h4>
                    <table class="table">
                        <thead>
                            <tr>
                                <th>Address</th>
                                <th>Price</th>
                                <th>Pool Size</th>
                                <th>Description</th>
                                <th>Action</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach items="${userListings}" var="l">
                                <tr>
                                    <td>
                                        <c:out value="${l.address}" />
                                    </td>
                                    <td>
                                        <c:out value="${l.price}" />
                                    </td>
                                    <td>
                                        <c:out value="${l.poolSize}" />
                                    </td>
                                    <td>
                                        <c:out value="${l.description}" />
                                    </td>
                                    <td>
                                        Delete | Edit
                                    </td>
                            </tr>
                            </c:forEach>
                        </tbody>
                    </table>

                    <h3>Add a new listing:</h3>
                    <form:form action="/host" method="POST" modelAttribute="listing">
                        <div class="form-group">
                            <form:label path="address" class="col-form-label">Address: </form:label>
                            <form:input path="address" class="form-control" />
                            <form:errors path="address" />
                        </div>
                        <div class="form-group">
                            <form:label path="poolSize" class="col-form-label">Pool Size:</form:label>
                            <form:select path="poolSize">
                                <form:option value="small">Small</form:option>
                                <form:option value="medium">Medium</form:option>
                                <form:option value="large">Large</form:option>
                            </form:select>
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
                        <input type="hidden" name="userId" value="${user.id}">
                        <input type="submit" value="Create Listing" />
                    </form:form>

                </div>
            </body>

            </html>