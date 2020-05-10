using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace _05controll_event
{
    public partial class textchanged : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void Button1_Click(object sender, EventArgs e)
        {
            Response.Write("button clicked");
        }

        protected void TextBox1_TextChanged(object sender, EventArgs e)
        {
            Response.Write("text changes event");

        }
    }
}