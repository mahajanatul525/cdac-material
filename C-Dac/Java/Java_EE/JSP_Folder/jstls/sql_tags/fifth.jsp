<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<html>
<head>
<title>JSTL sql:setDataSource Tag</title>
</head>
<body>

<sql:update dataSource="mypool" var="count">
insert into dept values(?,?,?);
<sql:param value="8"/>
<sql:param value="iii"/>
<sql:param value="ttt"/>
</sql:update>

<br>
no.of rows updated

${count}
</body>


