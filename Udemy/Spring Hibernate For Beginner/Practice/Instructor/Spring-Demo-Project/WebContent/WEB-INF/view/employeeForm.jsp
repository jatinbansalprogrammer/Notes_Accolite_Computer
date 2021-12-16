<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action="processEmployee" modelAttribute="employee">
		Employee Name: <form:input path="name" />
		<br>
		Employee Id: <form:input path="eId" />
		<br>


		<form:radiobuttons path="country" items="${theCountryOptions}"/>


		<br>
		<input type="submit" value="Submit" />
	</form:form>
</body>
</html>