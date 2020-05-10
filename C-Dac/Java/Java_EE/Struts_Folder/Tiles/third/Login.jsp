<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style type="text/css">@import url(css/main.css);
        </style>
        <style> .errorMessage { color:red; }
        </style> 
</head>
<body>
<s:form action="login">
<s:textfield name="login.logname" label="Enter Login name:"></s:textfield>
<br>
<s:password name="login.password" label="Enter password:"></s:password>
<br>
<br>
<s:submit/>
</s:form>
<br><br>
</body>
</html>
