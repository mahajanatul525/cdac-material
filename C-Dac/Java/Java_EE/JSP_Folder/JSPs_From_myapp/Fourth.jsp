<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<html>
<head>
<title>JSTL sql:setDataSource Tag</title>
</head>
<body>

<sql:update dataSource="mypool" var="count">
insert into dept values(7,'jjj','kkk');
</sql:update>

<br>
no.of rows updated

${count}
</body>


