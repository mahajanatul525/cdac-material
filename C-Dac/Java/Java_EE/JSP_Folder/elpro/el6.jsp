<%@page import="java.util.*"%>
<%
	Vector v=new Vector();
	v.addElement("hello");
	v.addElement(new Integer(100));
	v.addElement(new Boolean(true));

	request.setAttribute("myvect",v);
%>
<br>
${myvect}
<br>
${myvect[0]} 
<br>	
${myvect[2]}

<%
	HashMap m=new HashMap();
	m.put("first","hello");
	m.put("second",new Integer(100));
	m.put("third",new Boolean(true));
	request.setAttribute("hm",m);
%>
<br>
${hm}
<br>
${hm["first"]}
<br>
${hm.first}
<br>
${hm["third"]}
<br>
${hm.second}
<br>









