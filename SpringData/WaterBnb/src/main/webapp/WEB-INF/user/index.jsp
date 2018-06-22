<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
    <div class="container text-center">
        <div class="header">
           <a href="/login">Register or Login</a> 
        </div>
        <h3>WaterBnB</h3>
        <form action="">
            <p>Search for your next WaterBnB!</p>
            <input type="text"/>
            <input type="submit" value="Search"/>
        </form>
    </div>
</body>
</html>


