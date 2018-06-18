<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
        <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
        <html>

        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB"
                crossorigin="anonymous">
            <title>Languages</title>
        </head>

        <body>
            <%@ page isErrorPage="true" %>
                <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

                    <div class="container">
                        <h1>Edit Book</h1>
                        <form:form action="/languages/${language.id}" method="post" modelAttribute="language">
                            <input type="hidden" name="_method" value="put">
                            <p>
                                <form:label path="name" class="col-form-label">Name</form:label>
                                <form:input path="name" class="form-control" />
                                <form:errors path="name" />
                            </p>
                            <p>
                                <form:label path="creator" class="col-form-label">Creator</form:label>
                                <form:input path="creator" class="form-control" />
                                <form:errors path="creator" />
                            </p>
                            <p>
                                <form:label path="currentVersion" class="col-form-label">Version</form:label>
                                <form:input path="currentVersion" class="form-control" />
                                <form:errors path="currentVersion" />
                                <input type="submit" value="Submit" />
                                <a href="/languages">Go back</a>
                        </form:form>
                    </div>
        </body>

        </html>