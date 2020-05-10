using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace WebApplication1
{
    public partial class WebForm3 : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void btnTransfer_Click(object sender, EventArgs e)
        {
            //but if you use previouspage property of page class it will be able to red data of form enen if u put second parameter false
            
            Server.Transfer("~/webForm4.aspx",false);
        }

       
    }
}