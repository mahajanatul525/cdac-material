using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace WebApplication1
{
    public partial class WebForm1 : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void btnTransfer_Click(object sender, EventArgs e)
        {//pass second parameter false it will not presereve value
        Server.Transfer("~/webForm2.aspx",false);
        }

        protected void btnTransferToExternalWebsite_Click(object sender, EventArgs e)
        {
         //   Server.Transfer("Http://www.vidyanidhi.com"); you r not allowed to go out of domain
        }

        protected void Button1_Click(object sender, EventArgs e)
        {
            Response.Redirect("~/webForm2.aspx");
        }
    }
}