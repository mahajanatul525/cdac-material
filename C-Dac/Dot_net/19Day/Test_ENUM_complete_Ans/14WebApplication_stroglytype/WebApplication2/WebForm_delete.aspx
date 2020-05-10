<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="WebForm_delete.aspx.cs" Inherits="WebApplication2.WebForm_delete" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
    <div>
        <asp:DropDownList ID="DropDownList1" runat="server"></asp:DropDownList>
    
              <asp:Button ID="Button1" runat="server" Text="Button" OnClick="Button1_Click" />
    
    </div>
        <hr />
        <h1>Search Employee</h1>
         <asp:RadioButton ID="RadioButton1" runat="server" GroupName="g" Text="Id" />
        <asp:RadioButton ID="RadioButton2" runat="server"  GroupName="g" Text="Name"/>
 
        
        <br />
        <asp:TextBox ID="TextBox1" runat="server"></asp:TextBox>
        <asp:Button ID="Search" runat="server" Text="Search" OnClick="Search_Click" />
        <asp:GridView ID="GridView1" runat="server">
        </asp:GridView>
    </form>
</body>
</html>
