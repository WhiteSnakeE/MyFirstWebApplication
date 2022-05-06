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
    <h1>Question 1:What school of witchers does Geralt belong to? </h1>
    <br>
    <br>
    <img src="<c:url value='/images/ciri.png'/>" alt=Geralt/>
    <br>
    <form:form action="Page3" modelAttribute="user">
        <%--        <form:radiobuttons path="schoolsOfWitchers" items="${user.schoolsOfWitchers}" />--%>
        Cerbin<form:radiobutton path="nameOfSword" value="0"/>
        <br><br>
        Tvedeane<form:radiobutton path="nameOfSword" value="0"/>
        <br><br>
        Zireael<form:radiobutton path="nameOfSword" value="1"/>
        <br><br>
        Evellienn<form:radiobutton path="nameOfSword" value="0"/>
        <br><br>
        <input type="submit" value="Next"/>

    </form:form>

    <br><br>
</center>



</body>


</html>