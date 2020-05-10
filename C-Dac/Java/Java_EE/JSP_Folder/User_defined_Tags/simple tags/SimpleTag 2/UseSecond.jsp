<%@taglib prefix="abc" uri="/WEB-INF/hello.tld"%>
Before tag starts
<br><b>
<abc:second>i am a body</abc:second>
</b><br>
After tag
<br>
<abc:second/>
<br>
<%-- Following will not be allowed
<abc:second><%="hello world"%></abc:second>
--%>

<%-- Following will be allowed --%>
<abc:second><b>${20*5}</b></abc:second>
