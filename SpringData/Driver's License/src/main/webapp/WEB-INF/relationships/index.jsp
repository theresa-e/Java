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
            <title>Relationships</title>
        </head>

        <body>
            
            <div class="container">
            <h1>Driver's License</h1>
            <a href="/person/new">Create a new person</a>
            <span> | </span>
            <a href="/license/new">Create a new license</a>

                <table class="table">
                    <thead>
                        <th>First Name</th>
                        <th>Last Name</th>
                    </thead>

                    <c:forEach items="${persons}" var="p">
                        <tr>
                            <td>
                                <c:out value="${p.firstName}" />
                            </td>
                            <td>
                                <c:out value="${p.lastName}" />
                            </td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
        </body>

        </html>