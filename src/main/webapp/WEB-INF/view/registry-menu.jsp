<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <title>Registry</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
</head>
<body>
<center>
<form:form action="registryDone" modelAttribute="user">

    <form:hidden path="id"/>

    Name: <form:input path="name"/>
        <p style="color:red">
            <form:errors path="name"/>
        </p>
    <br><br>
    Surname: <form:input path="surname"/>
        <p style="color:red">
            <form:errors path="surname"/>
        </p>
    <br><br>
    Email: <form:input path="email"/>
        <p style="color:red">
            <form:errors path="email"/>
        </p>
    <br><br>
    <input type="submit" value="OK">

</form:form>
</center>
</body>
</html>