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
            <title>Add new song</title>
        </head>

        <body>
            <div class="container">
                <h3>Add New Song! </h3>
                <div class="header">
                    <a href="/songs">Dashboard</a>
                    <form action="/search" method="post">
                        <label for="">Search based on artist name: </label>
                        <input type="text" name="artistSearch">
                        <input type="submit" value = "Search">
                    </form>
                </div>          
                <form:form action="/songs" method="post" modelAttribute="song">
                    <div class="form-group">
                        <form:label path="title" class="col-form-label">Title</form:label>
                        <form:input path="title" class="form-control" />
                        <form:errors path="title" />
                    </div>
                    <p>
                        <form:label path="artist" class="col-form-label">Artist</form:label>
                        <form:input path="artist" class="form-control" />
                        <form:errors path="artist" />
                    </p>
                    <p>
                        <form:label path="rating" class="col-form-label">Rating (1-10)</form:label>
                        <form:input path="rating" type="number" class="form-control" />
                    </p>
                    <input type="submit" value="Submit" />
                </form:form>
            </div>
        </body>

        </html>