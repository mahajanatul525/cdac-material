using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace _26Server_execute
{
    public partial class WebForm1 : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void btnExecute_Click(object sender, EventArgs e)
        {
            Server.Execute("~/WebForm2.aspx",false);
            lblStatus.Text = "The call returned after processing the second webform";
        }

        protected void btnExecuteToExternalWebsite_Click(object sender, EventArgs e)
        { //this will give you err
            //Server.Execute("http://www.vidyanidhi.com");
        }
    }
}