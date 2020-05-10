using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Text;
namespace _10radiobutton
{
    public partial class WebForm1 : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {
            if (!IsPostBack)
            {
                rdY.Focus();
            
            }
        }

        protected void rdY_CheckedChanged(object sender, EventArgs e)
        {
            Response.Write("Radio checked change");
        }

        protected void Button1_Click(object sender, EventArgs e)
        {
           String rs;
           if (rdY.Checked)
               rs = "you checked radio yes";
           else
               rs = "you checked radio no";

           Response.Write(rs);
        }
    }
}