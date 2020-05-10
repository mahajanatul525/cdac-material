<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<html>
<head>
<title>JSTL sql:setDataSource Tag</title>
</head>
<body>
 <sql:setDataSource var="snapshot" driver="com.mysql.jdbc.Driver"
     url="jdbc:mysql://localhost/mydb"
     user="root"  password="root"/>

<sql:query dataSource="${snapshot}" sql="select * from dept" var="result" />
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
 done
</body>


