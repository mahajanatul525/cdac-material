﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace _05controll_event
{
    public partial class _04validator_controll : System.Web.UI.Page
    {

        protected void Page_PreInit(object sender, EventArgs e)
        { Response.Write("Page_PreInit" + "<br/>"); }

        protected void Page_Init(object sender, EventArgs e)
        { Response.Write("Page_Init" + "<br/>"); }

        protected void Page_InitComplete(object sender, EventArgs e)
        { Response.Write("Page_InitComplete" + "<br/>"); }

        protected void Page_PreLoad(object sender, EventArgs e)
        { Response.Write("Page_PreLoad" + "<br/>"); }

        protected void Page_LoadComplete(object sender, EventArgs e)
        { Response.Write("Page_LoadComplete" + "<br/>"); }

        protected void Page_PreRender(object sender, EventArgs e)
        { Response.Write("Page_PreRender" + "<br/>"); }

        protected void Page_PreRenderComplete(object sender, EventArgs e)
        { Response.Write("Page_PreRenderComplete" + "<br/>"); }

        protected void Page_Unload(object sender, EventArgs e)
        {
            //Response.Write("Page_Unload" + "<br/>"); 
        }
        protected void Page_Load(object sender, EventArgs e)
        {
            Response.Write("page_loaded" + "<br/>");
        }

        protected void Button1_Click(object sender, EventArgs e)
        {
            Response.Write("button click" + "<br/>");
        }

        protected void TextBox1_TextChanged(object sender, EventArgs e)
        {
            Response.Write("text changes" + "<br/>");
        }
    }
}