﻿<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="WebForm1.aspx.cs" Inherits="_25dynamiccontroll.WebForm1" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
   
    <div style="font-family: Arial">
    <table>
    <tr>
        <td><b>Control Type</b></td>
        <td>
            <asp:CheckBoxList ID="chkBoxListControlType" runat="server" 
RepeatDirection="Horizontal">
                <asp:ListItem Text="Label" Value="Label"></asp:ListItem>
                <asp:ListItem Text="TextBox" Value="TextBox"></asp:ListItem>
                <asp:ListItem Text="Button" Value="Button"></asp:ListItem>
            </asp:CheckBoxList>
        </td>
        <td><b>How Many</b></td>
        <td>
            <asp:TextBox ID="txtControlsCount" runat="server" Width="40px"></asp:TextBox>
        </td>
        <td>
            <asp:Button ID="btnGenerateControl" runat="server" Text="Generate Controls" 
                onclick="btnGenerateControl_Click" />
        </td>
    </tr>
    <tr>
        <td colspan="5">
            <h3>Label Controls</h3>
        </td>
    </tr>
    <tr>
        <td colspan="5">
            <asp:Panel ID="pnlLabels" runat="server">
            </asp:Panel>
            <%--<asp:PlaceHolder ID="phLabels" runat="server">
            </asp:PlaceHolder>--%>
        </td>
    </tr>
    <tr>
        <td colspan="5">
            <h3>TextBox Controls</h3>
        </td>
    </tr>
    <tr>
        <td colspan="5">
            <asp:Panel ID="pnlTextBoxes" runat="server">
            </asp:Panel>
            <%--<asp:PlaceHolder ID="phTextBoxes" runat="server">
            </asp:PlaceHolder>--%>
        </td>
    </tr>
    <tr>
        <td colspan="5">
            <h3>Button Controls</h3>
        </td>
    </tr>
    <tr>
        <td colspan="5" >
            <asp:Panel ID="pnlButtons" runat="server">
            </asp:Panel>
            <%--<asp:PlaceHolder ID="phButtons" runat="server">
            </asp:PlaceHolder>--%>
        </td>
    </tr>
    </table>        
</div> 
  
    </form>
</body>
</html>
