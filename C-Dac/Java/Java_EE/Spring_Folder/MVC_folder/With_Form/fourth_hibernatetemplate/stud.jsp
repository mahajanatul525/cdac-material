<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Entry</title>
</head>
<body>
<h1>Add New Student</h1>
<form:form method="post" commandName="mystudent">
Student Name:<br>
<form:input path="name"/> <br><br>
Age:<br><br>
<form:input path="age"/><br><br>
<input type=submit value="Add_Student"/>
</form:form>	
</body>
</html>







