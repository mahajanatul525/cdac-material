using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace WebApplication1
{
    public partial class WebForm2 : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {
            System.Collections.Specialized.NameValueCollection nameValueCollection =
                Request.Form;

            lblName.Text = nameValueCollection["txtName"];
            lblEmail.Text = nameValueCollection["txtEmail"];

            for (int i=0;  i  <  nameValueCollection.Count;   i++)
            {
                Response.Write(nameValueCollection[i] + "  " + "<br/>");
            
            }

        }
        }

}
