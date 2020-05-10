<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<s:head/>
</head>
<body>
<h2><s:text name="title"></s:text></h2>
<s:form action="login">
<s:textfield name="login.logname" key="logname"></s:textfield>
<s:password name="login.password" key="password"></s:password>
<s:password name="login.confirmpass"></s:password>
<s:submit key="label.add.login"></s:submit>
</s:form>
</body>
</html>