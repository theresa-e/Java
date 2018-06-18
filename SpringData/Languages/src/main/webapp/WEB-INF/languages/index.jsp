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
            <div class="container">
                <h1>All Languages:</h1>
                <table class="table">
                    <thead>
                        <th>Name</th>
                        <th>Creator</th>
                        <th>Version</th>
                        <th>Actions</th>
                    </thead>

                    <tbody>
                        <c:forEach items="${languages}" var="language">
                            <tr>
                                <td>
                                    <a href="/languages/<c:out value=" ${language.getId()} "/>">
                                        <c:out value="${language.name}" />
                                    </a>
                                </td>
                                <td>
                                    <c:out value="${language.creator}" />
                                </td>
                                <td>
                                    <c:out value="${language.currentVersion}" />
                                </td>
                                <td>
                                    <form action="/languages/${language.id}/edit" method="post">
                                        <input type="submit" value="Edit" />
                                    </form>

                                    <form action="/languages/${language.id}" method="post">
                                        <input type="hidden" name="_method" value="delete">
                                        <input type="submit" value="Delete" />
                                    </form>
                                </td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>

                <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
                    <h3>Language</h3>
                    <form:form action="/languages" method="post" modelAttribute="language">
                        <div class="form-group">
                            <form:label path="name" class="col-form-label">Name</form:label>
                            <form:input path="name" class="form-control" />
                            <form:errors path="name" />
                        </div>
                        <p>
                            <form:label path="creator" class="col-form-label">Creator</form:label>
                            <form:input path="creator" class="form-control" />
                            <form:errors path="creator" />
                        </p>
                        <p>
                            <form:label path="currentVersion" class="col-form-label">Version</form:label>
                            <form:input path="currentVersion" class="form-control" />
                            <form:errors path="currentVersion" />
                        </p>
                        <input type="submit" value="Submit" />
                    </form:form>
            </div>
        </body>

        </html>