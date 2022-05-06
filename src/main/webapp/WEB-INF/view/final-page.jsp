<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <title>The witcher test</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
</head>
<body>
<center>
        <h1>Your result is ${user.result} of 3 </h1>
<%--        <h1>Your result is ${user.result} of 3 </h1>--%>

    <%--    <img src="geralt.jpg" alt="Geralt" width="720" height="856">--%>

        <br>
        <input type="button" value="Show all users"
               onclick="window.location.href = 'allUsers'"/>
        <c:url var = "goToStart" value="/">

        </c:url>
        <input type="button" value="New Test"
               onclick="window.location.href = '${goToStart}'"/>

        <br>
</center>



</body>


</html>