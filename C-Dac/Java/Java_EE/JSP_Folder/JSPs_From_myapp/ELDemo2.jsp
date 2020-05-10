<%
String arr[]=request.getParameterValues("animals");
for(int i=0;i<arr.length;i++)
{
	out.println(arr[i]+"<br>");
}
%>

<br>

using EL

${paramValues.animals}
