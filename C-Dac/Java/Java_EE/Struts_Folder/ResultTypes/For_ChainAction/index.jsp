<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<s:form action="first">
            <s:textfield name="name" label="Enter name:" required="true"/>
            <br>
            <s:textfield name="age" label="Enter age:" required="true"/>
            <br>
           <s:submit value="send"/>
        </s:form>
            <br>
            <s:property value="name"/>
            <s:property value="age"/>
            <br>
            The request attribute is<br>
            <s:property value="#request.book"/>

</body>
</html>





