<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="WebForm1.aspx.cs" Inherits="Webinsert_textdata.WebForm1" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>

<body>
    <form id="form1" runat="server">
    <div>
    <asp:textbox ID="Textbox1"  runat="server"></asp:textbox>
    <asp:textbox ID="Textbox2" runat="server"></asp:textbox>
    <asp:textbox ID="Textbox3" runat="server"></asp:textbox>
    </div>
        <asp:TextBox ID="Textbox4" runat="server"></asp:TextBox>
        <p>
        <asp:Button ID="Button1" runat="server" Text="Button" OnClick="Button1_Click" />
        </p>
    </form>
</body>
</html>
