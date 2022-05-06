<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>The witcher test</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
</head>
<body>
<center>
    <img src="<c:url value='/images/geralt3.jpg'/>" alt=Geralt/>
    <h1>Question 3: Who is Letho of Gulet?  </h1>
    <br>
    <br>
    <br>
    <form:form action="result" modelAttribute="user">
        <%--        <form:radiobuttons path="schoolsOfWitchers" items="${user.schoolsOfWitchers}" />--%>
        Elf<form:radiobutton path="lethoOfGulet" value="0"/>
        <br><br>
        Wizard<form:radiobutton path="lethoOfGulet" value="0"/>
        <br><br>
        King<form:radiobutton path="lethoOfGulet" value="0"/>
        <br><br>
        Witcher<form:radiobutton path="lethoOfGulet" value="1"/>
        <br><br>
        <input type="submit" value="Next"/>

    </form:form>

    <br><br>
</center>



</body>


</html>