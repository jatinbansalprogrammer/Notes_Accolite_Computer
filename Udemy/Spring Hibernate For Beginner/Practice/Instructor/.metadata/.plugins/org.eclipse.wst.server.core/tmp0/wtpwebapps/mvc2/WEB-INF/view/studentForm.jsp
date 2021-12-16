<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Form</title>
</head>
<body>
	<h1>Welcome To Form</h1>
	
	<form:form action="processStudentForm" modelAttribute="student" method="GET">
		Name: <form:input path="name" /> <%-- value="${student.name}" --%>
		<br><br>
		Age:  <form:input path="age"/>
		<br><br>
		
		<form:select path="address.country">
			<form:options items="${countryOptions}"></form:options>
		</form:select>
		
		<%-- 
		Java <form:radiobutton path="favoriteLanguage" value="java"/>
		Go<form:radiobutton path="favoriteLanguage" value="go"/>
		Ruby <form:radiobutton path="favoriteLanguage" value="ruby"/> --%>
		
		<form:radiobuttons path="favoriteLanguage" items="${favoriteLanguages}"/>
		
		<input type="submit" />
	</form:form>
</body>
</html>