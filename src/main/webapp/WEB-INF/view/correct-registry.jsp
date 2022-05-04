<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>The witcher test</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
</head>
<body>
<center>
    <h1> You have successfully registered! </h1>
    <br>
    <h2>You may start the test or change your details</h2>
    <br>

    <c:url var = "ChangeDetails" value="/update">
        <c:param name="userId" value="${user.id}"/>
    </c:url>

    <input type="button" value="ChangeDetails"
           onclick="window.location.href = '${ChangeDetails}'"/>
    <input type="button" value="Show all users"
           onclick="window.location.href = 'allUsers'"/>


</center>

</body>


</html>