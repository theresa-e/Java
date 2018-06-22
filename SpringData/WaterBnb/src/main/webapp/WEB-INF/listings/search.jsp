<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

    <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
    <html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB"
            crossorigin="anonymous">
        <link rel="stylesheet" href="/css/styles.css">
        <title>WaterBnB</title>
    </head>
    <style>
        .header {
            display: flex;
            flex-direction: row-reverse;
        }
    </style>

    <body>
        <div class="container ">
            <div class="header">
                <a href="/logout">Logout</a>
            </div>
            <h3 class="text-center">WaterBnB</h3>
            <table class="table">
                <thead>
                    <tr>
                        <th>Address</th>
                        <th>Price</th>
                        <th>Pool Size</th>
                        <th>Description</th>
                        <th>Action</th>
                    </tr>
                </thead>
                <tbody>
                <c:forEach items="${allListings}" var="l">
                        <tr>
                            <td>
                                <c:out value="${l.address}" />
                            </td>
                            <td>
                                <c:out value="${l.price}" />
                            </td>
                            <td>
                                <c:out value="${l.poolSize}" />
                            </td>
                            <td>
                                <c:out value="${l.description}" />
                            </td>
                            <td>
                                Delete | Edit
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
            <form action="">
                <span>Search by location</span>
                <input type="text" />
                <input type="submit" value="Search" />
            </form>


        </div>
    </body>

    </html>