<jsp:useBean id="a1" class="beanpack.Bean2"/>


<%--
<% a1.setMessage("welcome");%>

The message is <br>

<%=a1.getMessage()%>

--%>

using setProperty and getProperty

<br><br>

<jsp:setProperty name="a1" property="message" value="GoodBye"/>

The value is<br>
<jsp:getProperty name="a1" property="message"/>

















