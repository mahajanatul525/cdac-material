using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace _26Server_execute
{
    public partial class WebForm2 : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {
   System.Collections.Specialized.NameValueCollection previousFormcollection =Request.Form;
            lblName.Text = previousFormcollection["txtName"];
            lblEmail.Text = previousFormcollection["txtEmail"];

            //Page previousPage = Page.PreviousPage;
            //if (previousPage != null)
            //{
            //    lblName.Text = ((TextBox)previousPage.FindControl("txtName")).Text;
            //    lblEmail.Text = ((TextBox)previousPage.FindControl("txtEmail")).Text;
            //}
        }
    }
}