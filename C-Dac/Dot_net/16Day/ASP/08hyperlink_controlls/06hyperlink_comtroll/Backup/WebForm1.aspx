<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="WebForm1.aspx.cs" Inherits="_06hyperlink_comtroll.WebForm1" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
    <div>
        <asp:TextBox ID="TextBox1" runat="server"></asp:TextBox>
        <br />
        <asp:HyperLink ID="HyperLink1" runat="server" Text="go  to vita" 
            NavigateUrl="http://vidyanidhi.com" ImageUrl="~/images/aa.bmp" 
            Target="_blank" ToolTip="Click Me" Font-Names="Consolas" 
            ForeColor="#CC33FF"></asp:HyperLink>
    </div>
    </form>
</body>
</html>
