<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="WebForm2.aspx.cs" Inherits="WebApplication.WebForm2" %>

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
            <b>Date</b>
        </td>
        <td>
            :
<asp:TextBox ID="txtDateofapplication" runat="server" Width="150px">
</asp:TextBox>
    
<asp:CompareValidator ID="CompareValidatorDateofbirth" runat="server" 
ErrorMessage="Date of application must be greater than 01/01/2012"
ControlToValidate="txtDateofapplication" ValueToCompare="01/01/2012"
Type="Date" Operator="GreaterThan" ForeColor="Red"
SetFocusOnError="true"></asp:CompareValidator>

  </td>    </tr>      <tr>
    <td>Age</td>    <td>
    <asp:TextBox ID="txtAge" runat="server" Width="150px"></asp:TextBox>
<asp:CompareValidator ID="CompareValidatorAge" runat="server" 
ErrorMessage="Age must be a number" ControlToValidate="txtAge" 
Operator="DataTypeCheck" Type="Integer" ForeColor="Red"
SetFocusOnError="true"></asp:CompareValidator> 

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
