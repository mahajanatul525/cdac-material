﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace _04pagelife_cycle
{  
    public partial class page_lifecycle : System.Web.UI.Page
    {      
        protected void Page_PreInit(object sender, EventArgs e)
        {       Page.Init += Page_go;
          Response.Write("Page_PreInit" + "<br/>"); }
        protected void Page_go(object sender, EventArgs e)
        { Response.Write("Page_Init_go" + "<br/>"); }
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
          //  Response.Write("Page_Unload" + "<br/>"); 
        }

        protected void Page_Load(object sender, EventArgs e)
        {
            Response.Write("load" + "<br/>"); }

        protected void Button1_Click(object sender, EventArgs e)
        {

        }
        }
    }
