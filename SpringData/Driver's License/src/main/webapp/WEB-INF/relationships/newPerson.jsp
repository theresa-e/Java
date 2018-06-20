<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB"
    crossorigin="anonymous">
<link rel="stylesheet" href="/css/styles.css">
<title>New Person</title>
</head>
<body>
    <div class="container"><c:out value="${persons }"/>
        <h1>Add a person</h1>
        <form:form action="/person/new" method="post" modelAttribute="person">
            <div class="form-group">
                <form:label path="firstName" class="col-form-label">First Name</form:label>
                <form:input path="firstName" class="form-control" />
                <form:errors path="firstName" />
            </div>
            <p>
                <form:label path="lastName" class="col-form-label">Last Name</form:label>
                <form:input path="lastName" class="form-control" />
                <form:errors path="lastName" />
            </p>
            <input type="submit" value="Create" />
        </form:form>
    </div>
</body>
</html>