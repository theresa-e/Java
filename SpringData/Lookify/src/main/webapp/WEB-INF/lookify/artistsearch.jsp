<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
        <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
        <html>

        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB"
                crossorigin="anonymous">
            <link rel="stylesheet" href="/css/styles.css">
            <title>Song</title>
        </head>

        <body>
            <div class="container">
                <h1>Lookify</h1>
                <div class="header">
                    <a href="/songs">Dashboard</a>
                    <form action="/search" method="post">
                        <label for="">Search based on artist name: </label>
                        <input type="text" name="artistSearch">
                        <input type="submit" value = "Search">
                    </form>
                </div>
                <table class="table">
                    <thead>
                        <th>Song Title</th>
                        <th>Artist</th>
                        <th>Rating</th>
                        <th>Action</th>
                    </thead>

                    <tbody>
                        <c:forEach items="${results}" var="r">
                            <tr>
                                <td>
                                    <a href="/songs/${r.getId()}" />
                                    <c:out value="${r.title}" />
                                    </a>
                                </td>
                                <td>
                                    <c:out value="${r.artist}" />
                                </td>
                                <td>
                                    <c:out value="${r.rating}" />
                                </td>
                                <td>
                                    <form action="/songs/${r.id}" method="post">
                                        <input type="hidden" name="_method" value="delete">
                                        <input type="submit" value="Delete" />
                                    </form>
                                </td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
        </body>

        </html>