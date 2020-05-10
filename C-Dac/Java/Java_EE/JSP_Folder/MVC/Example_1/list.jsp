<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>EL and Complex JavaBeans</title>
<style>
body, td {font-family:verdana;font-size:10pt;}
</style>
</head>
<body>
<h2>EL and Complex JavaBeans</h2>
<table border="1">
<c:forEach var="person" items="${mylist}">
<tr>
<td>${person.name}</td>
<td>${person.age}</td>
<td>${person.address.city}</td>
<td>${person.address.country}</td>
<td>${person.address.phoneNumber}</td>
</tr>
</c:forEach>
</table>
</body>
</html>




