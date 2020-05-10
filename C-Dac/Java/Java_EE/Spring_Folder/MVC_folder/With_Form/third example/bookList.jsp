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
<h1>Books Available are</h1>
	<table border="1">
	<tr>
		<th align="left">Book Name</th>
		<th align="left">Price</th>
		<th align="left">Publisher Name</th>
	</tr>
	
		<tr>
			<td> ${mybook.bookName}</td>
			<td> ${mybook.price}</td>
			<td> ${mybook.publisher}</td>
		</tr>
	</table>
	<br><br>
	${mybook}
	<br><br><br>
	<a href="new_book.do">Add More Books</a>
</body>
</html>



