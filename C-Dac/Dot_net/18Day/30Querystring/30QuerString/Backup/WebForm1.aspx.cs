using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace _30QuerString
{
    public partial class WebForm1 : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void btnSendData_Click(object sender, EventArgs e)
        {
           
          //try to type Viat & nidhi
            //Response.Redirect("WebForm2.aspx?UserName=" + txtName.Text + "&UserEmail=" + txtEmail.Text);
   
                //Using Server.UrlEncode to encode &(ampersand)
  Response.Redirect("WebForm2.aspx?UserName=" + Server.UrlEncode(txtName.Text) + "&UserEmail=" + Server.UrlEncode(txtEmail.Text));
        }
    }
}