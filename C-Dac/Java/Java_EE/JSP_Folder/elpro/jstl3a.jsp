<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:forEach var="list" items="${mv}">
	<c:forEach var="m" items="${list}">
		${m}
	</c:forEach>
</c:forEach>
<c:if test="${val eq 'scott'}">
	<%out.println("User name");%>
	<jsp:include page="log.html"/>
</c:if>
<c:if test="${val eq 'tiger'}">
	<%out.println("Password");%>
	<jsp:include page="try.html"/>
</c:if>