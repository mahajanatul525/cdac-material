using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace _05ispostback
{
    public partial class WebForm1 : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {
            if (IsPostBack)
            { Response.Write("page loaded 2nd ------ time"); }
            else
            Response.Write("page loaded 1st time");
        }

        protected void Button1_Click(object sender, EventArgs e)
        {
            Response.Write("button click 2nd post");

        }
    }
}