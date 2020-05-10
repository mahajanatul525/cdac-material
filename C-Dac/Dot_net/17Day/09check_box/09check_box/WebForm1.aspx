<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="WebForm1.aspx.cs" Inherits="_09check_box.WebForm1" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
    <div style="font-family:Arial">
    <fieldset style="width:350px">

        <legend><b>Education</b></legend>

        <asp:CheckBox ID="GraduateCheckBox" Checked="true" Text="Graduate" runat="server" 
            oncheckedchanged="GraduateCheckBox_CheckedChanged" AutoPostBack="True" />
                
        <asp:CheckBox ID="PostGraduateCheckBox" Text="Post Graduate" runat="server" 
            AutoPostBack="True" />
      
          <asp:CheckBox ID="DoctrateCheckBox" Text="Doctrate" runat="server" />

    </fieldset>&nbsp;
    <br /><br />
    <asp:Button ID="Button1" runat="server" Text="Submit" onclick="Button1_Click" />
</div>

    </form>
</body>
</html>
