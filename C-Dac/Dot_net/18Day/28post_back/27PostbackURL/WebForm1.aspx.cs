﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace _27PostbackURL
{
    public partial class WebForm1 : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {        }


        protected void Button1_Click(object sender, EventArgs e)
        {
            Server.Transfer("~/WebForm2.aspx");
        }

        protected void btnCrossPagePostback_Click(object sender, EventArgs e)
        {

        }
    }
}