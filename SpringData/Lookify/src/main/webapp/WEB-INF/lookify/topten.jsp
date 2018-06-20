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
<title>Show</title>
</head>
<body>
            <div class="container">
                <h4>Top Ten Songs</h4>
                <div class="header">
                	<a href="/songs/new">Add New Song</a>
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
                    </thead>

                    <tbody>
                        <c:forEach items="${topSongs}" var="songs">
                            <tr>
                                <td>
                                   <a href="/songs/${songs.id}"><c:out value="${songs.title}" /></a>
                                </td>
                                <td>
                                    <c:out value="${songs.artist}" />
                                </td>
                                <td>
                                    <c:out value="${songs.rating}" />
                                </td>
                                <td>
                                </td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
</body>
</html>