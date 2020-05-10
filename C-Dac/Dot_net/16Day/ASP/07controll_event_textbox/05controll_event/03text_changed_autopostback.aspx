<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="03text_changed_autopostback.aspx.cs" Inherits="_05controll_event.text_changed_autopostback" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
    <div>
        <asp:TextBox ID="TextBox1" runat="server" AutoPostBack="True" 
            ontextchanged="TextBox1_TextChanged"></asp:TextBox>
    </div>
    </form>
</body>
</html>
