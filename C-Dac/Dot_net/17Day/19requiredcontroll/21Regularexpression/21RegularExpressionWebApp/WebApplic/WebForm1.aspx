<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="WebForm1.aspx.cs" Inherits="WebApplic.WebForm1" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
    <div>
    <table>
    <tr>
    <td>Email</td>
    <td>
    <asp:TextBox ID="txtEmail" runat="server" Width="150px">
</asp:TextBox>
<asp:RegularExpressionValidator ID="RegularExpressionValidatorEmail" runat="server" 
ControlToValidate="txtEmail" ValidationExpression="\w+([-+.']\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*"
ErrorMessage="Invalid Email" ForeColor="Red"></asp:RegularExpressionValidator> 
    </td>    </tr>     <tr>
    <td>userID</td>    <td>
    <asp:TextBox ID="userId" runat="server" Width="150px">
</asp:TextBox>
<asp:RegularExpressionValidator ID="RegularExpressionValidator1" runat="server" 
ControlToValidate="userId" ValidationExpression="\w{8,15}"
ErrorMessage="UserID min length is 8 and max length is 12" ForeColor="Red"></asp:RegularExpressionValidator> 
    </td>
    
    </tr>
        <tr>
    <td>Mobile:</td>
    <td>
    <asp:TextBox ID="TextBox3" runat="server" Width="150px">
</asp:TextBox>
<asp:RegularExpressionValidator ID="RegularExpressionValidator3" runat="server" 
ControlToValidate="TextBox3" ValidationExpression="\d{10}"
ErrorMessage="10 digit require" ForeColor="Red"></asp:RegularExpressionValidator> 
    </td>
    
    </tr>
    
    <tr>
    <td>
        <asp:Button ID="Button1" runat="server" Text="Button" onclick="Button1_Click" /><asp:Label ID="Label1" runat="server"
            Text="Label"></asp:Label>

    </td>
    </tr>

    </table>
    </div>
    </form>
</body>
</html>
