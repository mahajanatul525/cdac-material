<%@page contentType="text/html;charset=UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
</head>

<body>
<h1>Struts 2 localization example</h1>

<s:form action="validateUser">

        <s:textfield key="global.username" name="username"/>
        <s:password key="global.password" name="password"/>     
        <s:submit key="global.submit" name="submit"/>

</s:form>

<s:url id="localeEN"  action="locale">
   <s:param name="request_locale">en</s:param>
</s:url>

<s:url id="localeDE" action="locale">
   <s:param name="request_locale">de</s:param>
</s:url>
<s:url id="localeFR"  action="locale">
   <s:param name="request_locale">fr</s:param>
</s:url>

<s:a href="%{localeEN}">English</s:a>
<s:a href="%{localeDE}">German</s:a>
<s:a href="%{localeFR}">France</s:a>

</body>
</html>