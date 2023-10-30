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
    <style>
        .error {
            color:red;
            font-style: italic;
        }
    </style>
</head>
<body>
<h2>Player Form</h2>
<hr>
<form action = "processPlayerForm" modelAttribute="athlete">
    <br><br>
    <form action = "processPlayerForm" modelAttribute="athlete">
        <br><br>
        First Name: <form input path = "firstName"></form>
        <br><br>
        Last Name *: <form input path = "lastName"></form>
        <form errors path= "lastName" cssClass="error"></form>
        <!-- rest of the code -->
<%--    </form>--%>
<%--    Name: <form input path = "lastName"/>--%>
<%--    <form errors path="lastName" cssClass="error"/>--%>
        Current Rank *: <form input path = "rank"></form>
        <form errors path= "rank" cssClass="error"></form>
        Last Won (dd-mm-yyyy):<form input path="lastWon"></form>
        <form errors path="lastWon" cssClass="error"></form>
    <select name="playerCountry">
        <option>Australia</option>
        <option>France</option>
        <option>Serbia</option>
        <option>Switzerland</option>
        <option>United States of America</option>
    </select>
   Country:  <formselect path="country">
        <formoption value="AUT" label="Austria"></formoption>
        <formoption value="FRA" label="France"></formoption>
        <formoption value="SRB" label="Serbia"></formoption>
        <formoption value="SUI" label="Switzerland"></formoption>
        <formoption value="USA" label="United States of America"></formoption>
    </formselect>
    Grand Slam Titles Won:
    Australian Open <formcheckbox path="grandSlams" value="Australian Open"></formcheckbox>
    French Open <formcheckbox path="grandSlams" value="French Open"></formcheckbox>
    Wimbledon <formcheckbox path="grandSlams" value="Wimbledon"></formcheckbox>
    US Open <formcheckbox path="grandSlams" value="US Open"></formcheckbox>
    <br><br>
        Prize Money (USD):<form input path="prizeMoney" placeholder="＄#,###,###"></form>
        <form errors path="prizeMoney" cssClass="error"></form>
        <br><br>
    <input type="submit" value="Add Player"/>
</form>
</body>
</html>
