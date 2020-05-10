<%@page session="false"%>

<%
HttpSession session=request.getSession(false);
if(session==null)
{
	out.println("session does not exists");
}
else
{
	out.println("<br>"+session.getAttribute("book"));
}

%>