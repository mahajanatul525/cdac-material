using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Data.Entity;

namespace WebApplicationModel
{
    public partial class WebForm1 : System.Web.UI.Page
    {
        EmployeeContainer c;
        protected void Page_Load(object sender, EventArgs e)
        {
             c = new EmployeeContainer();
            var x= from m in c.Employees select m;
            GridView1.DataSource = x;
            GridView1.DataBind();

        }

        protected void Button1_Click(object sender, EventArgs e)
        {
            
            var rr = from m in c.Employees   select  new { nm = m.Fname, cc = m.Lname };
            foreach (var ee in rr)
            {
                Response.Write(ee.nm + " " + ee.cc +"<br/>");


            }
        }
    }
}