using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace _30QuerString
{
    public partial class WebForm2 : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {
            // Read the QueryString values 
            lblName.Text = Request.QueryString["UserName"];
            lblEmail.Text = Request.QueryString["UserEmail"];
        }
    }
}