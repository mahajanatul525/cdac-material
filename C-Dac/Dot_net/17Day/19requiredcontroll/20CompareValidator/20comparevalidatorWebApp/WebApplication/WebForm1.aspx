<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="WebForm1.aspx.cs" Inherits="WebApplication.WebForm1" %>

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
        <td>
            <b>Password</b>
        </td>
        <td>
            :<asp:TextBox ID="txtPassword" runat="server" Width="150px" TextMode="Password"></asp:TextBox>
        </td>
    </tr>
    <tr>
        <td>
            <strong>Retype Password</strong></td>
        <td>
            :<asp:TextBox ID="txtRetypePassword" runat="server" 
                Width="150px" TextMode="Password"></asp:TextBox>

           <asp:CompareValidator ID="CompareValidatorPassword" 
                runat="server"
            ErrorMessage="Password and Retype Password must match"
            ControlToValidate="txtRetypePassword"
                 ControlToCompare="txtPassword"
            Type="String" Operator="Equal" ForeColor="Red">
            </asp:CompareValidator>
        </td>
        </tr>
        <tr>
        <td> 
            <asp:Button ID="Button1" runat="server" Text="Button" onclick="Button1_Click" /> 
            <asp:Label ID="Label1" runat="server" Text="Label"></asp:Label>
            </td>
        </tr>
    
</table>
    
    </div>
    </form>
</body>
</html>
