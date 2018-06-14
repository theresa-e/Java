<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
<title>Dojo Survey</title>
</head>
<body>
    <div class="container">
        <h1>Tea Survey</h1>
        <form action="/result" method="post">
            <div class="form-group">
                <label for="student_name" class="col-form-label">Name</label>
                <input type="text" class="form-control" placeholder="First and Last Name" name="name">
            </div>
            <div class="form-group">
                <label for="location" class="col-form-label">Location</label>
                <input type="text" class="form-control" placeholder="City, State" name="location">
            </div>
            <div class="form-group">
                <label for="drink_choice">What is your favorite type of tea?</label>
                <select class="form-control" name="drink">
                    <option value="English Breakfast">English Breakfast</option>
                    <option value="Earl Grey">Earl Grey</option>
                    <option value="Green Tea">Green Tea</option>
                    <option value="Oolong">Oolong Tea</option>
                    <option value="Boba Milk Tea">Boba Milk Tea</option>
                    <option value="I only drink water... (-_-)'">I only drink water (-__-')</option>
                </select>
            </div>
            <div class="form-group">
                <label for="comments">Share why this is your favorite tea!</label>
                <textarea class="form-control" rows="3" name="comments"></textarea>
            </div>
            <button class="btn btn-primary" type="submit" value="submit">Submit</button>
        </form>
    </div>
</body>
</html>