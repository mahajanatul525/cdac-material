using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace _01viewstate_demo
{
    public partial class WebForm1 : System.Web.UI.Page
    {
        int clickcount = 0;
        protected void Page_Load(object sender, EventArgs e)
        {
            if (!IsPostBack)
            {
                TextBox1.Text = "0";
            }

        }

        protected void Button1_Click(object sender, EventArgs e)
        {
            clickcount = clickcount + 1;
            TextBox1.Text = clickcount.ToString ();
        }

    }
}