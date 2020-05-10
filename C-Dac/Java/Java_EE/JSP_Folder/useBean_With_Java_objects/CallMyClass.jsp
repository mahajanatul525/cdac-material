<%@page import="java.util.*"%>

<jsp:useBean id="ob1" class="beanpack.MyClass"/>

<% ArrayList a=new ArrayList(); %>

<!--
<jsp:setProperty name="ob1" property="list" value="<%=a%>"/>

-->
with different syntax

<br><br>
<jsp:setProperty name="ob1" property="list" value="<%=new ArrayList()%>"/>

the value is <br>

<jsp:getProperty name="ob1" property="list"/>