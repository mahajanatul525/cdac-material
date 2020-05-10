<%-- 
    Document   : GuestBookEntry
    Created on : Mar 31, 2010, 1:20:56 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags"%> 

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style type="text/css">@import url(css/main.css);
        </style>
        <style> .errorMessage { color:red; }
        </style> 
    </head>
    <body bgcolor="pink">
        <table border="0" cellpadding="0" align="center" width="760">
            <tr>
                <td>
                    <table border="0" cellpadding="0" cellspacing="0" width="100%">
                        <tr>
                            <td valign="top" align="left" style="padding-right:0px;padding-left:0px;padding-bottom:0px;font:24px/30px Georgia;width:228px;color:#786e4e;padding-top:0px;height:37px;">
                                Sign the Guest Book
                            </td>
                        </tr>
                    </table>
                </td>
            </tr>
            <tr align="left" valign="top">
                <td height="20">
                    <hr/>
                    </td>
            </tr>
            <tr>
                <td>

            <s:form  action="Reg2">
                <s:label value="Enter name"/>
                <s:textfield  name="name"/>
                <s:label value="Enter address"/>
                <s:textfield  name="address"/>
                <s:label value="Enter age"/>
                <s:textfield  name="age"/>
                <s:label value="Enter email"/>
                <s:textfield  name="email"/>
                
                <s:submit/>
            </s:form>
                </td>
            </tr>
</table>
    </body>
</html>
