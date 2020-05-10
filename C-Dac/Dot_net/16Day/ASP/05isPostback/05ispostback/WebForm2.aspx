<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="WebForm2.aspx.cs" Inherits="_05ispostback.WebForm2" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
    <div>
    <table style="font-family: Arial">
    <tr>
        <td colspan = "2"><b>Employee Details Form</b></td>
    </tr>
    <tr>
        <td>First Name: </td>
        <td> <asp:TextBox ID="TextBox1" runat="server" EnableViewState="False"></asp:TextBox> </td>
    </tr>
    <tr>
        <td>Last Name: </td>
        <td> <asp:TextBox ID="TextBox2" runat="server"></asp:TextBox> </td>
    </tr>
    <tr>
        <td>City:</td>
        <td>
            <asp:DropDownList ID="ddlCity" runat="server" 
                onselectedindexchanged="ddlCity_SelectedIndexChanged"  EnableViewState="True">
            </asp:DropDownList>
        </td>
    </tr>
    <tr>
        <td></td>
        <td>
            <asp:Button ID="Button1" runat="server" onclick="Button1_Click" 
                Text="Register Employee" />
        </td>
    </tr>
</table>
    </div>
        <asp:TextBox ID="TextBox3" runat="server" AutoPostBack="True" EnableViewState="False"></asp:TextBox>


    </form>
</body>
</html>
