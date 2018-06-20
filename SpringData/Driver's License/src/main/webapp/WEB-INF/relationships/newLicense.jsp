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
            <title>New License</title>
        </head>

        <body>
            <div class="container">
                <h1>Add License</h1>
                <form:form action="/license/new" method="post" modelAttribute="license">
                    <form:select path="person">
    						<form:option value="0" label="Select One" />
                    		<c:forEach items="${persons}" var="p">
                    			<form:option value="${p}" label="${p.firstName} ${p.lastName}" />
  							</c:forEach>
					</form:select>
                    <div class="form-group">
                        <form:label path="state" class="col-form-label">State</form:label>
                        <form:input path="state" class="form-control" />
                        <form:errors path="state" />
                    </div>
                    <p>
                        <form:label path="expiration_date" class="col-form-label">Expiration Date</form:label>
                        <form:input path="expiration_date" class="form-control" type="date" />
                        <form:errors path="expiration_date" />
                    </p>
                    <input type="submit" value="Create" />
                </form:form>
            </div>
        </body>

        </html>