using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace _01viewstate_demo
{
    public partial class WebForm2 : System.Web.UI.Page
    {
        int clickcount = 1;
        protected void Page_Load(object sender, EventArgs e)
        {
            if (!IsPostBack)
            {
                TextBox1.Text = "0";
            
            }
        }

        protected void Button1_Click(object sender, EventArgs e)
        {
            if (ViewState["click"] != null)
            {
                clickcount = (int)ViewState["click"] + 1;
              
            }
            TextBox1.Text = clickcount.ToString(); ;
            ViewState["click"] = clickcount;

        }


    }
}