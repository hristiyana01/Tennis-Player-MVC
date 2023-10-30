<%--
  Created by IntelliJ IDEA.
  User: hristiyanashopova
  Date: 28.10.23
  Time: 8:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Player Confirmation</title>
</head>
<body>
<h2>Player Confirmation</h2>
<hr>

<br><br>
The player has been added.

<br><br>
<b>Name</b> : ＄{athlete.firstName}
            ＄{athlete.lastName}
<br><br>
Country : ＄{athlete.country}

<br><br>
Handedness: ${athlete.setHandedness}

Grand Slam Titles :
<ul>
    <c:forEach items="＄{athlete.grandSlams}" var="title">
        <li>＄{title}</li>
    </c:forEach>
</ul>
<b>Current Rank</b> : ＄{athlete.rank}
</body>
</html>
