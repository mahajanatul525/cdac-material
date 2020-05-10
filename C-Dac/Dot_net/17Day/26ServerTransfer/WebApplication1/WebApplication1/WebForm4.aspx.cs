using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace WebApplication1
{
    public partial class WebForm4 : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {
            Page previousPage = Page.PreviousPage;
           if (previousPage != null)
           {
     TextBox previousPageNameTextBox = (TextBox)previousPage.FindControl("txtName");
                lblName.Text = previousPageNameTextBox.Text;

                TextBox previousPageEmailTextBox = (TextBox)previousPage.FindControl("txtEmail");
                lblEmail.Text = previousPageEmailTextBox.Text;
           }
           else
                lblName.Text = "you came to this page without login ,,,,,";

       }

    }
}