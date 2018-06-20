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
                    <h1>
                        <c:out value="${language.name}" />
                    </h1>
                    <p>Creator:
                        <c:out value="${language.creator}" />
                    </p>
                    <p>Version:
                        <c:out value="${language.currentVersion}" />
                    </p>
                    <a href="/languages/${language.id}/edit">Edit Book</a>
                    <form action="/languages/${language.id}" method="post">
                        <input type="hidden" name="_method" value="delete">
                        <input type="submit" value="Delete">
                    </form>
                </div>
        </body>

        </html>