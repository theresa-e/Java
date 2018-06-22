<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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
                    <h3 class="">Register</h3>

                    <p>
                        <form:errors path="user.*" />
                    </p>

                    <form:form method="POST" action="/registration" modelAttribute="user">
                        <p>
                            <form:label path="firstName">First Name:</form:label>
                            <form:input type="text" path="firstName" />
                        </p>
                        <p>
                            <form:label path="lastName">Last Name:</form:label>
                            <form:input type="text" path="lastName" />
                        </p>
                        <p>
                            <form:label path="email">Email:</form:label>
                            <form:input type="email" path="email" />
                        </p>
                        <p>
                            <form:label path="password">Password:</form:label>
                            <form:password path="password" />
                        </p>
                        <p>
                            <form:label path="passwordConfirmation">Password Confirmation:</form:label>
                            <form:password path="passwordConfirmation" />
                        </p>
                        <p>
                            <form:label path="passwordConfirmation">Password Confirmation:</form:label>
                            <form:select path="acctType">
                                <form:option value="host">Host</form:option>
                                <form:option value="guest">Guest</form:option>
                            </form:select>
                        </p>
                        <input type="submit" value="Register!" />
                    </form:form>

                    <h3 class="">Login</h3>
                    <p>
                        <c:out value="${error}" />
                    </p>
                    <form method="post" action="/login">
                        <p>
                            <label type="email" for="email">Email</label>
                            <input type="text" id="email" name="email" />
                        </p>
                        <p>
                            <label for="password">Password</label>
                            <input type="password" id="password" name="password" />
                        </p>
                        <input type="submit" value="Login!" />
                    </form>
            </body>

            </html>