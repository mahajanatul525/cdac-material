<%
if(session.isNew())
{
	out.println("session is new");
	session.setAttribute("book","java");
}
else
{
	out.println("not new");
	out.println("<br>"+session.getAttribute("book"));
}

%>