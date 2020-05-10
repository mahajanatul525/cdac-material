using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace WebApp
{
    public partial class WebForm1 : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void btnSubmit_Click(object sender, EventArgs e)
        {
            if (Page.IsValid)
            {
                lblStatus.Text = "Data is Valid";
                lblStatus.ForeColor = System.Drawing.Color.Green;


            }
            else
            {
                lblStatus.Text = "Data is not Valid";
                lblStatus.ForeColor = System.Drawing.Color.Red;


            }
        }
    }
}