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
            <title>Dojos</title>
        </head>

        <body>
            <div class="container">
                <c:out value="${dojos}" />
            </div>

            <div class="container">
                <h3>Add a Dojo</h3>
                <form:form action="/dojos" method="post" modelAttribute="dojo">
                    <div class="form-group">
                        <form:label path="name" class="col-form-label">Name</form:label>
                        <form:input path="name" class="form-control" />
                        <form:errors path="name" />
                    </div>
                    <input type="submit" value="Add Dojo" />
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