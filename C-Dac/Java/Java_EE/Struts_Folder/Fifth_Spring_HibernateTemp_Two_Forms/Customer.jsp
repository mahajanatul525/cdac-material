<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
    <%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">@import url(css/main.css);
        </style>
<style>
div.ui-datepicker
{
 margin-left:180px;
}
</style>
</head>
<s:head/>
<sj:head jquerytheme="lightness"/>
     
<body>
<h2><s:text name="title"></s:text></h2>
<s:form action="customer">
<s:textfield name="customer.name" key="name"></s:textfield>
<s:textfield name="customer.age" key="age"></s:textfield>
<s:textfield name="customer.email" key="email"></s:textfield>
<s:textfield name="customer.telephone" key="telephone"></s:textfield>
<sj:datepicker  name="customer.dob" key="dob" yearRange="1970:2000" changeMonth="true" changeYear="true"/>
<s:submit key="label.add.customer"></s:submit>
</s:form>
</body>
</html>











