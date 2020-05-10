<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<html>
<head>
<title>JSTL sql:setDataSource Tag</title>
</head>
<body>

<sql:query dataSource="mypool" sql="select * from dept" var="result" />
no of rows are <br>
${result.rowCount}
<br><br>
<c:if test="${result.rowCount>0}">
no of records are greater than 0
</c:if>
<br><br>

<c:choose>
	<c:when test="${result.rowCount==0}">
		there are no rows
	</c:when>
	<c:otherwise>
		rows are greater than 0
	</c:otherwise>
</c:choose>
<br><br>
jstl tag using Connection Pool
<br><br><br>
<table border=4>
<c:forEach var="row" items="${result.rows}">
<tr><td width=50>
${row.deptno}
</td>
<td width=50>
${row.dname}
</td>
<td width=50>
${row.loc}
</td>
</tr>
</c:forEach>
</table>
<br><br><br>

</body>


