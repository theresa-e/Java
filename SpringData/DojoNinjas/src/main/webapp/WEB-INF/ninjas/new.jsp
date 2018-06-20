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
                <title>New Ninja</title>
            </head>

            <body>
                <div class="container">
                    <h1>Add New Ninja</h1>
                    <form:form action="/ninjas" method="post" modelAttribute="ninja">
                        <form:select path="dojo">
                            <form:option value="0" label="Select One" />
                            <c:forEach items="${allDojos}" var="d">
                                <form:option value="${d.id}" label="${d.name}" />
                            </c:forEach>
                        </form:select>
                        <div class="form-group">
                            <form:label path="firstName" class="col-form-label">First Name</form:label>
                            <form:input path="firstName" class="form-control" />
                            <form:errors path="firstName" />
                        </div>
                        <div class="form-group">
                            <form:label path="lastName" class="col-form-label">Last Name</form:label>
                            <form:input path="lastName" class="form-control" />
                            <form:errors path="lastName" />
                        </div>
                        <div class="form-group">
                            <form:label path="age" class="col-form-label">Age</form:label>
                            <form:input path="age" class="form-control" />
                            <form:errors path="age" />
                        </div>
                        <input type="submit" value="Create" />
                    </form:form>
                    <p>
                        <a href="/dojos/new">Create Dojo</a>
                    </p>
                    <p>
                        <a href="/ninjas/new">Create Ninja</a>
                    </p>
                </div>
            </body>

            </html>