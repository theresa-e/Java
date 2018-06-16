<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="css/styles.css">
<title>Ninja Gold</title>
</head>
<body>
    <div class="container">
        <h1 class="text-center">Ninja Gold</h1>
        <div class="current-total">
            <h5 class="text-center">Your Gold:
                <span><c:out value="${totalCount}"/></span>
            </h5>
        </div>
        <div class="row">
            <div class="navigation col-3 text-center">
                <h3>Farm</h3>
                <p>Earn 10-20 gold</p>
                <form action="/submit" method="post">
                    <input type="hidden" name="building" value="farm" />
                    <input type="submit" class="btn btn-warning" value="Find Gold!" />
                </form>
            </div>
            <div class="navigation col-3 text-center">
                <h3>Cave</h3>
                <p>Earn 5-10 gold</p>
                <form action="/submit" method="post">
                    <input type="hidden" name="building" value="cave" />
                    <input type="submit" class="btn btn-warning" value="Find Gold!" />
                </form>
            </div>
            <div class="navigation col-3 text-center">
                <h3>House</h3>
                <p>Earn 2-5 gold</p>
                <form action="/submit" method="post">
                    <input type="hidden" name="building" value="house" />
                    <input type="submit" class="btn btn-warning" value="Find Gold!" />
                </form>
            </div>
            <div class="navigation col-3 text-center">
                <h3>Casino</h3>
                <p>Earn/lose 10-20 gold</p>
                <form action="/submit" method="post">
                    <input type="hidden" name="building" value="casino" />
                    <input type="submit" class="btn btn-warning" value="Find Gold!" />
                </form>
            </div>
        </div>
        <div class="row">
            <div class="player-status col-12">
     			<c:forEach items="${currentStatus}" var="status">
     				<p><c:out value="${status}"/></p>
     			</c:forEach>
            </div>
        </div>
    </div>
</body>
</html>