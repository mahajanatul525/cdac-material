using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace _01viewstate_demo
{
    public partial class WebForm3 : System.Web.UI.Page
    {      
         protected void Page_Load(object sender, EventArgs e)
        {    
            if (!IsPostBack)
            {                TextBox1.Text = "0";
            
            }

        }
        protected void Button1_Click(object sender, EventArgs e)
        {  int clickcount = Convert.ToInt32(TextBox1.Text) + 1;
            TextBox1.Text = clickcount.ToString ();
            //TextBox1.Text = (int.Parse(TextBox1.Text) + 1).ToString();
        }
    }
}