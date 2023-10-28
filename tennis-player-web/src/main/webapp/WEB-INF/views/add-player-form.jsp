<%@ taglib prefix="form" uri="http://java.sun.com/jsf/html" %>
<%--
  Created by IntelliJ IDEA.
  User: hristiyanashopova
  Date: 28.10.23
  Time: 7:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Player</title>
</head>
<body>
<h2>Player Form</h2>
<hr>

<form action = "processPlayerForm" modelAttribute="athlete">
    <br><br>
    Name: <form input path="lastName"></form>

    <br><br>
    <input type="submit" value="Add Player"/>
</form>

  </body>
</html>
