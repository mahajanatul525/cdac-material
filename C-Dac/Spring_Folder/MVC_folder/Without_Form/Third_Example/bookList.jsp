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
<h1>Books Available with us are</h1>
	<table border="1">
	<tr>
		<th align="left">Publisher Name</th>
		<th align="left">Book Name</th>
		<th align="left">Price</th>
	</tr>
	<c:forEach items="${mylist}" var="book">
		<tr>
			<td> ${book.publisher.publisherName}</td>
			<td> ${book.bookName}</td>
			<td> ${book.price}</td>
		</tr>
	</c:forEach>	
	</table>
</body>
</html>




