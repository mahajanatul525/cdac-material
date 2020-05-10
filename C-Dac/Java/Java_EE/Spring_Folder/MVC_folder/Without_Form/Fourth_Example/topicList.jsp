<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Topics Available are</h1>
	<table border="1">
	<tr>
		<th align="left">Topic Name</th>
	</tr>
	<c:forEach items="${topicList}" var="topic">
		<tr>
			<td> ${topic}</td>
		</tr>
	</c:forEach>	
	</table>
	<br><br>
	<a href="module.html">Go Back to module selection</a>
</body>
</html>
