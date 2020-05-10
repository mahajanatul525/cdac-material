<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<s:form action="go">
<s:textfield name="name" label="Enter your name:"></s:textfield>
<br>
<s:textfield name="age" label="Enter your age:"></s:textfield>
<br><br>
<s:submit/>
</s:form>
<br><br>
 <b><s:property value="name"/></b>
 <br>
 <s:property value="age"/>
</body>
</html>











