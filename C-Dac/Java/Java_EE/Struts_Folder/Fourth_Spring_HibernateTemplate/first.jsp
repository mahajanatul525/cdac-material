<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<html>
 <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style type="text/css">@import url(css/main.css);
        </style>
        <style> .errorMessage { color:red; }
        </style> 
   </head>
 <sj:head jquerytheme="lightness"/>
 
<body>
<s:form action="go">
<s:textfield name="person.name" label="Enter your name:"></s:textfield>
<br>
 <sj:datepicker name="person.dob" label="Enter Dob:" yearRange="1970:2012" changeMonth="true" changeYear="true"/>
<br>
<s:textfield name="person.address" label="Enter address:"></s:textfield>
<br>
<s:submit/>
</s:form>
<br><br>
 
</body>
</html>








