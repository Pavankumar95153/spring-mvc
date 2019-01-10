<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!Doctype Html>

<html>

<head>
<title>
Student registration form </title>
</head>

<body>

<form:form action="processform" modelattribute ="student">
First name:<form:input path="firstname" />
<br><br>
Last name:<form:input path="lastname"/>
<br><br>

<form:select path="Country">
<form:option value ="India" label ="India"/>

<form:option value ="Braz" label ="Brazil"/>

</form:select>

<input type="submit" value ="Submit" />

</form:form>

</body>
</html>