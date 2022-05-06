<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <img src="<c:url value='/images/geralt.jpg'/>" height="400" width="600" alt=Geralt/>
    <br>
    <form:form action="Page2" modelAttribute="user">
<%--        <form:radiobuttons path="schoolsOfWitchers" items="${user.schoolsOfWitchers}" />--%>
        Wolves school<form:radiobutton path="schoolsOfWitchers" value="1"/>
        <br><br>
        Griffins school<form:radiobutton path="schoolsOfWitchers" value="0"/>
        <br><br>
        Snakes school<form:radiobutton path="schoolsOfWitchers" value="0"/>
        <br><br>
        Bears school<form:radiobutton path="schoolsOfWitchers" value="0"/>
        <br><br>
        <input type="submit" value="Next"/>

    </form:form>

    <br><br>

</center>



</body>


</html>