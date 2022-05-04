<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>The witcher test</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
</head>
<body>
<center>
    <table>
        <tr>
            <th>Name</th>
            <th>Surname</th>
            <th>email</th>
        </tr>
        <c:forEach var="user" items="${allUsers}">
        <tr>
            <td>${user.name}</td>
            <td>${user.surname}</td>
            <td>${user.email}</td>
        </tr>

        </c:forEach>
    </table>


</center>



</body>


</html>